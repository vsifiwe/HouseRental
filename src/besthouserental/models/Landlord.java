package besthouserental.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Landlord extends UserAUth {

    @OneToMany(mappedBy="landlord" ,fetch=FetchType.EAGER)
    List<House> houses=new ArrayList<>();

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
    
    public Landlord() {
    }

    public Landlord(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
    }
    
   
}
