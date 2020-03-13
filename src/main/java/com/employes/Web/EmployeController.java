package com.employes.Web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employes.Entities.Employes;
import com.employes.Metier.EmployeMetier;

@Controller
public class EmployeController {
	
	@Autowired
	public EmployeMetier employeMetier;
	
	@RequestMapping(value = "/formEmp", method = RequestMethod.GET)
	public String formEmploye(Model model) {
		model.addAttribute("employe",new Employes());
		return "formEmploye";
		//return "test";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Model model, Employes employe) {
		employeMetier.addEmployer(employe);
		return "ajoutEmploye";
	}

	@GetMapping("/formEmp1")
	public String formEmploye1(Model model) {
		model.addAttribute("employe",new Employes());
		//return "formEmploye";
		return "test";
	}
	
	@PostMapping("/save1")
	public String save1(Model model, Employes employe ,BindingResult bindingResult) {
		employeMetier.addEmployer(employe);
		return "ajoutEmploye";
	}

}
