package com.petShop.web.controller;

import com.petShop.domain.ProductsDomain;
import com.petShop.domain.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping
    public List<ProductsDomain> getAllProducts() {
        return productsService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductsDomain> getProductById(@PathVariable Integer id) {
        return productsService.getProduct(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProductsDomain> createProduct(@RequestBody ProductsDomain productDomain) {
        ProductsDomain createdProduct = productsService.save(productDomain);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductsDomain> updateProduct(@PathVariable Integer id, @RequestBody ProductsDomain productDomain) {
        productDomain.setId(id); // Set the ID to the request path ID
        ProductsDomain updatedProduct = productsService.save(productDomain);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        return productsService.delete(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
