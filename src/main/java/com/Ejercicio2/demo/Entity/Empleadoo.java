package com.Ejercicio2.demo.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_empleados")
public class Empleadoo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

 	@Column (name= "id_Empleado")
	private Long id;
	
	@Column (name= "documento_tipo")
	private String documento_tipo;
	
	@Column(name="documento_numero")
	private String documento_numero;
	
	@Column (name= "nombres")
	private String nombres;
	
	@Column (name="apellidos")
	private String apellidos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "departamentos_id", nullable = false)
	private Departamentoo Departamentos_id;
	
	@Column (name = "ciudad")
	private String ciudad;
	
	@Column (name="direccion")
	private String direccion;
	
	@Column (name="correo_electronico")
	private String correo_electronico;
	
	@Column (name="telefono")
	private String telefono;
	
	@Column (name="fecha_hora_crea", updatable = false)
	private LocalDateTime fecha_hora_crea = LocalDateTime.now();
	
	@Column (name="fecha_hora_modifica")
	private LocalDateTime fecha_hora_modifica = LocalDateTime.now();

}
