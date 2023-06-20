package Animal;

public class Cachorro extends infAnimais {
    public int numeroCachorros;
    private int tamanhoDoRabo;
    public String estadoDeEspirito;

    public Cachorro() {
        ++this.numeroCachorros;
    }

    public Cachorro(String nome, String cor, int altura, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.tamanhoDoRabo = tamanhoDoRabo;
        ++this.numeroCachorros;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getTamanhoDoRabo() {
        return this.tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "brigar":
                this.estadoDeEspirito = "Bravo";
                break;
            case "mandar dormir":
                this.estadoDeEspirito = "Ficar Triste";
                break;
            default:
                this.estadoDeEspirito = "Sentado";
        }

        return this.estadoDeEspirito;
    }

    public String toString() {
        return "nome = " + this.nome;
    }

    public void soar() {
        System.out.println("AU AU");
    }
}
