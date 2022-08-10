import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Grafo g = new Grafo();
        List<Vertice> vertices = new ArrayList<Vertice>();
        List<Aresta> arestas = new ArrayList<Aresta>();

        Integer n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Integer info1 = scanner.nextInt();
            Integer info2 = scanner.nextInt();
            Integer peso = scanner.nextInt();

            Vertice v1 = new Vertice(info1);
            Vertice v2 = new Vertice(info2);

            Aresta a1 = new Aresta(v2, peso);
            v1.addArestas(a1);

            Aresta a2 = new Aresta(v1, peso);
            v2.addArestas(a2);

            vertices = g.getVertices();

            if(!vertices.contains(v1)) {
                g.addVertices(v1);
            }
            
            if(!vertices.contains(v2)) {
                g.addVertices(v2);
            }
        }

        scanner.close();

        vertices = g.getVertices();
/* 
        for(Vertice v : vertices) {
            arestas = v.getArestas();
            System.out.println("Vertice: " + v.getInfo());
            for(Aresta a : arestas) {
                System.out.println("peso: " + a.getPeso() + "\nLink: " + a.getInfoVertice());
            }
        }
*/
        Aresta posMaior = null;

        for(Vertice v : vertices) {
            if(v.isVisited()) {
                continue;
            }
            if(posMaior != null) {
                v = posMaior.getVertice();
                System.out.println("Trocando vertice para: " + v.getInfo());
            }
            
            v.setVisited(true);
            arestas = v.getArestas();

            Integer maior = -1;

            System.out.println("VerticeMaiorCalc: " + v.getInfo());
            for(Aresta a : arestas) {
                if(a.getVertice().isVisited()) {
                    System.out.println("Ja visitado:" + a.getInfoVertice());
                    continue;
                }
                if(maior == -1) {
                    maior = a.getPeso();
                    posMaior = a;
                    continue;
                }

                if(a.getPeso() > maior) {
                    maior = a.getPeso();
                    posMaior = a;
                }
            }

            System.out.println("Maior: " + maior);
            System.out.println("posMaior: " + posMaior);
        }
    }
}
