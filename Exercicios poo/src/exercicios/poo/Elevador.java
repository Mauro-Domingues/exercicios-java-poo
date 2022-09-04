package exercicios.poo;

public class Elevador {
    int andar;
    int andarAtual = 0;
    int totalAndares;
    int elevadorCapacidade;
    int pessoas;
    int totalPessoas = 0;

    public Elevador(int andar, int totalAndares, int elevadorCapacidade, int pessoas) {
        this.andar = andar;
        this.totalAndares = totalAndares;
        this.elevadorCapacidade = elevadorCapacidade;
        this.pessoas = pessoas;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getElevadorCapacidade() {
        return elevadorCapacidade;
    }

    public void setElevadorCapacidade(int elevadorCapacidade) {
        this.elevadorCapacidade = elevadorCapacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
    
    public int entra(){
        if (totalPessoas + pessoas <= elevadorCapacidade){
        totalPessoas = totalPessoas + pessoas;
        System.out.println("No elevador há " + totalPessoas + " pessoas");
        } else{
            System.out.println("O limite de pessoas é " + elevadorCapacidade);
        }
        return 0;
    }
    
    public int sai(){
        if (totalPessoas - pessoas >= 1){
        totalPessoas = totalPessoas - pessoas;
        System.out.println("No elevador há " + totalPessoas + " pessoas");
        } else{
            System.out.println("O elevador está vazio");
        }
        return 0;
    }
    
    public int sobe(){
        if (andarAtual + andar <= totalAndares){
            andarAtual = andarAtual + andar;
            System.out.println("andar " + andarAtual);
        } else{
            System.out.println("O limite de andares é " + totalAndares);
        }
        return andarAtual;
    }
    
    public int desce(){
        if (andarAtual - andar >= 1){
            andarAtual = andarAtual - andar;
            System.out.println("andar " + andarAtual);
        } else{
            System.out.println("Você não pode ultrapassar o térreo");
        }
        return andarAtual;
    }
}