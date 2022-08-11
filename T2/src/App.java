import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
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
                for(Vertice vs : g.getVertices()) {
                    if(vs.getInfo() == u) {
                        v1 = vs;
                        break;
                    }
                }
            }else {
                vIntegers.add(u);
                v1 = new Vertice(u);
                g.addVertices(v1);
            }

            if(vIntegers.contains(v)) {
                for(Vertice vs : g.getVertices()) {
                    if(vs.getInfo() == v) {
                        v2 = vs;
                        break;
                    }
                }
            }else {
                vIntegers.add(v);
                v2 = new Vertice(v);
                g.addVertices(v2);
            }

            v1.addArestas(new Aresta(v1, v2, w));
            v2.addArestas(new Aresta(v2, v1, w));
        }

        scanner.close();

        List<Aresta> arestas = new ArrayList<Aresta>();

        Vertice posMaior = null;
        Integer totalMaior = 0;

        for(Vertice vs : g.getVertices()) {
            if(posMaior != null) {
                vs = posMaior;
            }

            vs.setVisited(true);
            arestas = vs.getArestas();

            Integer maior = 0;

            for(Aresta as : arestas) {
                if(as.getVertice2().isVisited()) {
                    continue;
                }

                if(as.getPeso() > maior) {
                    maior = as.getPeso();
                    posMaior = as.getVertice2();
                }
            }

            totalMaior += maior;
        }

        System.out.println(totalMaior);

        g.resetVisited();

        Vertice posMenor = null;
        Integer totalMenor = 0;

        for(Vertice vs : g.getVertices()) {
            if(posMenor != null) {
                vs = posMenor;
            }

            vs.setVisited(true);
            arestas = vs.getArestas();

            Integer menor = 201;

            for(Aresta as : arestas) {
                if(as.getVertice2().isVisited()) {
                    continue;
                }

                if(as.getPeso() < menor) {
                    menor = as.getPeso();
                    posMenor = as.getVertice2();
                }
            }

            if(menor == 201) {
                continue;
            }

            totalMenor += menor;
        }

        System.out.println(totalMenor);
    }
}
