package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArreglosTest {

    @Test
    void sumaArreglo() {
        int[] enteros = {1,2,3,4};
        assertEquals(10, Arreglos.sumaArreglo(enteros));
    }

    @Test
    void multiplicacionArreglo() {
        int[] enteros = {1,2,3,4};
        int[] respuesta = {2,4,6,8};
        assertArrayEquals(respuesta, Arreglos.multiplicacionArreglo(enteros, 2));
    }

    @Test
    void numerosParesArreglo() {
        int[] enteros = {1,2,3,4};
        assertEquals(2, Arreglos.numerosParesArreglo(enteros));
    }

    @Test
    void numerosImparesArreglo() {
        int[] enteros = {1,2,3,4};
        assertEquals(2, Arreglos.numerosImparesArreglo(enteros));
    }

    @Test
    void arregloDeArreglos() {
        int[] enteros = {1,2,3,4,5};
        int[][] arregloTotal = {{1,2,0},{3,4,5}};
        assertArrayEquals(arregloTotal, Arreglos.arregloDeArreglos(enteros, 3));
    }
}