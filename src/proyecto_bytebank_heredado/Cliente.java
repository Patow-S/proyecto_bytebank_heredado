package proyecto_bytebank_heredado;

public class Cliente {
	 private String nombre;
	 private String documento;
	 private String tlf;
	 
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
	 public boolean iniciarSesion(String clave) {
		 return false;
	 }



}