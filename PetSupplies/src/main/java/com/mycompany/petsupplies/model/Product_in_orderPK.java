/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author bhofsted
 */
@Embeddable
public class Product_in_orderPK implements Serializable {
    @ManyToOne
    protected ClientOrder clientOrder;
    
    @ManyToMany
    protected Collection<Product> products;

    public Product_in_orderPK() {
    }

    public Product_in_orderPK(ClientOrder clientOrder, Collection<Product> products) {
        this.clientOrder = clientOrder;
        this.products = products;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(ClientOrder clientOrder) {
        this.clientOrder = clientOrder;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
