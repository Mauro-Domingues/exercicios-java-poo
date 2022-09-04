package exercicios.poo;

public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double trabalho;
    private double media;

    public Disciplina(String nome, double p1, double p2, double trabalho) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        if(p1 <= 10){
            this.p1 = p1;
        }else{
            System.out.println("A nota máxima permitida é 10");
        }
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        if(p2 <= 10){
            this.p2 = p2;
        }else{
            System.out.println("A nota máxima permitida é 10");
        }
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        if(trabalho <= 10){
            this.trabalho = trabalho;
        }else{
            System.out.println("A nota máxima permitida é 10");
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public double verMedia(){
        media = (((p1 + p2)* 2.5) + (trabalho * 2))/3;
        System.out.println("Sua média é " + media);
        return media;
    }
    
    public void provaFinal(){
    if(media < 16.3){
            System.out.println("Faltam " + (16.3 - media) + " para a prova final");
        } else{
            System.out.println("Falta 0 pontos para a prova final");
        }
    }
}