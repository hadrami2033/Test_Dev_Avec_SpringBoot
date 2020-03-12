package com.employes.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.employes.Dao.EmployeRepository;
import com.employes.Metier.EmployeMetier;

@Controller
public class EmployeController {
	@Autowired
	public EmployeRepository employeRepository;
	@Autowired
	public EmployeMetier employeMetier;

}
