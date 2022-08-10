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

    public Vertice getVertice() {
        return this.vertice;
    }

    public Integer getInfoVertice() {
        return this.vertice.getInfo();
    }

    public void setVerticeVisited(boolean isVisited) {
        this.vertice.setVisited(isVisited);
    }
}
