package model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return new HashSet<>(pets);
    }

}
