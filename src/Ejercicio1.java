
/*
    Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si 
    es simétrica o no. Una matriz es simétrica cuando:
	-- Es cuadrada (filas == columnas).
        -- Cuando se obtiene la misma matriz al cambiar sus filas por 
           columnas (matriz transpuesta).
 */

import static Matrices.Matriz.*;

/**
 *
 * @author Aylen
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3},
                          {2, 4, 7},
                          {4, 7, 9}};

        mostrarMatriz(matriz, 3, 3);

        if (esSimetrica(matriz, 3, 3)) {
            System.out.println("\nLa matriz es simétrica!");
        } else {
            System.out.println("\nLa matriz NO es simétrica.");
        }
    }

    public static boolean esSimetrica(int mat[][], int fil, int col) {
        if (fil != col) {
            return false;
        }

        for (int i = 0; i < fil; i++) {
            for (int j = i + 1; j < col; j++) {
                if (mat[i][j] != mat[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
