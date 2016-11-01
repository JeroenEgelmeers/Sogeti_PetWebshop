/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import com.sogeti.petsupplies2.model.Product_category;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BHOFSTED
 */
@Stateless
public class Product_categoryFacade extends AbstractFacade<Product_category> {

    @PersistenceContext(unitName = "PetSuppliesDB")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Product_categoryFacade() {
        super(Product_category.class);
    }
    
}
