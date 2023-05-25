package proyecto_bytebank_heredado;

public class ControlBonificaciones {
	private double suma;
	//sobre-carga
	public double registrarSalario(Funcionario funcionario) {
		this.suma =  funcionario.getBonificacion()+ this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
}
 