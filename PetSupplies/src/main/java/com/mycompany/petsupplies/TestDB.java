/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies;

import com.mycompany.petsupplies.model.Product_category;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bhofsted
 */
public class TestDB {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PetSupplies");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        Product_category category1 = new Product_category(null, "For Doges");
        manager.persist(category1);
        manager.getTransaction().commit();
    }
}
