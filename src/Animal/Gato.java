package Animal;

public class Gato extends infAnimais {
    public int numeroGatos;
    public String estadoDeEspirito;

    public Gato() {
        ++this.numeroGatos;
    }

    public Gato(String nome, String cor, int altura) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        ++this.numeroGatos;
    }

    public String toString() {
        return "nome = " + this.nome;
    }

    public void soar() {
        System.out.println("MIAU MIAU");
    }
}
