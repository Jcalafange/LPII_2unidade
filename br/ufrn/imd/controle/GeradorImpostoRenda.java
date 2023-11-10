package br.ufrn.imd.controle;

import br.ufrn.imd.modelo.Pessoa;

public class GeradorImpostoRenda {
	
	private double totalTributo;
    public GeradorImpostoRenda() {
      super();
      this.totalTributo = 0.0;
    }
	
	public double calculaValorTotalTributo(Pessoa p) {
		totalTributo = p.calcularTributos();
		if(p.getSeguro()!=null) {
			totalTributo+=p.getSeguro().calcularTributos();
		}
		if(p.getConta()!=null) {
			totalTributo+=p.getConta().calcularTributos();
		}
		return totalTributo;
	}

	public double getTotalTributo() {
		return totalTributo;
	}

	public void setTotalTributo(double totalTributo) {
		this.totalTributo = totalTributo;
	}
}
