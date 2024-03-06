package com.Ejercicio2.demo.Repository;

import com.Ejercicio2.demo.Entity.Departamentoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamentoo, Long> {

	
}
