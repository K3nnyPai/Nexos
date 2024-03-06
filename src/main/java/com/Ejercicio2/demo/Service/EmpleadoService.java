package com.Ejercicio2.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.Ejercicio2.demo.Entity.Departamentoo;
import com.Ejercicio2.demo.Entity.Empleadoo;
import com.Ejercicio2.demo.Repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;
    // consultar
    public List<Empleadoo> getEmpleadosList() {
        return empleadoRepository.findAll();
    }
    //editar
    public Optional<Empleadoo> ListarEmpleadoId(Long id) {
        return empleadoRepository.findById(id);
    }

    // guardar
    public void saveOrUpdate(Empleadoo e) {
        empleadoRepository.save(e);
    }

    // Borrar
    public void delete(Long id) {
        empleadoRepository.deleteById(id);
    }


}
