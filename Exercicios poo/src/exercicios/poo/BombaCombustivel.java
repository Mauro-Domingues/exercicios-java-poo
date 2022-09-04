package exercicios.poo;

public class BombaCombustivel {
    String tipoCombustivel;
    double valorLitro;
    double qtdCombustivel;
    double abastecerPorLitro;
    double abastecerValor;
    double total;
    int c;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double qtdCombustivel, double abastecerPorLitro, double abastecerValor, int c) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.qtdCombustivel = qtdCombustivel;
        this.abastecerPorLitro = abastecerPorLitro;
        this.abastecerValor = abastecerValor;
        this.c = c;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public double getAbastecerPorLitro() {
        return abastecerPorLitro;
    }

    public void setAbastecerPorLitro(double abastecerPorLitro) {
        this.abastecerPorLitro = abastecerPorLitro;
    }

    public double getAbastecerValor() {
        return abastecerValor;
    }

    public void setAbastecerValor(double abastecerValor) {
        this.abastecerValor = abastecerValor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
    
    public void abastecerPorLitro(){
        total = valorLitro * abastecerPorLitro;
        qtdCombustivel = qtdCombustivel - abastecerPorLitro;
        System.out.println("Total a pagar: R$" + total + " abastecidos com " + tipoCombustivel);
    }
    
    public void abastecerValor(){
        total = abastecerValor / valorLitro;
        qtdCombustivel = qtdCombustivel - total;
        System.out.println("Total abastecido: " + total + "L de " + tipoCombustivel);
    }
    
    public void alterarCombustivel(){
        switch (c) {
            case 1 :
                tipoCombustivel = "álcool";
                break;
            case 2 :
                tipoCombustivel = "gasolina";;
                break;
            case 3 :
                tipoCombustivel = "diesel";
                break;
            default :
        }
        System.out.println("Combustivel alterado para: " + tipoCombustivel);
    }
    
    public void alterarValorCombustivel(){
        System.out.println("Valor de " + tipoCombustivel + " alterado para: " + valorLitro);
    }
    
    public void alterarQtdCombustivel(){
        System.out.println("Quantidade de " + tipoCombustivel + " alterada para: " + qtdCombustivel);
    }
}