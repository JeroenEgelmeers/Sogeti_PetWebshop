/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies;

import com.mycompany.petsupplies.model.Product;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bhofsted
 */
public class TestDB {

    public static void main(String[] args) throws NamingException {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PetSuppliesDB");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        Product product1 = new Product(12l, "name", "description", 5, true);
        manager.persist(product1);
        manager.getTransaction().commit();
    }
}
