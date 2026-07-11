package com.ems.config;

import com.ems.dao.AdminDAO;
import com.ems.entities.Admin;

public class AdminDataLoader {

    public static void main(String[] args) {

        Admin admin = new Admin();

        admin.setName("Administrator");
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin123");

        AdminDAO dao = new AdminDAO();

        dao.save(admin);

        System.out.println("Admin Created Successfully");

    }

}