/*
    Ejercicio 4: Crear y cargar una matriz de tamaño n x m, 
    mostrar la suma de cada fila y de cada columna.
 */

import static Matrices.Matriz.*;

/**
 *
 * @author Aylen
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int matriz[][] = {{-4, -7, 12},
                          {22, -4, -6},
                          {64, 77, 90}};
        int sumaFil, sumaCol;
        
        System.out.println("Matriz: ");
        mostrarMatriz(matriz);
        
        // Sumamos filas y columnas
        for (int i = 0; i < 3; i++) {
            sumaFil = 0;
            sumaCol = 0;
            
            for (int j = 0; j < 3; j++) {
                sumaFil += matriz[i][j];
                sumaCol += matriz[j][i];
            }
            
            System.out.println("La suma de la fila " + i + " es: " + sumaFil);
            System.out.println("La suma de la col " + i + " es: " + sumaCol);
        }
    }
}
