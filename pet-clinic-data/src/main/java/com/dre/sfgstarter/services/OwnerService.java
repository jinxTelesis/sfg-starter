package com.dre.sfgstarter.services;

import com.dre.sfgstarter.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findbyId(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
