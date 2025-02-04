package com.example.Assignment1.Controller;

import com.example.Assignment1.Dto.EmployeeDto;
import com.example.Assignment1.Services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Employee {
    @Autowired
    EmployeeService employeeService;

    EmployeeDto employeeDto;

    @GetMapping("/getEmployees")
    Map<String,Object> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getEmployee/{id}")
    Map<String,Object> getEmployee(@PathVariable Integer id)
    {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/addEmployee")
    String addEmployee(@RequestBody EmployeeDto employeeDto)
    {
        return employeeService.addEmployee(employeeDto);
    }

    @PutMapping("/updateEmployee/{id}")
    String updateEmployee(@PathVariable Integer id,@RequestBody EmployeeDto employeeDto)
    {
       return employeeService.updateEmployee(id,employeeDto);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    String deleteEmployee(@PathVariable Integer id)
    {
        return employeeService.deleteEmployee(id);
    }
}
