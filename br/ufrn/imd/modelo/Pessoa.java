package br.ufrn.imd.modelo;

public class Pessoa implements iTributavel{
    
    private String nome;
    private double salario;
    private ContaCorrente conta;
    private SeguroVida seguro;

    public Pessoa(String nome, double salario, ContaCorrente conta, SeguroVida seguro) {
        this.nome = nome;
        this.salario = salario;
        this.conta = conta;
        this.seguro = seguro;
        
    }
    

    public Pessoa() {
		super();
	}


	public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ContaCorrente getConta() {
        return this.conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public SeguroVida getSeguro() {
        return this.seguro;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    public double calcularTributos() {
        return this.salario * 0.11;
    }

	@Override
	public String toString() {
		return "Nome: " + nome + "\nSalario: R$" + salario + "\nSaldo em conta: " + conta.getSaldo() + "\nSeguro: R$" + seguro.getValor();
	}
    
}
