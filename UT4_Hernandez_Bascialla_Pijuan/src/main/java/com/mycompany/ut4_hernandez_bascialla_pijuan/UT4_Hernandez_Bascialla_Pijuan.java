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
        
        NodeAltura nodeAltura = new NodeAltura();
        NodeTamanio nodeTamanio = new NodeTamanio();
        NodeHojas nodeHojas = new NodeHojas();
        NodeInternos nodeInternos = new NodeInternos();
        
        System.out.println("Altura del arbol: " + nodeAltura.getAltura(arbolBB1) + " (expected: 5)");
        System.out.println("Tamaño del arbol: " + nodeTamanio.getTamanio(arbolBB1) + " (expected: 12)");
        System.out.println("Hojas del arbol: " + nodeHojas.getCantidadHojas(arbolBB1) + " (expected: 5)");
        System.out.println("Nodos Internos del arbol: " + nodeInternos.getCantidadInternos(arbolBB1) + " (expected: 6)");
    }
}
