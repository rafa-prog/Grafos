import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();

        while(n != 0) {
            Integer A, B;
            
            Aresta[][] mat = new Aresta[n][n];

            Grafo g = new Grafo(n, mat);

            g.resetMat();

            A = scanner.nextInt();
            B = scanner.nextInt();

            //k = 0
            while(A != 0 || B != 0) {
                mat[A - 1][B - 1].setV(A);
                mat[A - 1][B - 1].setEmpresas(scanner.nextLine().replace(" ", ""));
                
                A = scanner.nextInt();
                B = scanner.nextInt();
            }

            g.ListMat();

            g.FloydWarshall();

            A = scanner.nextInt();
            B = scanner.nextInt();

            g.ListMat();

            while(A != 0 || B != 0) {



                A = scanner.nextInt();
                B = scanner.nextInt();
            }

            n = scanner.nextInt();
        }

        scanner.close();
    }
}
