/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut4_hernandez_bascialla_pijuan;

import java.util.ArrayList;

/**
 *
 * @author Ale_macbook
 */
public class UT4_Hernandez_Bascialla_Pijuan {

    public static void main(String[] args) {
        Archivos lecturaNumeros = new Archivos();
        ArrayList<Integer> numbersList = new ArrayList<>();
        
        numbersList = lecturaNumeros.leerArchivosNumericos();
        NodeBinario arbolBB1 = new NodeBinario(numbersList.get(0));
        for (int i = 1 ; i < numbersList.size() ; i++) {
            arbolBB1.add(numbersList.get(i));
        }
        
        //Prueba de que el arbol esta creado bien.
        lecturaNumeros.leerArchivos();
        System.out.println("------\nLista guardada: " + numbersList);
        System.out.println("------\nIn Order del arbol:");
        arbolBB1.printInOrder();
        
    }
}
