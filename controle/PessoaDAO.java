package controle;


import modelo.Pessoa;

import java.util.ArrayList;

public class PessoaDAO {

  private ArrayList<Pessoa> pessoas;

  public PessoaDAO() {
    this.pessoas = new ArrayList<>();
  }

  public void cadastrarPessoa(Pessoa pessoa) {
    this.pessoas.add(pessoa);
  }

  public void removerPessoa(Pessoa pessoa) {
    this.pessoas.remove(pessoa);
  }

  public void listarPessoas() {
    for (Pessoa pessoa : this.pessoas) {
      System.out.println(pessoa);
    }
  }

  public void calcularTributosPessoas() {
    for (Pessoa pessoa : this.pessoas) {
      pessoa.calcularTributos();
    }
  }

  public void imprimeImpostoTotal() {
    double totalTributos = 0.0;
    String pessoaMaiorImposto = "";
    String beneficiadoMaiorSeguro = "";

    for (Pessoa pessoa : this.pessoas) {
        totalTributos += pessoa.calcularTributos();
        if (pessoa.calcularTributos() > totalTributos) {
            pessoaMaiorImposto = pessoa.getNome();
        }
        if (pessoa.getSeguro().getValor() > pessoa.getSeguro().getTaxa()) {
            beneficiadoMaiorSeguro = pessoa.getSeguro().getBeneficiado();
        }
    }
    System.out.println("Total de tributos a ser recolhido: " + totalTributos);
    System.out.println("Pessoa que pagará o maior imposto: " + pessoaMaiorImposto);
    System.out.println("Beneficiado com o maior valor de seguro: " + beneficiadoMaiorSeguro);
  }
}
