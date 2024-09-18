package com.petShop.persistance.mapper;

import com.petShop.persistance.entity.Products;
import com.petShop.persistance.dto.ProductsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductsMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "stocks", target = "stocks")
    })
    ProductsDTO toDTO(Products product);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "stocks", target = "stocks")
    })
    Products toEntity(ProductsDTO productDTO);
}
