package exercicios.poo;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Data {
    
    Calendar cal = Calendar.getInstance();
    int anoAtual = cal.get(Calendar.YEAR);
    int mesAtual = cal.get(Calendar.MONTH);
    int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        try {
            LocalDateTime dataConvertida = LocalDateTime.of(ano, mes, dia, 0, 0);
            this.dia = dataConvertida.getDayOfMonth();
            this.mes = dataConvertida.getMonthValue();
            this.ano = dataConvertida.getYear();
        } catch (Exception e) {
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void compararData(){
        if (ano == anoAtual && mes == mesAtual && dia == diaAtual){
            System.out.println("As datas coincidem");
        } else if (ano >= anoAtual || ano == anoAtual && mes > mesAtual || ano == anoAtual && mes == mesAtual && dia > diaAtual){
            System.out.println("A data é maior que a atual"); 
        } else{
            System.out.println("A data é menor que a atual"); 
        }
    }
    
    public void mostrarDia(){
        System.out.println("O dia é " + dia);   
    }
    
    public void mostrarMes(){         
        System.out.println("O mes é " + mes);   
    }
    
    public void mostrarAno(){
        System.out.println("O ano é " + ano);   
    }
    
    public void mostrarMesExtenso(){
        switch (mes){
            case 1 :
                System.out.println("O mês em extenso é Janeiro");
                break;
            case 2 :
                System.out.println("O mês em extenso é Fevereiro");
                break;
            case 3 :
                System.out.println("O mês em extenso é Março");
                break;
            case 4 :
                System.out.println("O mês em extenso é Abril");
                break;
            case 5 :
                System.out.println("O mês em extenso é Maio");
                break;
            case 6 :
                System.out.println("O mês em extenso é Junho");
                break;
            case 7 :
                System.out.println("O mês em extenso é Julho");
                break;
            case 8 :
                System.out.println("O mês em extenso é Agosto");
                break;
            case 9 :
                System.out.println("O mês em extenso é Setembro");
                break;
            case 10 :
                System.out.println("O mês em extenso é Outubro");
                break;
            case 11 :
                System.out.println("O mês em extenso é Novembro");
                break;
            case 12 :
                System.out.println("O mês em extenso é Dezembro");
                break;
            default :
        }
    }
    
    public void isBissexto(){
        if (ano % 4 == 0){
            System.out.println("O ano é bissexto");  
        }
    }
    
    public void criarClone(){
        System.out.println("O clone resulta na data " + dia + "/" + mes + "/" + ano);
    }
}