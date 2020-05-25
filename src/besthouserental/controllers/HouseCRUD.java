package besthouserental.controllers;

import besthouserental.hibernate.AccessHibernate;
import besthouserental.models.House;
import javax.swing.JOptionPane;

import org.hibernate.Session;



public class HouseCRUD {
   AccessHibernate accessHibernate=new AccessHibernate();
    public void insert(House house){
        Session session=accessHibernate.openSession();
        session.save(house);
        accessHibernate.closeConnection(session);
        

    }
    public void getHouses(){
        


    }

    public void delete(int id){
      


    }
    public void update(int id,House house){
        
    }
}
