package com.example.demo.responseStructure;



public class ResponseStructure<T> {

    private int status;
    private String message;
    private T data;

    // Constructors
    public ResponseStructure() {
    }

    public ResponseStructure(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // Getters and Setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
