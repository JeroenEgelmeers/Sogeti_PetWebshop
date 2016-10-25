/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author bhofsted
 */
@Embeddable
public class Order_addressPK implements Serializable {

    protected String address;
    protected String postal_code;
    protected String city;

    public Order_addressPK() {
    }

    public Order_addressPK(String address, String postal_code, String city) {
        this.address = address;
        this.postal_code = postal_code;
        this.city = city;
    }

}
