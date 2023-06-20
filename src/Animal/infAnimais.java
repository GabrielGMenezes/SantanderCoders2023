package Animal;

public abstract class infAnimais {
    protected String nome;
    protected String cor;
    protected int altura;
    public String estadoDeEspirito;

    public infAnimais() {
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

    public String getEstadoDeEspirito() {
        return this.estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    void comer() {
    }

    public abstract void soar();

    void dormir() {
    }
}
