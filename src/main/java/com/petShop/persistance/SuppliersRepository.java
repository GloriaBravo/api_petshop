package com.petShop.persistance;

import com.petShop.persistance.crud.SuppliersCrudRepository;
import com.petShop.persistance.entity.Suppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SuppliersRepository {

    @Autowired
    private SuppliersCrudRepository suppliersCrudRepository;

    public List<Suppliers> getAll() {
        return (List<Suppliers>) suppliersCrudRepository.findAll();
    }

    public Suppliers save(Suppliers suppliers) {
        return suppliersCrudRepository.save(suppliers);
    }

    public void delete(int id) {
        suppliersCrudRepository.deleteById(id);
    }

    public boolean existsSuppliers(int id) {
        return suppliersCrudRepository.existsById(id);
    }

    public long countAll() {
        return suppliersCrudRepository.count();
    }

    public Optional<Suppliers> getSuppliersById(int id) {
        return suppliersCrudRepository.findById(id);
    }

    // 1. Encontrar proveedores por nombre
    public List<Suppliers> findByFirstName(String firstName) {
        return suppliersCrudRepository.findByFirstName(firstName);
    }

    // 2. Encontrar proveedores por correo electrónico
    public Suppliers findByEmail(String email) {
        return suppliersCrudRepository.findByEmail(email);
    }

    // 3. Encontrar proveedores por teléfono
    public List<Suppliers> findByPhone(String phone) {
        return suppliersCrudRepository.findByPhone(phone);
    }

    // 4. Encontrar proveedores por dirección
    public List<Suppliers> findByAddress(String address) {
        return suppliersCrudRepository.findByAddress(address);
    }
}

