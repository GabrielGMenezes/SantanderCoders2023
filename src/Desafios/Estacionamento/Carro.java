package Desafios.Estacionamento;

public class Carro {

    String placa;
    String cor;
    int velocidadeMaxima;

    public Carro(){}
    public Carro(String placa, String cor, int velocidadeMaxima) {
        this.placa = placa;
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
