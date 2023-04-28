/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ut4_hernandez_bascialla_pijuan;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ale_macbook
 */
public class ArchivosTest {
    
    public ArchivosTest() {
    }

    /**
     * Test of leerArchivos method, of class Archivos.
     */
    @Test
    public void testLeerArchivos() {
        System.out.println("leerArchivos");
        
        Archivos instance = new Archivos();
        
        instance.leerArchivos();
        System.out.println("Expected numbers: [5, 12, 23, 9, 19, 20, 1, 25, 14, 6, 8, 18]");
    }

    /**
     * Test of leerArchivosNumericos method, of class Archivos.
     */
    @Test
    public void testLeerArchivosNumericos() {
        System.out.println("leerArchivosNumericos");
        
        Archivos instance = new Archivos();
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(5);
        expResult.add(12);
        expResult.add(23);
        expResult.add(9);
        expResult.add(19);
        expResult.add(20);
        expResult.add(1);
        expResult.add(25);
        expResult.add(14);
        expResult.add(6);
        expResult.add(8);
        expResult.add(18);
        
        ArrayList<Integer> result = instance.leerArchivosNumericos();
        
        assertEquals(expResult, result);
    }
    
}
