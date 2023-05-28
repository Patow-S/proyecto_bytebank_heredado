package proyecto_bytebank_heredado;

public class SistemaInterno {
	 private String clave = "123";
	
	public boolean autentica(Autenticable gerente) {
		
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Logro exitoso");
			return true;
		} else {
			System.out.println("Error en login");
			return false;

		}
	}
}
