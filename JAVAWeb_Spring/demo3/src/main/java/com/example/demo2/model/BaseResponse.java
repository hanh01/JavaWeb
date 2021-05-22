package com.example.demo2.model;

public class BaseResponse<T> {
    public int status = 1;
    public String message = "success";
    public T data;
}
