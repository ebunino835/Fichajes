package Persona;

import java.util.Scanner;

public class Empleado extends Persona implements InterfazPersona{
	
	private int nroIdentificacion;
	private String legajo;
	private Horario horario;
	private Empresa empresa;
	private Sector sector;
	
	public Empleado(String dni, int nroIdentificacion, String legajo) {
		super(dni);
		this.nroIdentificacion = nroIdentificacion;
		this.legajo = legajo;
	}

	public Empleado(String dni, int nroIdentificacion, String legajo, Horario horario, Empresa empresa, Sector sector) {
		super(dni);
		this.nroIdentificacion = nroIdentificacion;
		this.legajo = legajo;
		this.horario = horario;
		this.empresa = empresa;
		this.sector = sector;
	}

	public int getNroIdentificacion() {
		return nroIdentificacion;
	}

	public void setNroIdentificacion(int nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	@Override
	public void cargar() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Ingrese Apellido: ");
		this.setApellido(scn.nextLine());
		System.out.print("Ingrese Nombre ");
		this.setNombre(scn.nextLine());
		System.out.print("Ingrese dni: ");
		this.setDni(scn.nextLine());
		
		
		
		
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
