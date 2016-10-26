/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.petsupplies.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
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
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String username;
    private String password;
    private String full_name;
    private String address;
    private String postal_code;
    private String city;
    @Column(unique = true)
    private String email;
    private boolean validated;
    
    @ManyToOne
    private Currency accountCurrency;
    
    @ManyToOne
    private Account_role accountRole;
    
    @ManyToOne
    private Language language;
    
    @OneToMany(mappedBy = "orderAccount")
    private Collection<ClientOrder> orders;

    public Account() {
    }

    public Account(Long id, String username, String password, String full_name, String address, String postal_code, String city, String email, boolean validated, Currency accountCurrency, Account_role accountRole, Language language, Collection<ClientOrder> orders) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.full_name = full_name;
        this.address = address;
        this.postal_code = postal_code;
        this.city = city;
        this.email = email;
        this.validated = validated;
        this.accountCurrency = accountCurrency;
        this.accountRole = accountRole;
        this.language = language;
        this.orders = orders;
    }

    public Collection<ClientOrder> getOrders() {
        return orders;
    }

    public void setOrders(Collection<ClientOrder> orders) {
        this.orders = orders;
    }

 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public Currency getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(Currency accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public Account_role getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(Account_role accountRole) {
        this.accountRole = accountRole;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.petsupplies.model.Account[ id=" + id + " ]";
    }
    
}
