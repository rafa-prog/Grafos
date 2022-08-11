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

    public void addVertices(Vertice vertice) {
        this.vertices.add(vertice);
    }

    public void Dijkstra(String RelaxType) {
        this.vertices.get(0).setDistancia(0);
        this.vertices.get(0).setCor('p');

        System.out.println("Atribuindo d=0, cor=p para source=" + this.vertices.get(0).getInfo());

        Integer relax = 200;
        Integer total = 0;

        if(RelaxType == "maior") {
            relax = 1;
        }

        Vertice pos = null;

        for(Vertice vs : this.vertices) {
            List<Aresta> q = vs.getArestas();
            System.out.println("Arestas a partir de: " + vs.getInfo());
            for(Aresta as : q) {
                System.out.println("v: " + as.getVertice2().getInfo() + ", end: " + as.getVertice2());
                if(as.getVertice2().getCor() != 'b') {
                    
                }
                if(RelaxType == "maior" && as.getPeso() >= relax) {
                    relax = as.getPeso();
                    pos = as.getVertice2();
                }

                if(RelaxType == "menor" && as.getPeso() <= relax) {
                    relax = as.getPeso();
                    pos = as.getVertice2();
                }
            }

            total += relax;
            System.out.println("maior: " + relax + "v: " + pos.getInfo() + ", total: " + total);
        }
        

        

    }
}
