package com.example.Assignment1.Services;

import com.example.Assignment1.Dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    Map<String,Object> employeeDetails = new HashMap<String,Object>();

   public Map<String,Object> getAllEmployees()
    {
        return employeeDetails;
    }

    public Map<String, Object> getEmployee(Integer id) {
       if (!employeeDetails.containsValue(id))
           return null;
       return employeeDetails;
    }

    public String addEmployee(EmployeeDto employeeDto) {
       employeeDetails.put("EmployeeID",employeeDto.getId());
       employeeDetails.put("EmployeeName",employeeDto.getName());
       employeeDetails.put("EmployeeEmail",employeeDto.getEmail());
       employeeDetails.put("EmployeeLocation",employeeDto.getLocation());
       return "Employee Saved!";
    }

    public String updateEmployee(Integer id, EmployeeDto employeeDto) {
        if (!employeeDetails.containsValue(id))
            return "Employee doesn't exists!";
        employeeDetails.put("EmployeeID",id);
        employeeDetails.put("EmployeeName",employeeDto.getName());
        employeeDetails.put("EmployeeEmail",employeeDto.getEmail());
        employeeDetails.put("EmployeeLocation",employeeDto.getLocation());
       return "Employee updated!";
    }

    public String deleteEmployee(Integer id) {
        if (!employeeDetails.containsValue(id))
            return "Employee doesn't exists!";
       employeeDetails.clear();
       return "Employee deleted successfully!";
    }
}
