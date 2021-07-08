package com.example.ss8.dto;

public class BaseResponse<T> {
    public int status = 1;
    public String message = "success";
    public T data;
}
