package com.proj.employee_management.repository;

import com.proj.employee_management.entity.emplyee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeerepository extends JpaRepository<emplyee, Long>{

}
