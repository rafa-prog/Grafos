#include <iostream>

using namespace std;

#define MAX 200
#define VALORES 26

int mat[MAX][MAX][VALORES];

void FloydWarshall(int n) {
    for(int k = 0; k < n; k++) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int l = 0; l < VALORES; l++) {
                    mat[i][j][l] = min(mat[i][j][l], mat[i][k][l] + mat[k][j][l]);
                }
            }
        }
    }
}

int main() {
    int a, b, n, i, j, l;
    bool temEmpresa;
    string empresas;

    temEmpresa = false;
    cin >> n;

    while(n != 0) {
        for (i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                for(l = 0; l < VALORES; l++) {
                    mat[i][j][l] = MAX + 1;
                }
            }
        }

        cin >> a >> b;

        while(a != 0 && b != 0) {
            cin >> empresas;

            for(i = 0; i < empresas.size(); i++) {
                mat[a - 1][b - 1][empresas[i] - 'a'] = 1;
            }

            cin >> a >> b;
        }

        FloydWarshall(n);

        cin >> a >> b;

        while(a != 0 && b != 0) {
            temEmpresa = false;
            empresas = "";

            for(int i = 0; i < VALORES; i++) {
                if(mat[a - 1][b - 1][i] != 201) {

                    temEmpresa = true;
                    empresas += (i + 'a');
                }
                
            }

            if(!temEmpresa) {
                cout << "-" << endl;
            }else {
                cout << empresas << endl;
            }

            cin >> a >> b;
        }

        cout << endl;

        cin >> n;
    }

    return 0;
}
