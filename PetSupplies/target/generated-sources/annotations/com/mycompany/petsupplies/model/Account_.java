package com.mycompany.petsupplies.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static volatile SingularAttribute<Account, String> address;
	public static volatile SingularAttribute<Account, String> city;
	public static volatile SingularAttribute<Account, Currency> accountCurrency;
	public static volatile SingularAttribute<Account, Language> language;
	public static volatile SingularAttribute<Account, String> password;
	public static volatile SingularAttribute<Account, String> full_name;
	public static volatile SingularAttribute<Account, Boolean> validated;
	public static volatile CollectionAttribute<Account, ClientOrder> orders;
	public static volatile SingularAttribute<Account, Long> id;
	public static volatile SingularAttribute<Account, String> postal_code;
	public static volatile SingularAttribute<Account, Account_role> accountRole;
	public static volatile SingularAttribute<Account, String> email;
	public static volatile SingularAttribute<Account, String> username;

}

