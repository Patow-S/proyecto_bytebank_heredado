package proyecto_bytebank_heredado;

public class Contador extends Funcionario{
	@Override
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE CONTADOR");
		return 200;
	}
}
