package exercicios.poo;

public class FuncionarioTeste {
    String nome;
    String Sobrenome;
    double salario;
    double aumento;

    public FuncionarioTeste(String nome, String Sobrenome, double salario) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 0){
        this.salario = salario;
        }else{
            this.salario = 0;
        }
    }
    
    public double aumento(){
        aumento = salario * 1.1;
        System.out.println("Seu salário agora é " + aumento + " e seu salário anual agora é de R$" + aumento * 12);
        return aumento;
    }
}
