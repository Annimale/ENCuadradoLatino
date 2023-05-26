/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.encuadradolatinotest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skril
 */
public class CuadradoLatinoTest {

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class CuadradoLatino.
     */
    /**
     * Test of generarCuadradoLatino method, of class CuadradoLatino.
     */
    @Test
    public void testHAPPYPATH() {
        System.out.println("testHAPPYPATH");
        int n = 3;
        CuadradoLatino c1 = new CuadradoLatino();

        int[][] expResult = {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        };
        int[][] result = c1.generarCuadradoLatino(n);
        assertArrayEquals(expResult, result);

    }

    @Test
    public void testMinimo() {
        System.out.println("testMinimo");
        int n = 1;
        CuadradoLatino c1 = new CuadradoLatino();

        int[][] expResult = {
            {1}
        };
        int[][] result = c1.generarCuadradoLatino(n);
        assertArrayEquals(expResult, result);

    }

    @Test
    public void testHAPPYPATHpar() {
        System.out.println("testHAPPYPATHpar");
        int n = 4;
        CuadradoLatino c1 = new CuadradoLatino();

        int[][] expResult = {
            {1, 2, 3, 4},
            {2, 3, 4, 1},
            {3, 4, 1, 2},
            {4, 1, 2, 3}
        };
        int[][] result = c1.generarCuadradoLatino(n);
        assertArrayEquals(expResult, result);

    }

    @Test
    public void TESTVACIO() {
        System.out.println("TESTVACIO");
        int n = 0;
        CuadradoLatino c1 = new CuadradoLatino();

        int[][] expResult = {};
        int[][] result = c1.generarCuadradoLatino(n);
        assertArrayEquals(expResult, result);

    }
}
