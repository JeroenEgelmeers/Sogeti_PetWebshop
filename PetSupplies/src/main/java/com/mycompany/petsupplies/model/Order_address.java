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
public class Order_address implements Serializable {

    @EmbeddedId
    private Order_addressPK order_addressPK;

    public Order_address() {
    }

    public Order_address(Order_addressPK order_addressPK) {
        this.order_addressPK = order_addressPK;
    }

    public Order_addressPK getOrder_addressPK() {
        return order_addressPK;
    }

    public void setOrder_addressPK(Order_addressPK order_addressPK) {
        this.order_addressPK = order_addressPK;
    }
}