public class Aresta {
    private Integer peso;
    private Vertice vertice;

    public Aresta(Vertice vertice, Integer peso) {
        this.vertice = vertice;
        this.peso = peso;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }
}
