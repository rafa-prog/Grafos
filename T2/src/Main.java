import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();

        Grafo g = new Grafo();
        Aresta a;

        List<Integer> iList = new ArrayList<Integer>(); 
        List<Aresta> aList = new ArrayList<Aresta>();

        for (int i = 0; i < n; i++) {
            Integer u = scanner.nextInt();
            Integer v = scanner.nextInt();
            Integer w = scanner.nextInt();

            if(!iList.contains(u)) {
                iList.add(u);
            }

            if(!iList.contains(v)) {
                iList.add(v);
            }

            a = new Aresta(w, u, v);
            aList.add(a);
        }

        scanner.close();

        Collections.sort(aList, new SortByPeso());
        System.out.println(g.MSTKruskal(aList, iList.size()));

        Collections.sort(aList, new SortByPeso().reversed());
        System.out.println(g.MSTKruskal(aList, iList.size()));
    }
}
