package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass

public class BaseEntity implements Serializable {

    //todo rewatch BaseEntity video and adapt code to generate automatically id

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    public boolean isNew() {
        return this.id == null;
    }


}
