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
import com.Ejercicio2.demo.Entity.Empleadoo;
import com.Ejercicio2.demo.Service.DepartamentoService;
import com.Ejercicio2.demo.Service.EmpleadoService;

import jakarta.annotation.Resource;

@Controller
@RequestMapping
public class EmpleadoController {

	@Resource
	private DepartamentoService departamentoService;	

    @Autowired
	private EmpleadoService empleadoService;


	//pagina principal
	@GetMapping({"/",""})
	public String paginaInicioEmpleados() {
		return "Homepage";
	}
	
	//Listar empleados
	@GetMapping("/listarEmpleados")
	public String listar(Model model) {
		List<Empleadoo> empleado = empleadoService.getEmpleadosList();
		model.addAttribute("empleados", empleado);
		return "index-empleado";
		
	}
	//agregar un empleado
	@GetMapping("/newEmpleado")
	public String agregar(Model model) {
		model.addAttribute("empleados", new Empleadoo());
		model.addAttribute("departamento", departamentoService.getDepartamento());
		return "form-empleado";
	}
	
	
	//guardar empleados
	@PostMapping("/saveEmpleado")
	public String save(@Validated Empleadoo e, Model model) {
		empleadoService.saveOrUpdate(e);
		return "redirect:/listarEmpleados";
	}
	
	//editar
	@GetMapping("/editarEmpleado/{id}")
	public String editar(@PathVariable long id, Model model) {
		Optional<Empleadoo> empleados = empleadoService.ListarEmpleadoId(id);
		model.addAttribute("departamento", departamentoService.getDepartamento());
		model.addAttribute("empleados", empleados);
		return "form-edit-empleados";
	}
	
	//borrar
	@GetMapping("/eliminarEmpleado/{id}")
	public String delete(Model model, @PathVariable Long id ) {
		empleadoService.delete(id);
		return "redirect:/listarEmpleados";
	}

	
}
