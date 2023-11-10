package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.ContaCorrente;
import br.ufrn.imd.modelo.Pessoa;
import br.ufrn.imd.modelo.SeguroVida;


public class PessoaDAO {

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
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public void calcularTributosPessoas() {
        for (Pessoa pessoa : pessoas) {
            pessoa.calcularTributos();
        }
    }

    public void imprimeImpostoTotal() {
        int totalImposto = 0;
        String nomeMaiorContribuinte = "";
        int valorMaiorContribuinte = 0;
        String nomeMaiorBeneficiado = "";
        int valorMaiorBeneficiado = 0;

        for (Pessoa pessoa : pessoas) {
           // totalImposto += pessoa.getValorTributo();

            /*if (pessoa.getValorTributo() > valorMaiorContribuinte) {
                nomeMaiorContribuinte = pessoa.getNome();
                valorMaiorContribuinte = pessoa.getValorTributo();
            }

            if (pessoa.getValorSeguro() > valorMaiorBeneficiado) {
                nomeMaiorBeneficiado = pessoa.getNome();
                valorMaiorBeneficiado = pessoa.getValorSeguro();
            }*/
        }

        System.out.println("Total de imposto a ser recolhido: R$" + totalImposto);
        System.out.println("Nome da pessoa que pagará o maior imposto: " + nomeMaiorContribuinte);
        System.out.println("Valor do imposto da pessoa que pagará o maior imposto: R$" + valorMaiorContribuinte);
        System.out.println("Nome do beneficiado com o maior valor de seguro: " + nomeMaiorBeneficiado);
        System.out.println("Valor do seguro do beneficiado com o maior valor de seguro: R$" + valorMaiorBeneficiado);
    }
    

}