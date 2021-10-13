/*
    Ejercicio 3: Crear y cargar una matriz de tamaño 3 x 3, 
    transponerla y mostrarla.
 */

import static Matrices.Matriz.*;

/**
 *
 * @author Aylen
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int matriz[][] = {{-4, -7, 12},
                          {22, -4, -6},
                          {64, 77, 90}};
        
        System.out.println("Matriz original: ");
        mostrarMatriz(matriz);
        
        
        // Transpongo sobre la misma matriz
        transponerMatriz(matriz, 3, 3);
        
        
        System.out.println("\nMatriz transpuesta: ");
        mostrarMatriz(matriz);
    }
    
    public static void transponerMatriz(int mat[][], int fil, int col) {
        int aux;
        
        for (int i = 0; i < fil; i++) {
            for (int j = i + 1; j < col; j++) {
                aux = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = aux;
            }
        }
    }
}
