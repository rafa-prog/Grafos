import java.util.Comparator;

public class SortByPeso implements Comparator<Aresta>  {
    public int compare(Aresta a1, Aresta a2) {
        return a1.getPeso() - a2.getPeso();
    }
    
}
