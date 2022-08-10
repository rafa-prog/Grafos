import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private Integer info;
    private boolean isVisited;
    private List<Aresta> arestas = new ArrayList<Aresta>();

    public Vertice(Integer info) {
        this.info = info;
        this.isVisited = false;
    }

    public Integer getInfo() {
        return info;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void addArestas(Aresta aresta) {
        this.arestas.add(aresta);
    }
}
