import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private Integer info;
    private Integer distancia;
    private char cor;
    private List<Aresta> arestas = new ArrayList<Aresta>();

    public Vertice(Integer info) {
        this.info = info;
        this.cor = 'b';
        this.distancia = null;
    }

    public Integer getInfo() {
        return info;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public char getCor() {
        return cor;
    }

    public void setCor(char cor) {
        this.cor = cor;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void addArestas(Aresta aresta) {
        this.arestas.add(aresta);
    }
}
