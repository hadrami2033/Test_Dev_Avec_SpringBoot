package com.employes.Metier;

import java.util.List;

import com.employes.Entities.Employes;

public interface EmployeMetier {
	
	public Employes addEmployer(Employes e);
	public List<Employes> listEmployes();

}
