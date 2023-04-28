/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4_hernandez_bascialla_pijuan;

/**
 *
 * @author Ale_macbook
 */
public class NodeInternos {
    public int getCantidadInternos(NodeBinario node) {
        int izq = 0;
        int der = 0;
        
        if (node.getLeft() != null) {
            izq = this.getCantidadRecursivo(node.getLeft());
        }
        if (node.getRight() != null) {
            der = this.getCantidadRecursivo(node.getRight());
        }
        return izq + der;
    }
    
    private int getCantidadRecursivo(NodeBinario node) {
        int izq = 0;
        int der = 0;
        int interno = 0;
        
        if (node.getLeft() != null) {
            izq = this.getCantidadRecursivo(node.getLeft());
            interno = 1;
        }
        if (node.getRight() != null) {
            der = this.getCantidadRecursivo(node.getRight());
            interno = 1;
        }
        return izq + der + interno;
       
    }
}
