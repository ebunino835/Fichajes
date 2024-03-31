package Persona;

public class Contacto {
	private String telefono;
	private String domicilio;
	private String email;
	
	
	public Contacto() {
		super();
	}



	public Contacto(String telefono, String domicilio, String email) {
		super();
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.email = email;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getDomicilio() {
		return domicilio;
	}



	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
