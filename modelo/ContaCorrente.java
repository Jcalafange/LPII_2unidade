package modelo;

public class ContaCorrente implements iTributavel{

    private String agencia;
    private String numero;
    private double saldo;

    public ContaCorrente(String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
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
    }

    public void depositar(double valor) {
    }

    public boolean transferir(double valor, ContaCorrente cc) {
        return false;
    }

    @Override
    public double calcularTributos() {
    return this.saldo * 0.0038;
    }
}