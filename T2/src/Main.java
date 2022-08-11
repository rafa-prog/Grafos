import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Grafo g = new Grafo();

        List<Integer> vIntegers = new ArrayList<Integer>();

        Integer n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Integer u = scanner.nextInt();
            Integer v = scanner.nextInt();
            Integer w = scanner.nextInt();

            Vertice v1 = null;
            Vertice v2 = null;

            if(vIntegers.contains(u)) {
                v1 = g.getElementVertice(u);
            }else {
                vIntegers.add(u);
                v1 = new Vertice(u);
                g.addVertices(v1);
            }

            if(vIntegers.contains(v)) {
                v2 = g.getElementVertice(v);
            }else {
                vIntegers.add(v);
                v2 = new Vertice(v);
                g.addVertices(v2);
            }

            v1.addArestas(new Aresta(v2, w));
            v2.addArestas(new Aresta(v1, w));
        }

        scanner.close();
        
        g.Dijkstra("maior");
        //g.Dijkstra("menor");
    }
}
