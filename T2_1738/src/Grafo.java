import java.util.ArrayList;
import java.util.List;

public class Grafo {
    Integer n;
    Aresta[][] mat;
    List<Character> empresas; 

    Grafo(Integer n, Aresta[][] mat) {
        this.n = n;
        this.mat = mat;
        this.empresas = new ArrayList<>();
    }

    public void ListMat() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j].getV() + ":" + mat[i][j].getEmpresas() + ", ");
            }
            System.out.println('\n');
        }
    }

    public Aresta[][] resetMat() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                Integer v = i == j ? 0 : -1;
                String empresas = "-";

                mat[i][j] = new Aresta(v, empresas);
            }
        }
        return mat;
    }

    public void FloydWarshall() {
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                if(k == i) {
                    continue;
                }

                if(mat[i][k].v == i) {
                    for(int j = 0; j < n; j++) {
                        if(i == j && mat[i][j].v != null) {
                            continue;
                        }

                        mat[i][j].setV(k + 1);
                    }
                } 
            }
        }
    }
}
