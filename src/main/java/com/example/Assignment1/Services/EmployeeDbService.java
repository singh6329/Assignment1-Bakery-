package com.example.Assignment1.Services;

import com.example.Assignment1.Dto.EmployeeDto;
import com.example.Assignment1.Entity.EmployeeEntity;
import com.example.Assignment1.Repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class EmployeeDbService {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    ModelMapper modelMapper;

    public String addEmployeeInDb(EmployeeDto employeeDto) {
       EmployeeEntity employeeEntitytoBeSaved = modelMapper.map(employeeDto, EmployeeEntity.class);
        employeeRepo.save(employeeEntitytoBeSaved);
        return "employeeSavedSuccessfully";
    }

    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeEntity> employeeEntities =  employeeRepo.findAll();
        return employeeEntities.stream().map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDto.class)).collect(Collectors.toList());
    }
}
