package com.ems.dao;

import com.ems.entities.Employee;
import com.ems.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class EmployeeDAO {

	public void save(Employee employee) {
		EntityManager entityManager = JPAUtil.getEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        entityManager.persist(employee);

        entityTransaction.commit();

        entityManager.close();
	}

	 public Employee findByEmail(String email) {

	        EntityManager entityManager = JPAUtil.getEntityManager();

	        String jpql = "SELECT e FROM Employee e WHERE e.email = :email";

	        TypedQuery<Employee> query =
	                entityManager.createQuery(jpql, Employee.class);

	        query.setParameter("email", email);

	        try {
	            return query.getSingleResult();
	        } catch (NoResultException e) {
	            return null;
	        } finally {
	            entityManager.close();
	        }
	    }

}
