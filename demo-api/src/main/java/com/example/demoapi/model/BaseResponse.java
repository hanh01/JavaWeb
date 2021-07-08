package com.example.demoapi.model;

public class BaseResponse<T> {
    public int code = 1;
    public String message = "success";
    public T data;
}
