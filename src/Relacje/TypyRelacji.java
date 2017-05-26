/*
Program bada relacje na elementach zbioru.
 */
package Relacje;

public class TypyRelacji {
    // jeśli relacja jest zwrotna nie może być przecizwrotna
    // sprawdzamy wynik po przekątnej macierzy
    int CzyZwrotna(int[][] R, int n) {
        int i;
        for (i = 0; i < n; i++) {
            if (R[i][i] == 0) {
                return 0;
            }
        }
        return 1;
    }
    // przekątnej nie sprawdzamy
    // jeśli wszystkim R[i][j] odpowiadają R[j][i] relacja jest symetryczna
    // (czyli są sobie równe)
    int CzySymetryczna(int[][] R, int n) {
        int i, j;
        for (i = 0; i < n-1; i++) {
            for (j = i+1; j < n; j++) {
                if (R[i][j] != R[j][i]) {
                    return 0;
                }
            }
        }
        return 1;   
    }
    // antysemetryczna + przecizwrotna = asymetryczna lub przeciwsymetryczna
    
    // każdy element musi mieć conajmniej dwie relacje z innymi elementami
    int CzySpojna(int[][] R, int n) {
        int i, j;
        for (i = 0; i < n-1; i++) {
            for (j = i+1; j < n; j++) {
                if (!(R[i][j] == 0 || R[j][i] == 0)) {
                    return 1;
                }
            }
        }
        return 0;   
    }
}
