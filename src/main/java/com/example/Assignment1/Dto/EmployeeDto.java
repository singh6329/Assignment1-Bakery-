package com.example.Assignment1.Dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    Integer id;
    String name;
    String email;
    String location;
}
