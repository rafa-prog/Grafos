import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Grafo g = new Grafo();

        Integer n = scanner.nextInt();

        List<Integer> iList = new ArrayList<Integer>(); 

        while(n != 0) {
            Integer A, B;
            
            Integer[][] mat = new Integer[n][n];

            resetMat(n, mat);

            A = scanner.nextInt();
            B = scanner.nextInt();

            while(A != 0 || B != 0) {
                

                A = scanner.nextInt();
                B = scanner.nextInt();
            }

            n = scanner.nextInt();
        }

        scanner.close();
    }

    public static Integer[][] resetMat(Integer n, Integer[][] mat) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    mat[i][j] = 0;
                }else if(i != j) {
                    mat[i][j] = null;
                }
            }
        }
        return mat;
    }
}
