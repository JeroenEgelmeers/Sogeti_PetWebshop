/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author bhofsted
 */
@Entity
public class ClientOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Order_status orderStatus;

    @ManyToOne
    private Account orderAccount;

    @ManyToOne
    private Order_address order_address;
    
    @OneToMany(mappedBy = "clientOrder")
    private Collection<Product_in_order> orderedProducts;

    public ClientOrder() {
    }

    public ClientOrder(Long id, Order_status orderStatus, Account orderAccount, Order_address order_address, Collection<Product_in_order> orderedProducts) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.orderAccount = orderAccount;
        this.order_address = order_address;
        this.orderedProducts = orderedProducts;
    }
    public Collection<Product_in_order> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(Collection<Product_in_order> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public Order_address getOrder_address() {
        return order_address;
    }

    public void setOrder_address(Order_address order_address) {
        this.order_address = order_address;
    }

    public Account getOrderAccount() {
        return orderAccount;
    }

    public void setOrderAccount(Account orderAccount) {
        this.orderAccount = orderAccount;
    }

    public Order_status getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Order_status orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientOrder)) {
            return false;
        }
        ClientOrder other = (ClientOrder) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "com.mycompany.petsupplies.model.Order[ id=" + id + " ]";
    }

}
