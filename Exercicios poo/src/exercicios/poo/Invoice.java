package exercicios.poo;

public class Invoice {
    private int codItem;
    private String descricao;
    private int qtd;
    private float preco;

    public Invoice(int codItem, String descricao, int qtd, float preco) {
        this.codItem = codItem;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
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
        if(qtd >= 0){
            this.qtd = qtd;
        } else{
            this.qtd = 0;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        
        if(preco >= 0){
            this.preco = preco;
        } else{
            this.preco = 0;
        }
    }
    
    public void getInvoiceAmount(){
        System.out.println("Código: " + codItem);
        System.out.println("Produto: " + descricao);
        System.out.println("Quantidade comprada: " + qtd);
        System.out.println("Valor unitário: " + preco);
        System.out.println("Total a pagar: " + qtd * preco);
    }
}