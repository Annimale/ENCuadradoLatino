/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.encuadradolatinotest;

/**
 *
 * @author skril
 */
import java.util.Arrays;

public class CuadradoLatino {

    

    public  int[][] generarCuadradoLatino(int n) {
        int[][] cuadrado = new int[n][n];

        // Inicializar la primera fila con números del 1 al n
        for (int i = 0; i < n; i++) {
            cuadrado[0][i] = i + 1;
        }

        // Generar el resto de las filas
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado[i][j] = (cuadrado[i - 1][j] + 1) % n;
                if (cuadrado[i][j] == 0) {
                    cuadrado[i][j] = n;
                }
            }
        }

        return cuadrado;
    }

   
}