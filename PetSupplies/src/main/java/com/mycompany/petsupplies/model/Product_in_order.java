/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    
    @EmbeddedId
    private Product_in_orderPK product_in_orderPK;

    @ManyToOne
    private Currency currency;

    public Product_in_order() {
    }

    public Product_in_order(int amount, double price, Product_in_orderPK product_in_orderPK, Currency currency) {
        this.amount = amount;
        this.price = price;
        this.product_in_orderPK = product_in_orderPK;
        this.currency = currency;
    }

    public Product_in_orderPK getProduct_in_orderPK() {
        return product_in_orderPK;
    }

    public void setProduct_in_orderPK(Product_in_orderPK product_in_orderPK) {
        this.product_in_orderPK = product_in_orderPK;
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
