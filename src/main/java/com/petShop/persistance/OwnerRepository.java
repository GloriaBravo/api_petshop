package com.petShop.persistance;

import com.petShop.persistance.crud.OwnerCrudRepository;
import com.petShop.persistance.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OwnerRepository {

    private final OwnerCrudRepository ownerCrudRepository;

    @Autowired
    public OwnerRepository(OwnerCrudRepository ownerCrudRepository) {
        this.ownerCrudRepository = ownerCrudRepository;
    }

    public List<Owner> getAll() {
        return (List<Owner>) ownerCrudRepository.findAll();
    }

    public Owner save(Owner owner) {
        return ownerCrudRepository.save(owner);
    }

    public void delete(int id) {
        ownerCrudRepository.deleteById(id);
    }

    public boolean existsOwner(int id) {
        return ownerCrudRepository.existsById(id);
    }

    public long countAll() {
        return ownerCrudRepository.count();
    }

    public Optional<Owner> getOwnerById(int id) {
        return ownerCrudRepository.findById(id);
    }

    public List<Owner> listarTodoslosPropietarios() {
        return (List<Owner>) ownerCrudRepository.findAll();
    }

    public Owner actualizarPropietario(Integer id, Owner updateOwner) {
        if (ownerCrudRepository.existsById(id)) {
            updateOwner.setId(id);
            return ownerCrudRepository.save(updateOwner);
        }
        return null;
    }
}
