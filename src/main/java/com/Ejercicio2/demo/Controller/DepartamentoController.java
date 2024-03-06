package com.Ejercicio2.demo.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ejercicio2.demo.Entity.Departamentoo;
import com.Ejercicio2.demo.Service.DepartamentoService;

@Controller
@RequestMapping
public class DepartamentoController {

	@Autowired
	private DepartamentoService departamentoService;
	
	//Listar departamentos
	@GetMapping("/listarDepartamentos")
	public String listar(Model model) {
		List<Departamentoo> departamentos = departamentoService.getDepartamento();
		model.addAttribute("departamento", departamentos);
		return "index-departamentos";
		
	}
	//agregar un departamento
	@GetMapping("/newDepartamento")
	public String agregar(Model model) {
		model.addAttribute("departamento", new Departamentoo());
		return "form-departamentos";
	}

	//guardar
	@PostMapping("/saveDepartamento")
	public String save(@Validated Departamentoo d, Model model) {
		departamentoService.saveOrUpdate(d);
		return "redirect:/listarDepartamentos";
	}
	
	//editar
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable long id, Model model) {
		Optional<Departamentoo>departamentos = departamentoService.listariD( id);
		model.addAttribute("departamento", departamentos);
		return "form-edit-departamentos";
	}
	
	
	//borrar
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable Long id ) {
		departamentoService.delete(id);
		return "redirect:/listarDepartamentos";
	}
	
}
