package org.example;

public class Numero {
    public static int numeroMaximo(int a, int b){
        int maximo = 0;

        if(a>b){
            maximo = a;
        }else if(a<b){
            maximo = b;
        }
        return maximo;
    }

    public static int numeroMinimo(int a, int b){
        int minimo = 0;

        if(a>b){
            minimo = b;
        } else if (a<b) {
            minimo = a;
        }
        return minimo;
    }

    public static boolean numeroPar(int a){
        boolean esPar;

        if(a%2 == 0){
            esPar = true;
        }else {
            esPar = false;
        }

        return esPar;
    }

    public static boolean numeroImpar(int a){
        boolean esImpar;

        if (a%2 != 0){
            esImpar = true;
        }else {
            esImpar = false;
        }

        return esImpar;
    }

    public static int funcionExponencial(int base, int exponente){
        int resultado = 1;

        if(base > 0 && exponente == 0){
            resultado = 1;
        }else if (base == 0 && exponente >= 1){
            resultado = 0;
        }else {
            for(int i = 1; i<= exponente; i++){
                resultado = resultado*base;
            }
        }
        return resultado;
    }
}
