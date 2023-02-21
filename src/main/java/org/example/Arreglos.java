package org.example;

import java.util.ArrayList;

public class Arreglos {
    public static int sumaArreglo(int[] enteros){
        int sumaTotal=0;

        for(int i = 0; i < enteros.length; i++){
            sumaTotal+= enteros[i];
        }
        return sumaTotal;
    }

    public static int[] multiplicacionArreglo(int[] enteros, int multiplicador){

        for (int i = 0; i < enteros.length; i++){
            int valor = enteros[i] * multiplicador;
            enteros[i] = valor;
        }

        return enteros;
    }

    public static int numerosParesArreglo(int[] enteros){
        int resultadoPares = 0;

        for(int i = 0; i < enteros.length; i++){
            if(enteros[i]%2 == 0){
                resultadoPares += 1;
            }
        }
        return resultadoPares;
    }

    public static int numerosImparesArreglo(int[] enteros){
        int resultadoImpares = 0;

        for (int i = 0; i < enteros.length; i++){
            if(enteros[i]%2 != 0 && enteros[i] != 0){
                resultadoImpares += 1;
            }
        }
        return resultadoImpares;
    }

    public static int[][] arregloDeArreglos(int[] enteros, int numero){
        int[] enterosMenores = new int[2];
        int[] enterosMayores = new int[3];
        int[][] arregloTotal = new int[2][3];
        int j = 0;

        for(int i = 0; i < enteros.length; i++){
            if(enteros[i] < numero){
                int numero1 = enteros[i];
                enterosMenores[i] = numero1;
                arregloTotal[0][i] = enterosMenores[i];
            } else if (enteros[i] >= numero) {
                int numero2 = enteros[i];
                enterosMayores[j] = numero2;
                arregloTotal[1][j] = enterosMayores[j];
                j++;
            }
        }

        return arregloTotal;
    }

    
}
