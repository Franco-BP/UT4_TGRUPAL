/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4_hernandez_bascialla_pijuan;

/**
 *
 * @author Ale_macbook
 */
public class NodeHojas {
    public int getCantidadHojas(NodeBinario node) {
        int izq = 0;
        int der = 0;
        int hoja = 1;
        
        if (node.getLeft() != null) {
            izq = this.getCantidadHojas(node.getLeft());
            hoja = 0;
        }
        if (node.getRight() != null) {
            der = this.getCantidadHojas(node.getRight());
            hoja = 0;
        }
        return izq + der + hoja;
       
    }
}
