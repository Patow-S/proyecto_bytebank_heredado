package proyecto_bytebank_heredado;


public class Cuenta {

	int nombre;
	String apellido;                                  
	private double saldo; 	                    // si esta private , saldo no es accesible 
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();
	
	private static int total= 0; 
	
	public Cuenta (int agencia, int numero) {
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Estoy creando una ");
    	
    	Cuenta.total++;

    }    

	public void depositar(double valor) { 	    // No retorna valor
		this.saldo += valor;   		            // apunta a un objeto en especifico / rm : this.saldo = this.saldo + valor;

	}

	public boolean retirar(double valor) { 	    // Retorna valor
		if (this.saldo >= valor) { 
			this.saldo -= valor;
			return true;
		} else {
		return false;                          /* else { return false;} */
		}
	}

	public boolean transferir(double valor, Cuenta cuenta1) {
		if (this.saldo >= valor) {
			this.saldo -= this.saldo - valor;
			cuenta1.saldo = cuenta1.saldo + valor;
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo(){                    //obtener
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {        //asignar
		
		if (agencia > 0 ) {
			this.agencia = agencia; 
		} else {
			System.out.println("valores negativos , no permitido");
		}
	}
	
	                                              //Buenas practicas
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getTotal() {
		return Cuenta.total;
	}


}