package com.ems.dao;

import com.ems.entities.Admin;
import com.ems.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class AdminDAO {

    public void save(Admin admin) {

        EntityManager em = JPAUtil.getEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        em.persist(admin);

        et.commit();

        em.close();

    }

    public Admin findByEmail(String email) {

        EntityManager em = JPAUtil.getEntityManager();

        String jpql = "SELECT a FROM Admin a WHERE a.email=:email";

        TypedQuery<Admin> query =
                em.createQuery(jpql, Admin.class);

        query.setParameter("email", email);

        try {

            return query.getSingleResult();

        }

        catch (NoResultException e) {

            return null;

        }

        finally {

            em.close();

        }

    }

}