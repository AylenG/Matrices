
package Matrices;

import java.util.Scanner;

/**
 *
 * @author Aylen
 */

public class Matriz {
    public static void llenarMatriz(int mat[][], int fil, int col) {
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < fil; i++) {
            for(int j = 0; j < col; j++) {
                System.out.println("Matriz [" + i + "][" + j + "]: ");
                mat[i][j] = entrada.nextInt();
            }
        }
    }
    
    public static void mostrarMatriz(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarMatriz(int mat[][], int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
