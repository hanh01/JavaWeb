package com.example.dohonghanh.dto;

import com.example.dohonghanh.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDto {
    ProductEntity convertToEntity(ProductDto productDto);
    ProductDto convertToDto(ProductEntity productEntity);
}
