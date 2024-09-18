package com.petShop.persistance.crud;

import com.petShop.persistance.entity.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetCrudRepository extends CrudRepository<Pet, Integer> {


    List<Pet> findBySpeciesOrderByNameAsc(String species);

    List<Pet> findBySpeciesOrderByBreedAsc(String breed);


    List<Pet> findByAgeLessThan(int age);

    List<Pet> findByBreedOrderByBreedAsc(String breed);
}

