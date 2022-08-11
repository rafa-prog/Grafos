import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Vertice> vertices = new ArrayList<Vertice>();

    public Grafo() {}

    public List<Vertice> getVertices() {
        return vertices;
    }

    public Vertice getElementVertice(Integer valor) {
        Vertice v = null;
        for(Vertice vs : this.vertices) {
            if(vs.getInfo() == valor) {
                v = vs;
                break;
            }
        }

        return v;
    }

    public Aresta extractMin(Vertice v) {
        Aresta menor = v.getArestas().get(0);

        for(Aresta as : v.getArestas()) {
            if(as.getPeso() <= menor.getPeso()) {
                menor = as;
            }
            as.getVertice().setDistancia(v.getDistancia() + as.getPeso());
        }

        menor.getVertice().setCor('p');

        return menor;
    }

    public void addVertices(Vertice vertice) {
        this.vertices.add(vertice);
    }

    public void Dijkstra(String RelaxType) {
        this.vertices.get(0).setDistancia(0);
        this.vertices.get(0).setCor('p');

        List<Vertice> q = vertices;
        List<Aresta> s = new ArrayList<Aresta>();

        while(!q.isEmpty()) {
            if(q.get(0).getCor() == 'b') {  
                q.remove(0);
                continue;
            }

            s.add(this.extractMin(q.get(0)));
            q.get(0).setCor('p');

            for(Aresta as : q.get(0).getArestas()) {
                if(as.getVertice().getDistancia() > q.get(0).getDistancia() + as.getPeso()) {
                    as.getVertice().setDistancia(q.get(0).getDistancia() + as.getPeso());
                }
            }

            q.remove(0);
        }

        System.out.println("caminho menor: " + s.get(s.size() - 1).getVertice().getDistancia());
    }
}
