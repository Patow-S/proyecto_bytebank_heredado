package proyecto_bytebank_heredado;
// extiende de 
public class Gerente extends Funcionario implements Autenticable {
	//       es un Funcionario 
	 //Sobreescritura de metodo
	 public double getBonificacion() {
		 System.out.println("EJECUTAR DESDE GERENTE");
		 return 200;
	 }

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
