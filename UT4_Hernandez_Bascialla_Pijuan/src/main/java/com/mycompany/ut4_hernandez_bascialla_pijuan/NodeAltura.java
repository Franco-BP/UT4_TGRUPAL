/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4_hernandez_bascialla_pijuan;

/**
 *
 * @author Ale_macbook
 */

public class NodeAltura {
    public int getAltura(NodeBinario nodo) {
        if(nodo == null) {
            return -1;
        }else {
            int izq = getAltura(nodo.getLeft());
            int der= getAltura(nodo.getRight());
            return Math.max(izq, der) + 1;
        }
    }
}
