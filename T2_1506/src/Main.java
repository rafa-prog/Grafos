import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer t, n, m;

        t = scanner.nextInt();
        n = scanner.nextInt();
        m = scanner.nextInt();

        Grafo g = new Grafo(n, m);
        Aresta a;

        List<Integer> iList = new ArrayList<Integer>(); 
        List<Aresta> aList = new ArrayList<Aresta>();

        for (int i = 0; i < t; i++) {
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
        
        Integer k, p;

        k = scanner.nextInt();
        p = scanner.nextInt();

        int kVet[] = new int[n];

        for(int i = 0; i < k; i++) {
            Integer kAux =  scanner.nextInt();
            kVet[kAux - 1] = kAux;
        }
    }
}