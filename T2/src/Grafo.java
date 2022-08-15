import java.util.ArrayList;
import java.util.List;

class Grafo {

    public Grafo() {}

    int Find(List<Integer> parente, int x) {
        while(parente.get(x) != x) {
            parente.set(x, parente.get(parente.get(x)));
            x = parente.get(x);
        }

        return x;
    }

    public void Union(List<Integer> parente, int x, int y) {
        Integer p = Find(parente, x);
        Integer q = Find(parente, y);
        parente.set(p, parente.get(q));
    }

    public Integer MSTKruskal(List<Aresta> arestas, int vertices) {
        Integer i, total = 0;

        List<Integer> parente = new ArrayList<Integer>();

        for(i = 0; i < arestas.size()+1; i++) {
            parente.add(i);
        }


        for(i = 0; i < arestas.size(); ++i) {

            Integer u = arestas.get(i).getvIn();
            Integer v = arestas.get(i).getvOut();
            Integer custo = arestas.get(i).getPeso();

            if(Find(parente, u) != Find(parente, v)) {
                total += custo;
                Union(parente, u, v);
            }
        }

        return total;
    }
}
