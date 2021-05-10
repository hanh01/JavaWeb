package com.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "attribute")
public class AttributeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;


    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "attributes")
    private List<ProductEntity> products;

    public AttributeEntity() {
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
