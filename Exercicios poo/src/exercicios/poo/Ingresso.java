
package exercicios.poo;

class Ingresso {
    double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void exibirInfo(){
        System.out.println("O valor do ingresso comum é R$" + valor);
    }
    
    public void exibirValorVip(){
        System.out.println("O valor do ingresso VIP é R$" + (valor * 1.5) + " sendo R$" + ((valor*1.5) - valor) + " mais caro");
    }
}
