package com.petShop.persistance;

import com.petShop.persistance.crud.ProductsCrudRepository;
import com.petShop.persistance.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductsRepository  {


    @Autowired
    private ProductsCrudRepository productsCrudRepository;

    // Método para encontrar productos por ID de categoría
    public List<Products> getAll() {
        return (List<Products>) productsCrudRepository.findAll();
    }

    public Products save(Products products) {
        return productsCrudRepository.save(products);
    }

    public boolean existsProducts(int id) {
        return productsCrudRepository.existsById(id);
    }

    public long countAll() {
        return productsCrudRepository.count();
    }

    public Optional<Products> getProductById(int id) {
        return productsCrudRepository.findById(id);
    }

  }


