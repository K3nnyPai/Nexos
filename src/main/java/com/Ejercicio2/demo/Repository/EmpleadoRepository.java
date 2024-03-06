package com.Ejercicio2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Ejercicio2.demo.Entity.Empleadoo;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleadoo, Long> {
    
}
