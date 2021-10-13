
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
    
    public static void generarMatIdentidad(int mat[][], int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if( i == j ) {
                    mat[i][j] = 1;
                }
                else {
                    mat[i][j] = 0;
                }
            }
        }
    }
    
    // Matriz marco: todos los elementos deben ser 0 y los bordes 1
    public static void generarMatMarco(int mat[][], int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if( i == 0 || i == fil-1 || j == 0 || j == col-1) {
                    mat[i][j] = 1;
                }
                else {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
