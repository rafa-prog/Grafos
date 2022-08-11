import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private Integer info;
    private char cor;
    private List<Aresta> arestas = new ArrayList<Aresta>();

    public Vertice(Integer info) {
        this.info = info;
        this.cor = 'b';
    }

    public Integer getInfo() {
        return info;
    }

    public char isVisited() {
        return cor;
    }

    public void setVisited(char isVisited) {
        this.cor = isVisited;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void addArestas(Aresta aresta) {
        this.arestas.add(aresta);
    }
}
