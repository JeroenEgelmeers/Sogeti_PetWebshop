/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sogeti.petsupplies;

import facades.ProductFacade;
import com.sogeti.petsupplies2.model.Product;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bhofsted
 */
public class InitDB {

    ProductFacade facade = lookupProductFacadeBean();

    public void testDB() {
        Product product1 = new Product(12l, "name", "description", 5, true);
        facade.create(product1);
    }

    private ProductFacade lookupProductFacadeBean() {
        try {
            Context c = new InitialContext();
            return (ProductFacade) c.lookup("java:global/com.sogeti_PetSupplies2_war_1.0-SNAPSHOT/ProductFacade!com.sogeti.petsupplies.ProductFacade");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
