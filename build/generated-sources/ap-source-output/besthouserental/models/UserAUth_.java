package besthouserental.models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserAUth.class)
public abstract class UserAUth_ {

	public static volatile SingularAttribute<UserAUth, String> firstName;
	public static volatile SingularAttribute<UserAUth, String> lastName;
	public static volatile SingularAttribute<UserAUth, String> password;
	public static volatile SingularAttribute<UserAUth, Integer> id;
	public static volatile SingularAttribute<UserAUth, String> email;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PASSWORD = "password";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

