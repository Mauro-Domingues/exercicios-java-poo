package exercicios.poo;

public class ContaCorrente {
    private int numeroConta;
    private String nome;
    private String novoNome;
    private float saldo;
    private float retirada;
    private float deposito;

    public ContaCorrente(int numeroConta, String nome, String novoNome, float saldo, float retirada, float deposito) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.novoNome = novoNome;
        this.saldo = saldo;
        this.retirada = retirada;
        this.deposito = deposito;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNovoNome() {
        return novoNome;
    }

    public void setNovoNome(String novoNome) {
        this.novoNome = novoNome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo <= 0){
            this.saldo = 0;
        } else{
        this.saldo = saldo;
        }
    }

    public float getRetirada() {
        return retirada;
    }

    public void setRetirada(float retirada) {
        this.retirada = retirada;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }
    
    public void mostrarDados(){
        System.out.println("Conta: " + numeroConta);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: R$" + saldo);
    }

    public String alterarNome(){
        return nome;
    }
    
    public float deposito(){
        saldo = saldo + deposito;
        System.out.println("Seu novo saldo é R$" + saldo);
        return saldo;
    }
    
    public float saque(){
        saldo = saldo - retirada;
        System.out.println("Seu novo saldo é R$" + saldo);
        return saldo;
    }
}
