package model;

public class PetType extends BaseEntity{

private String name;

public String getName(){
    return name;
}

public void setName(String petType){
    this.name=petType;
}

}
