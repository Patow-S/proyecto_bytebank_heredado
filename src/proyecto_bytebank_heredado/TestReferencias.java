package proyecto_bytebank_heredado;

public class TestReferencias {
	public static void main(String[] args) {
		//Funcionario es generico y se adapta a espe fico Gerente
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena ");
		
		funcionario.setSalario(2000.0);
		gerente.setSalario(10000.0);
		
		 
	}

}
