package proyecto_bytebank_heredado;

public class Cliente implements Autenticable {
	 private String nombre;
	 private String documento;
	 private String tlf;

	 private AutenticacionUtil util;
	 
	//composicion de ob 
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	@Override
	public void setClave(String clave) {
		 this.setClave(clave);
	}
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}




}