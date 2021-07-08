package com.example.movie.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "film")
public class FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "images")
    private String images;

    @Column(name = "description")
    private String description;

    @Column(name = "categoryId")
    private int categoryId;

    @ManyToOne
    @JoinColumn(name = "categoryId", insertable = false, updatable = false)
    private CategoryEntity category;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "director_film",
            joinColumns = @JoinColumn(name = "filmId"),
            inverseJoinColumns = @JoinColumn(name = "directorId")
    )
    private List<DirectorEntity> directors;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "cast_film",
            joinColumns = @JoinColumn(name = "filmId"),
            inverseJoinColumns = @JoinColumn(name = "castId")
    )
    private List<CastsEntity> casts;


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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<DirectorEntity> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorEntity> directors) {
        this.directors = directors;
    }

    public List<CastsEntity> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsEntity> casts) {
        this.casts = casts;
    }
}
