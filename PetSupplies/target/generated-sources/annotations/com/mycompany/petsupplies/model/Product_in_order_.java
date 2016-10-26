package com.mycompany.petsupplies.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product_in_order.class)
public abstract class Product_in_order_ {

	public static volatile SingularAttribute<Product_in_order, Integer> amount;
	public static volatile SingularAttribute<Product_in_order, Double> price;
	public static volatile SingularAttribute<Product_in_order, Product_in_orderPK> product_in_orderPK;
	public static volatile SingularAttribute<Product_in_order, Currency> currency;

}

