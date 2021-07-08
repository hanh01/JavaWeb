package com.example.ss8.dto;

import com.example.ss8.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDto {
    UserEntity convertToEntity(UserDto userDto);
    UserDto convertToDto(UserEntity userEntity);
}
