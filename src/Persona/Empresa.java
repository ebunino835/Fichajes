package Persona;

public class Empresa {
	
	private String nombre;
	private String cuit;
	private String localidad;
	private String provincia;
	private String pais;
	private Contacto contacto;
	
	public Empresa(String cuit) {
		super();
		this.cuit = cuit;
	}

	public Empresa(String nombre, String cuit, String localidad, String provincia, String pais, Contacto contacto) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.contacto = contacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	
	

}
