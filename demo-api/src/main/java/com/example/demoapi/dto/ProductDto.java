package com.example.demoapi.dto;

import com.example.demoapi.entity.AttributeEntity;
import com.example.demoapi.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private int categoryId;

    @ManyToOne()
    @JoinColumn(name = "categoryId", insertable = false, updatable = false)
    private CategoryEntity category;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_attribute",
            joinColumns = @JoinColumn(name = "productId"),
            inverseJoinColumns = @JoinColumn(name = "attributeId")
    )
    private List<AttributeEntity> attributes;

}
