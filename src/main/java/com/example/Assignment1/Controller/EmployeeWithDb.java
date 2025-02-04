package com.example.Assignment1.Controller;

import com.example.Assignment1.Dto.EmployeeDto;
import com.example.Assignment1.Services.EmployeeDbService;
import com.example.Assignment1.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.AbstractDocument;
import java.util.List;

@RestController
public class EmployeeWithDb {
    @Autowired
    EmployeeDbService employeeDbService;
    EmployeeDto employeeDto;
    @GetMapping("/")
    String displayForm()
    {
        return "index";
    }
    @PostMapping("/addEmployeeInDb")
    String addEmployeeInDb(@RequestBody EmployeeDto employeeDto)
    {
        return employeeDbService.addEmployeeInDb(employeeDto);
    }
    @GetMapping("/getAllEmployees")
    List<EmployeeDto> getAllEmployees()
    {
        return employeeDbService.getAllEmployees();
    }

}
