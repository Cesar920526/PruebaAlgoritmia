package org.example;

import java.util.ArrayList;

public class Arreglos {
    public static int sumaArreglo(ArrayList<Integer> enteros){
        int sumaTotal=0;

        for(int i = 0; i < enteros.size(); i++){
            sumaTotal+= enteros.get(i);
        }
        return sumaTotal;
    }

    public static ArrayList<Integer> multiplicacionArreglo(ArrayList<Integer> enteros, int multiplicador){

        for (int i = 0; i < enteros.size(); i++){
            int valor = enteros.get(i) * multiplicador;
            enteros.set(i, valor);
        }

        return enteros;
    }

    public static int numerosParesArreglo(ArrayList<Integer> enteros){
        int resultadoPares = 0;

        for(int i = 0; i < enteros.size(); i++){
            if(enteros.get(i)%2 == 0){
                resultadoPares += 1;
            }
        }
        return resultadoPares;
    }

    public static int numerosImparesArreglo(ArrayList<Integer> enteros){
        int resultadoImpares = 0;

        for (int i = 0; i < enteros.size(); i++){
            if(enteros.get(i)%2 != 0 && enteros.get(i) != 0){
                resultadoImpares += 1;
            }
        }
        return resultadoImpares;
    }

    public static ArrayList<ArrayList> arregloDeArreglos(ArrayList<Integer> enteros, int numero){
        ArrayList<Integer> enterosMenores = new ArrayList<>();
        ArrayList<Integer> enterosMayores = new ArrayList<>();
        ArrayList<ArrayList> arregloTotal = new ArrayList<>();

        for(int i = 0; i <= enteros.size(); i++){
            if(enteros.get(i) < numero){
                int numero1 = enteros.get(i);
                enterosMenores.add(numero1);
            } else if (enteros.get(i) >= numero) {
                int numero2 = enteros.get(i);
                enterosMayores.add(numero2);
            }
        }
        arregloTotal.add(enterosMenores);
        arregloTotal.add(enterosMayores);
        return arregloTotal;
    }

    
}
