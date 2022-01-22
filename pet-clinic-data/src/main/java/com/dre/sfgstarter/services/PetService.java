package com.dre.sfgstarter.services;

import com.dre.sfgstarter.model.Owner;
import com.dre.sfgstarter.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findbyId(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
