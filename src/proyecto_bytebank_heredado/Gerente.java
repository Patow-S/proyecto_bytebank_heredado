package proyecto_bytebank_heredado;
// extiende de 
public class Gerente extends Funcionario {
	private String clave;

	 public void setClave (String clave) {
		 this.clave = clave;
	 }
	 public boolean iniciarSesion(String clave) {
		 return clave == "Acceso.c123";
	 }
	 //Sobreescritura de metodo
	 public double getBonificacion() {
		 System.out.println("EJECUTAR DESDE GERENTE");
		 return super.getSalario() + super.getBonificacion();
	 }
}
