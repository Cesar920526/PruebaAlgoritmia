package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArreglosTest {

    @Test
    void sumaArreglo() {
        ArrayList<Integer> arregloDeNumero = new ArrayList<>();
        arregloDeNumero.add(1);
        arregloDeNumero.add(2);
        arregloDeNumero.add(3);
        arregloDeNumero.add(4);

        assertEquals(10, arregloDeNumero);
    }

    @Test
    void multiplicacionArreglo() {
        ArrayList<Integer> arregloDeNumero = new ArrayList<>();
        arregloDeNumero.add(1);
        arregloDeNumero.add(2);
        arregloDeNumero.add(3);
        arregloDeNumero.add(4);

        assertEquals(24, arregloDeNumero);
    }

    @Test
    void numerosParesArreglo() {
        ArrayList<Integer> arregloDeNumero = new ArrayList<>();
        arregloDeNumero.add(0);
        arregloDeNumero.add(1);
        arregloDeNumero.add(2);
        arregloDeNumero.add(3);
        arregloDeNumero.add(4);

        assertEquals(3, arregloDeNumero);
    }

    @Test
    void numerosImparesArreglo() {
        ArrayList<Integer> arregloDeNumero = new ArrayList<>();
        arregloDeNumero.add(0);
        arregloDeNumero.add(1);
        arregloDeNumero.add(2);
        arregloDeNumero.add(3);
        arregloDeNumero.add(4);

        assertEquals(2, arregloDeNumero);
    }

    @Test
    void arregloDeArreglos() {
        ArrayList<Integer> arregloDeNumero = new ArrayList<>();
        arregloDeNumero.add(0);
        arregloDeNumero.add(1);
        arregloDeNumero.add(2);
        arregloDeNumero.add(3);
        arregloDeNumero.add(4);

        assertArrayEquals();
    }
}