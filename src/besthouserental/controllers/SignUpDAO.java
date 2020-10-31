/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besthouserental.controllers;

import besthouserental.hibernate.AccessHibernate;
import besthouserental.models.House;
import besthouserental.models.UserAUth;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author esther
 */
public class RegistrationDAO {
    AccessHibernate accessHibernate=new AccessHibernate();
    
    public void create(UserAUth user){
        Session session=accessHibernate.openSession();
        session.save(user);
        accessHibernate.closeConnection(session);
   

    }
    
    public boolean login(String email,String password){
        Session session=accessHibernate.openSession();

                UserAUth userFound=session.get(UserAUth.class,email);

                if(userFound!=null){
                    if(checkPassword(password,userFound.getPassword())){
                        return true;
                    }
                    else
                       return false;
                }
              
                else
                return false;    
                
    }
    
    private boolean checkPassword(String password,String hashedPassword){
        if(BCrypt.checkpw(password,hashedPassword)){
            return true;
        }
        else
            return false;
    }
    
}
