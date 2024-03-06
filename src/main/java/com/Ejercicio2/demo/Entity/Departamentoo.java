package com.Ejercicio2.demo.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="departamentos")
public class Departamentoo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name= "id_departamento")	
	private Long id;
	
	@Column (name="departamento_codigo")
	private String departamento_codigo;

	@Column (name = "departamento_nombre")
	private String departamento_nombre;
	
	@Column (name="fecha_hora_crea", updatable = false)
	private LocalDateTime fecha_hora_crea = LocalDateTime.now();
	
	@Column (name = "fecha_hora_modifica")
	private LocalDateTime fecha_hora_modifica = LocalDateTime.now();

    public Object getNombre() {
        
        return this.departamento_nombre;
    }

}
