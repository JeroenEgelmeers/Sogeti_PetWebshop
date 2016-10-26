/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author bhofsted
 */
@Entity
public class Product_in_order implements Serializable {

    private static final long serialVersionUID = 1L;
    private int amount;
    private double price;

    @Id
    @ManyToOne
    private ClientOrder clientOrder;
    
    @Id
    @ManyToMany
    private Collection<Product> products;

    @ManyToOne
    private Currency currency;

    public Product_in_order() {
    }

    public Product_in_order(int amount, double price, ClientOrder clientOrder, Collection<Product> products, Currency currency) {
        this.amount = amount;
        this.price = price;
        this.clientOrder = clientOrder;
        this.products = products;
        this.currency = currency;
    }

    public ClientOrder getOrder() {
        return clientOrder;
    }

    public void setOrder(ClientOrder order) {
        this.clientOrder = order;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
