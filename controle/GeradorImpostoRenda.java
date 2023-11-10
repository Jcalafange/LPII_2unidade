package controle;

import modelo.Pessoa;

public class GeradorImpostoRenda {
    private double totalTributo;

    public GeradorImpostoRenda() {
        this.totalTributo = 0.0;
    }

    public double calculaValorTotalTributo(Pessoa p) {

		this.totalTributo = p.calcularTributos();
		this.totalTributo += p.getConta().calcularTributos();
		this.totalTributo += p.getSeguro().calcularTributos();

		return this.totalTributo;
    }
}