package Models;
// Generated Oct 28, 2020 1:56:33 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Owner generated by hbm2java
 */
public class Owner  implements java.io.Serializable {


     private int ownerId;
     private String firstName;
     private String lastName;
     private Integer phone;
     private Set properties = new HashSet(0);

    public Owner() {
    }

	
    public Owner(int ownerId) {
        this.ownerId = ownerId;
    }
    public Owner(int ownerId, String firstName, String lastName, Integer phone, Set properties) {
       this.ownerId = ownerId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.phone = phone;
       this.properties = properties;
    }
   
    public int getOwnerId() {
        return this.ownerId;
    }
    
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getPhone() {
        return this.phone;
    }
    
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    public Set getProperties() {
        return this.properties;
    }
    
    public void setProperties(Set properties) {
        this.properties = properties;
    }




}


