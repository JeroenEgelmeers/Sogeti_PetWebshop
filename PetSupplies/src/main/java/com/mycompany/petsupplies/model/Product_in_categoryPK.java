/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author bhofsted
 */
@Embeddable
public class Product_in_categoryPK implements Serializable {

    @ManyToOne
    protected Product_category productCategory;

    @ManyToOne
    protected Product product;

    public Product_in_categoryPK() {
    }

    public Product_in_categoryPK(Product_category productCategory, Product product) {
        this.productCategory = productCategory;
        this.product = product;
    }

    public Product_category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Product_category productCategory) {
        this.productCategory = productCategory;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
