package com.example.demo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @Builder
    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate, Set<Visit> visits) {
        super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;

        if (visits == null || visits.size() > 0 ) {
            this.visits = visits;
        }
    }

    @Column (name = "name")
    private String name;

    @ManyToOne
    @JoinColumn (name ="type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn (name = "owner_id")
    private Owner owner;

    @DateTimeFormat ( pattern = "yyyy-mm-dd")
    @Column (name ="dateOfBirth")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    Set <Visit> visits = new HashSet<>();

}