package proyecto_bytebank_heredado;
// extiende de 
public class Gerente extends Autenticable {

	 //Sobreescritura de metodo
	 public double getBonificacion() {
		 System.out.println("EJECUTAR DESDE GERENTE");
		 return 200;
	 }
}
