/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author bhofsted
 */
@Entity
public class Product_in_category implements Serializable {

@EmbeddedId
private Product_in_categoryPK product_in_categoryPK;

    public Product_in_category() {
    }

    public Product_in_category(Product_in_categoryPK product_in_categoryPK) {
        this.product_in_categoryPK = product_in_categoryPK;
    }

    public Product_in_categoryPK getProduct_in_categoryPK() {
        return product_in_categoryPK;
    }

    public void setProduct_in_categoryPK(Product_in_categoryPK product_in_categoryPK) {
        this.product_in_categoryPK = product_in_categoryPK;
    }

}
