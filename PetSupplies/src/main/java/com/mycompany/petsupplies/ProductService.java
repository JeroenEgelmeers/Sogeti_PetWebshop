/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies;

import com.mycompany.petsupplies.model.Product;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bhofsted
 */
@Stateless
public class ProductService {
    
//    @PersistenceContext(unitName = "petSupplies")
//    private EntityManager entityManager;
    
    public void doSomething() {
        Product a = new Product();
        a.setId(1324l);
        
//        entityManager.persist(a);
                
    }
    
}
