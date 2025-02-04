package com.example.Assignment1.Repo;

import com.example.Assignment1.Controller.Employee;
import com.example.Assignment1.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {

}
