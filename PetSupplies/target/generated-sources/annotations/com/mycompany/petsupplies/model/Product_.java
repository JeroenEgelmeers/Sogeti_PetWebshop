package com.mycompany.petsupplies.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, Double> price_euro;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile SingularAttribute<Product, String> description;
	public static volatile SingularAttribute<Product, Boolean> active;
	public static volatile SingularAttribute<Product, Long> id;
	public static volatile CollectionAttribute<Product, Product_in_category> categories;
	public static volatile CollectionAttribute<Product, Product_in_order> productOrders;

}

