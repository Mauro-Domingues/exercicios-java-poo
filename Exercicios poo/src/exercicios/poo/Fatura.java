package exercicios.poo;

public class Fatura {
    private String numero;
    private String descricao;
    private int qtd;
    private double preco;

    public Fatura(String numero, String descricao, int qtd, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0){
        this.preco = preco;
        } else {
            this.preco = 0;
        }
    }
    
    public void getTotalFatura(){
        System.out.println("O valor da fatura é R$ " + preco * qtd);
    }
    
    public void faturaTeste(){
        System.out.println("Número do item: " + numero);
        System.out.println("Descrição do item: " + descricao);
        System.out.println("Preço do item: " + preco);
    }
}