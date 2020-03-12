package com.employes.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employes.Entities.Employes;

public interface EmployeRepository extends JpaRepository<Employes,Long>{
}
