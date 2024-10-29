package com.xworkz.employee.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDto {
    private int id;
    private String name;
    private double salary;
    private String address;
    private String bloodGroup;
}
