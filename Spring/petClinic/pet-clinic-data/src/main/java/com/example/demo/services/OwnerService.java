package com.example.demo.services;

import com.example.demo.model.Owner;

import java.util.List;

public interface OwnerService extends CrudInterface<Owner, Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastName (String lastName);
}
