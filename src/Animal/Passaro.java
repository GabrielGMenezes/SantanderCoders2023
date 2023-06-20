package Animal;

public class Passaro extends infAnimais {
    public int numeroPassaros;

    public Passaro() {
        ++this.numeroPassaros;
    }

    public Passaro(String nome, String cor, int altura) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        ++this.numeroPassaros;
    }

    public String toString() {
        return "nome= " + this.nome;
    }

    public void soar() {
        System.out.println("PIU PIU");
    }
}
