package proyecto_bytebank_heredado;

public class TestFuncional {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("8549377afg");
		diego.setSalario(1850.0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
