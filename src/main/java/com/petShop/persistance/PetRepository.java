package com.petShop.persistance;

import com.petShop.persistance.crud.PetCrudRepository;
import com.petShop.persistance.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository {

    @Autowired
    private PetCrudRepository petCrudRepository;

    public List<Pet> getAll() {
        return (List<Pet>) (List<Pet>) petCrudRepository.findAll();
    }

    public Pet save(Pet pet) {
        return petCrudRepository.save(pet);
    }

    public void delete(int id) {
        petCrudRepository.deleteById(id);
    }

    public boolean existsPet(int id) {
        return petCrudRepository.existsById(id);
    }

    public long countAll() {
        return petCrudRepository.count();
    }

    public Optional<Pet> getPetById(int id) {
        return petCrudRepository.findById(id);
    }

    public List<Pet> findBySpecies(String species) {
        return petCrudRepository.findBySpeciesOrderByNameAsc(species);
    }

    public List<Pet> findByBreedOrderByBreedAsc(String breed) {
        return petCrudRepository.findByBreedOrderByBreedAsc(breed);
    }

    public List<Pet> findByAgeLessThan(int age) {
        return petCrudRepository.findByAgeLessThan(age);
    }
}
