package com.petShop.domain.service;

import com.petShop.domain.ProductsDomain;
import com.petShop.persistance.ProductsRepository;
import com.petShop.persistance.entity.Products;
import com.petShop.persistance.entity.Suppliers;
import com.petShop.persistance.mapper.ProductsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private ProductsMapper productsMapper;

    public List<ProductsDomain> getAll() {
        return productsRepository.findAll().stream()
                .map(productsMapper::toDomain)
                .collect(Collectors.toList());
    }

    public Optional<ProductsDomain> getProduct(int productId) {
        return productsRepository.findById(productId)
                .map(productsMapper::toDomain);
    }

    public List<ProductsDomain> getByCategory(int categoryId) {
        return productsRepository.findByCategoryId(categoryId).stream()
                .map(productsMapper::toDomain)
                .collect(Collectors.toList());
    }

    public List<ProductsDomain> getBySupplier(Suppliers supplier) {
        return productsRepository.findBySupplier(supplier).stream()
                .map(productsMapper::toDomain)
                .collect(Collectors.toList());
    }

    public ProductsDomain save(ProductsDomain productDomain) {
        Products product = productsMapper.toEntity(productDomain);
        Products savedProduct = productsRepository.save(product);
        return productsMapper.toDomain(savedProduct);
    }

    public boolean delete(int productId) {
        if (productsRepository.existsById(productId)) {
            productsRepository.deleteById(productId);
            return true;
        }
        return false;
    }
}
