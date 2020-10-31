/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ineza
 */
public class property {
    
    public static void main(String[] args) {
        Session session = util.connect.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Models.Property property = new Models.Property();
        Models.Owner owner = new Models.Owner();
        owner.setOwnerId(3);
        
        property.setOwner(owner);
        property.setPropertyId(5);
        property.setDistrict("Gasabo");
        property.setPrice(20000);
        property.setAvailable(true);
        
        
        session.save(property);
        transaction.commit();
        
        System.out.println("Done.....");
        
        session.close();
        transaction = null;
        
        
    }
    
}
