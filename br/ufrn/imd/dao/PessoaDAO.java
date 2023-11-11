package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Pessoa;
import br.ufrn.imd.controle.*;


public class PessoaDAO {
	private GeradorImpostoRenda Gerador = new GeradorImpostoRenda();
    private ArrayList<Pessoa> pessoas;

    public PessoaDAO() {
        pessoas = new ArrayList<>();
    }

    public void cadastraPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removePessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public void listaPessoas() {
    	System.out.println("=== Listando as pessoas ===");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        System.out.println("============");
    }

    public void calcularTributosPessoas() {
    	System.out.println("=== Calculando tributos das pessoas ===");
        for (Pessoa pessoa : pessoas) {
        	System.out.println(pessoa.getNome());
        	System.out.println("R$"+Gerador.calculaValorTotalTributo(pessoa));
            
        }
        System.out.println("============");
    }
    

    public void imprimeImpostoTotal() {
    	 System.out.println("=== Cálculo total dos impostos ===");
    
        int totalImposto = 0;
        String nomeMaiorContribuinte = "";
        double valorMaiorContribuinte = 0;
        String nomeMaiorBeneficiado = "";
        double valorMaiorBeneficiado = 0;

        for (Pessoa pessoa : pessoas) {
            totalImposto += Gerador.calculaValorTotalTributo(pessoa);

            if (Gerador.calculaValorTotalTributo(pessoa) > valorMaiorContribuinte) {
                nomeMaiorContribuinte = pessoa.getNome();
                valorMaiorContribuinte = Gerador.calculaValorTotalTributo(pessoa);
            }

            if (pessoa.getSeguro().getValor() > valorMaiorBeneficiado) {
                nomeMaiorBeneficiado = pessoa.getNome();
                valorMaiorBeneficiado = pessoa.getSeguro().getValor();
            }
        }

        System.out.println("Total de imposto a ser recolhido: R$" + totalImposto);
        System.out.println("Nome da pessoa que pagará o maior imposto: " + nomeMaiorContribuinte);
        System.out.println("Valor do imposto da pessoa que pagará o maior imposto: R$" + valorMaiorContribuinte);
        System.out.println("Nome do beneficiado com o maior valor de seguro: " + nomeMaiorBeneficiado);
        System.out.println("Valor do seguro do beneficiado com o maior valor de seguro: R$" + valorMaiorBeneficiado);
        System.out.println("============");
    }
    

}