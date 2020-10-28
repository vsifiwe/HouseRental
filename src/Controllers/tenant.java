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
public class tenant {
    
    public static void CreateTenant (Models.Tenant tenant){
        Session session = util.connect.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(tenant);
        transaction.commit();
        session.close();
        transaction = null;
    }
    
}
