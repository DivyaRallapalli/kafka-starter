package com.example.kafka.Requests;

import lombok.Data;

@Data
public class PetRequest {
    private String name;
    private int age;
    private String color;
}
