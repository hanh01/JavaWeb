package com.example.ss8.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int id;
    @NotBlank(message = "Name not blank")
    private String name;
    private String phone;
    @Min(value = 18, message = "Min is 18")
    private int age;
    private boolean isVip;
}
