package com.example.movie.dto;

import com.example.movie.entity.CastsEntity;
import com.example.movie.entity.CategoryEntity;
import com.example.movie.entity.DirectorEntity;
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
public class FilmDto {
    private int id;
    private String name;
    private String images;
    private String description;
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

}
