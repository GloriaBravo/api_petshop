package com.petShop.persistance.crud;

import com.petShop.persistance.entity.Suppliers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SuppliersCrudRepository extends CrudRepository <Suppliers, Integer> {


    List<Suppliers> findByAddress(String address);


    List<Suppliers> findByFirstName(String firstName);

    Suppliers findByEmail(String email);

    List<Suppliers> findByPhone(String phone);
}
