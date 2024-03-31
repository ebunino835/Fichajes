package Persona;

import java.time.LocalDateTime;

public class Persona {
	
	private String apellido;
	private String nombre;
	private String dni;
	private LocalDateTime fechaDeNacimiento;
	private Contacto datosContacto;
	
	
	
	public Persona(String dni) {
		super();
		this.dni = dni;
	}



	public Persona(String apellido, String nombre, String dni, LocalDateTime fechaDeNacimiento,
			Contacto datosContacto) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.datosContacto = datosContacto;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public LocalDateTime getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}



	public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}



	public Contacto getDatosContacto() {
		return datosContacto;
	}



	public void setDatosContacto(Contacto datosContacto) {
		this.datosContacto = datosContacto;
	}
	

}
