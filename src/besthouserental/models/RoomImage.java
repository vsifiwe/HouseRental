package besthouserental.models;

import javax.persistence.Embeddable;

@Embeddable
public class RoomImage {
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
