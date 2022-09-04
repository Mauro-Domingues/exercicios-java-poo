package exercicios.poo;

public class Funcionario {
    String nome;
    String Sobrenome;
    double salario;

    public Funcionario(String nome, String Sobrenome, double salario) {
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
    
    public double salarioAnual(){
        salario = salario * 12;
        System.out.println("Seu salário anual é " + salario);
        return salario;
    }
    
    public double aumento(){
        salario = (salario * 1.1) * 12;
        System.out.println("Seu salário anual agora é " + salario);
        return salario;
    }
}
