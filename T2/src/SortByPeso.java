import java.util.Comparator;

class SortByPeso implements Comparator<Aresta>  {
    public int compare(Aresta a1, Aresta a2) {
        return a2.getPeso() - a1.getPeso();
    }
    
}
