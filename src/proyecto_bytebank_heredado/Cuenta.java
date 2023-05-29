package proyecto_bytebank_heredado;


public  abstract class Cuenta {

	int nombre;
	String apellido;                                  
	protected double saldo; 	                    // si esta private , saldo no es accesible 
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total; 
	
	public Cuenta (int agencia, int numero) {
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Estoy creando una cuenta" + this.numero);
    	
    	Cuenta.total++;

    }    

	public abstract void depositar(double valor);

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
    public Cliente getTitular() {
        return titular;
    }
	
	public int getTotal() {
		return Cuenta.total;
	}
	


}