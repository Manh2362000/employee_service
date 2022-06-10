package com.example.employee_service.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee {
    private int id;
    private String name;
    private Double salary;
}