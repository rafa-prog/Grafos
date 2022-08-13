import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grafo {

    public class Subconjunto {
        private Integer pai, valor;
    }

    public Grafo() {}

    public Integer Find(List<Subconjunto> subconjuntos, Integer k) {
        
        if(subconjuntos.get(k).pai == k) {
            return subconjuntos.get(k).pai;
        }

        return Find(subconjuntos, subconjuntos.get(k).pai);
    }

    public void Union(List<Subconjunto> subconjuntos, int u, int v) {
        int nextU = Find(subconjuntos, u);
        int nextV = Find(subconjuntos, v);

        if(subconjuntos.get(nextU).valor < subconjuntos.get(nextV).valor) {
            subconjuntos.get(nextU).pai = nextV;
        }else if(subconjuntos.get(nextU).valor > subconjuntos.get(nextV).valor) {
            subconjuntos.get(nextV).pai = nextU;
        }else {
            subconjuntos.get(nextV).pai = nextU;
            subconjuntos.get(nextU).valor++;
        }
    }

    public Integer MSTKruskal(List<Aresta> arestas, int vertices) {
        Integer total = 0;
        Integer i = 0;
        Integer j = 0;

        List<Aresta> arestasResult = arestas;

        List<Subconjunto> subconjuntos = new ArrayList<Subconjunto>();

        for(i = 0; i < vertices; i++) {
            subconjuntos.add(new Subconjunto());
        }
        
        for(i = 0; i < vertices; i++) {
            subconjuntos.get(i).pai = i;
            subconjuntos.get(i).valor = 0;
        }

        i = 0;

        while (j < vertices - 1) {  
            Aresta proxAresta;  
            proxAresta = arestas.get(i++);  
              
            int nextU = Find(subconjuntos, proxAresta.getvIn());  
            int nextV = Find(subconjuntos, proxAresta.getvOut());  
            
            if (nextU != nextV) {  
                arestasResult.add(proxAresta);
                total += proxAresta.getPeso();
                Union(subconjuntos, nextU, nextV);
                j++;
            }  
        }
        
        

        return total;
    }
}
