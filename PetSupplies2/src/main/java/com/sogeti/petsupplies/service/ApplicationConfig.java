/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sogeti.petsupplies.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author bhofsted
 */

@javax.ws.rs.ApplicationPath("rs")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.sogeti.petsupplies.NewCrossOriginResourceSharingFilter.class);
        resources.add(com.sogeti.petsupplies.service.ProductCategoryFacadeREST.class);
        resources.add(com.sogeti.petsupplies.service.ProductFacadeREST.class);
    }
}
