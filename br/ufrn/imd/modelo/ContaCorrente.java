package br.ufrn.imd.modelo;

public class ContaCorrente implements iTributavel{

    private String agencia;
    private String numero;
    private double saldo;

    public ContaCorrente(String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    

    public ContaCorrente() {
		super();
	}


	public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor) {
    	if(valor>saldo) {
    		System.out.println("Saque maior que o saldo.");
    	}
    	else {
    		System.out.println("Foi sacado R$"+valor+" da conta "+this.numero);
    		this.saldo -= valor;
    	}
    	
    }

    public void depositar(double valor) {
    	System.out.println("Foi depositado R$"+valor+" na conta "+this.numero);
    	this.saldo += valor;
    }

    public boolean transferir(double valor, ContaCorrente cc) {
    	if(valor>this.saldo) {
    		System.out.println("Não é possível tranferir valor maior que o saldo");
    		return false;
    	}
    	else {
    		sacar(valor);
    		cc.depositar(valor);
    		System.out.println("A conta "+this.numero +" transferiu R$"+valor+" para a conta "+cc.getNumero());
    	}
        return true;
    }

    @Override
    public double calcularTributos() {
    	return this.saldo * 0.0038;
    }
}