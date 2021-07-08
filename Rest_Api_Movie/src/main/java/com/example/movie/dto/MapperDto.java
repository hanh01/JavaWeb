package com.example.movie.dto;

import com.example.movie.entity.FilmEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDto {
    FilmEntity convertToEntity(FilmDto filmDto);
    FilmDto convertToDto(FilmEntity filmEntity);
}
