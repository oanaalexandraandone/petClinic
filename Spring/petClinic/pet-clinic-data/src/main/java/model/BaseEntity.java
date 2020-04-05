package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class BaseEntity implements Serializable {

    //todo rewatch BaseEntity video and adapt code to generate automatically id

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }
    public boolean isNew() {
        return this.id == null;
    }

    public void setId(Long id){
        this.id=id;
    }


}
