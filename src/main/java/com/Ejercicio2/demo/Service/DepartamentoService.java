package com.Ejercicio2.demo.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Ejercicio2.demo.Entity.Departamentoo;
import com.Ejercicio2.demo.Repository.DepartamentoRepository;

//son metodos que se llaman desde el controller
@Service
public class DepartamentoService {

	@Autowired
	DepartamentoRepository departamentoRepository;
	
	//consultar
	public List<Departamentoo> getDepartamento(){
		return departamentoRepository.findAll();
	}
	
	public Optional<Departamentoo> listariD(Long id){
		return departamentoRepository.findById(id);
	}
	
	//guardar
	public void saveOrUpdate(Departamentoo departamentoo) {
		departamentoRepository.save(departamentoo);
	}

	//Borrar
	public void delete(Long id) {
		departamentoRepository.deleteById(id);
	}

}
