package com.employes.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employes.Dao.EmployeRepository;
import com.employes.Entities.Employes;

@Service
@Transactional
public class EmployeMetierImplement implements EmployeMetier{

	@Autowired
	private EmployeRepository employeRepository;
	
	@Override
	public Employes addEmployer(Employes e) {
		employeRepository.save(e);
		return e;
	}

	@Override
	public List<Employes> listEmployes() {
		List<Employes> all=employeRepository.findAll();
		return all;
	}
	
	

}
