package proyecto_bytebank_heredado;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego= new Funcionario();
		diego.setSalario(2000.0);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000.0);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000.0); 
		
		ControlBonificaciones controlBonificaciones = new ControlBonificaciones();
		
		controlBonificaciones.registrarSalario(diego);
		controlBonificaciones.registrarSalario(jimena);
		controlBonificaciones.registrarSalario(alexis);

	}
}