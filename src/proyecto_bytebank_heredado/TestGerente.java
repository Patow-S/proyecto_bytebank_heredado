package proyecto_bytebank_heredado;

public class TestGerente {
	public static void main(String[] args) {
		Funcionario gerente = new Funcionario();
		gerente.setSalario(6000.0);
		gerente.setTipo(1);
		
		System.out.println(gerente.getSalario());
	}

}
