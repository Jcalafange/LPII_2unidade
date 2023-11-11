package br.ufrn.imd.modelo;

public class SeguroVida implements iTributavel{
    private int numero;
    private String beneficiado;
    private double valor;
    private double taxa = 31.50;

    public SeguroVida(int numero, String beneficiado, double valor) {
        this.numero = numero;
        this.beneficiado = beneficiado;
        this.valor = valor;
        
    }
    

    public SeguroVida() {
		super();
	}


	public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getBeneficiado(){
        return this.beneficiado;
    }

    public void setBeneficiado(String beneficiado){
        this.beneficiado = beneficiado;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getTaxa(){
        return this.taxa;
    }

    public void setTaxa(double taxa){
        this.taxa = taxa;
    }

    @Override
    public double calcularTributos() {
        return taxa;
    }
}
