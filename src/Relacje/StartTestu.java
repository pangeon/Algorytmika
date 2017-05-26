
package Relacje;

public class StartTestu {

    public static void main(String[] args) {
        TypyRelacji zwrotna = new TypyRelacji();
        int n = 4;
        int R[][] = new int[4][4];
        // WIERSZ 1
        R[0][0] = 1; // 1,1
        R[0][1] = 0; // 1,2
        R[0][2] = 0; // 1,3
        R[0][3] = 0; // 1,4
        // WIERSZ 2
        R[1][0] = 0; // 2,1
        R[1][1] = 1; // 2,2
        R[1][2] = 0; // 2,3
        R[1][3] = 0; // 2,4
        // WIERSZ 3
        R[2][0] = 0; // 3,1
        R[2][1] = 0; // 3,2
        R[2][2] = 1; // 3,3
        R[2][3] = 0; // 3,4
        // WIERSZ 4
        R[3][0] = 0; // 4,1
        R[3][1] = 0; // 4,2
        R[3][2] = 0; // 4,3
        R[3][3] = 1; // 4,4
        
        if (zwrotna.CzyZwrotna(R, n) == 1) {
            System.out.println("Relacja jest zwrotna");
        } else {
            System.out.println("Relacja nie jest zwrotna");
        }
        if (zwrotna.CzySymetryczna(R, n) == 1) {
            System.out.println("Relacja jest symetryczna");
        } else {
            System.out.println("Relacja nie jest symetryczna");
        }
        if (zwrotna.CzySpojna(R, n) == 1) {
            System.out.println("Relacja jest spójna");
        } else {
            System.out.println("Relacja nie jest spójna");
        }
        
    }
    
}
