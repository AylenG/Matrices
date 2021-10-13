
/*
    Ejercicio 2: Crear y cargar dos matrices de tamaño 3 x 3, 
    sumarlas y mostrar su suma.
 */

import static Matrices.Matriz.*;

/**
 *
 * @author Aylen
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3},
                          {2, 4, 7},
                          {4, 7, 9}};
        
        int suma[][] = new int[3][3];
        
        System.out.println("Matriz A: ");
        mostrarMatriz(matriz, 3, 3);
        
        
        // Realizo la suma A + A
        sumarMatrices(matriz, matriz, suma, 3, 3);
        
        System.out.println("Suma A + A: ");
        mostrarMatriz(suma);
    }
    
    public static void sumarMatrices(int mat1[][], int mat2[][], int suma[][], int fil, int col) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                suma[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }
}
