/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4_hernandez_bascialla_pijuan;

/**
 *
 * @author Ale_macbook
 */

public class NodeTamanio {
    public int getTamanio(NodeBinario nodo) {
        if (nodo == null) {
            return 0;
        } else {
            int izq = getTamanio(nodo.getLeft());
            int der = getTamanio(nodo.getRight());
            return izq + der + 1;
        }
    }
}
