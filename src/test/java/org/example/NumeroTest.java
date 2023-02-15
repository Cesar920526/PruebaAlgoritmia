package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeroTest {

    @Test
    void numeroMaximo() {
        assertEquals(5,Numero.numeroMaximo(5,4));
    }

    @Test
    void numeroMinimo() {
        assertEquals(-3, Numero.numeroMinimo(5,-3));
    }

    @Test
    void numeroPar() {
        assertEquals(true, Numero.numeroPar(100));
    }

    @Test
    void numeroImpar() {
        assertEquals(true, Numero.numeroImpar(85));
    }

    @Test
    void funcionExponencial() {
        assertEquals(1, Numero.funcionExponencial(2,0));
    }
}