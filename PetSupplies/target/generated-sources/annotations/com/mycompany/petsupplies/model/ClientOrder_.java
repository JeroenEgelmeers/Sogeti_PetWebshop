package com.mycompany.petsupplies.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClientOrder.class)
public abstract class ClientOrder_ {

	public static volatile SingularAttribute<ClientOrder, Order_address> order_address;
	public static volatile SingularAttribute<ClientOrder, Order_status> orderStatus;
	public static volatile SingularAttribute<ClientOrder, Long> id;
	public static volatile SingularAttribute<ClientOrder, Account> orderAccount;
	public static volatile CollectionAttribute<ClientOrder, Product_in_order> orderedProducts;

}

