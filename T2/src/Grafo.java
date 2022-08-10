import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Vertice> vertices = new ArrayList<Vertice>();

    public Grafo() {}

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void addVertices(Vertice vertice) {
        this.vertices.add(vertice);
    }
}
