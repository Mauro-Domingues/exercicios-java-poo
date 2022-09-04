package exercicios.poo;

public class Carro {
    private float volumeTotal;
    private float distancia;
    private float consumo = 15;

    public Carro(float volumeTotal, float distancia) {
        this.volumeTotal = volumeTotal;
        this.distancia = distancia;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
    
    public float getConsumo() {
        return consumo;
    }
    
    public float getVolumeTotal() {
        return volumeTotal;
    }

    public void setVolumeTotal(float volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
    public void abastecer(){
        if (volumeTotal <= 50){
            System.out.println(volumeTotal + "L abastecidos");
        } else{
            System.out.println("Não há capacidade no tanque");
        }
    }
    
    public void viajar(){
        if (volumeTotal - (distancia / consumo) >= 0){
            volumeTotal = volumeTotal - (distancia / consumo);
            System.out.println(distancia + "Km percorridos");
        } else{
            System.out.println("Não é possível percorrer essa distância antes de abastecer");
        }
    }
    public void mostrarStats(){
        System.out.println(distancia + "Km percorridos ao todo e " + volumeTotal * 15 + "Km disponíveis antes do combustível acabar");
        System.out.println((distancia / consumo) + "L de combustivel gasto e " + volumeTotal + "L restantes");
    }
}