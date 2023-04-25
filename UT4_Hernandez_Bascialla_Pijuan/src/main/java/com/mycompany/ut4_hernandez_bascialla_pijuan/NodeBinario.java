/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut4_hernandez_bascialla_pijuan;

import java.util.Optional;

/**
 *
 * @author User
 */
public class NodeBinario {

    private Integer value;
    private NodeBinario left;
    private NodeBinario right;

    public NodeBinario(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public NodeBinario getLeft() {
        return left;
    }

    public void setLeft(NodeBinario left) {
        this.left = left;
    }

    public NodeBinario getRight() {
        return right;
    }

    public void setRight(NodeBinario right) {
        this.right = right;
    }

    public void add(Integer value) {
        if (value < this.value) {
            if (left != null) {
                left.add(value);
            } else {
                left = new NodeBinario(value);
            }
        } else {
            if (right != null) {
                right.add(value);
            } else {
                right = new NodeBinario(value);
            }
        }
    }

    public Optional<NodeBinario> find(Integer value) {
        if (value == this.value) {
            return Optional.of(this);
        } else if (value < this.value) {
            if (this.left != null) {
                return this.left.find(value);
            } else {
                return Optional.empty();
            }
        } else {
            if (this.right != null) {
                return this.right.find(value);
            } else {
                return Optional.empty();
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(value);
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(value);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPosOrder() {
        if (left != null) {
            left.printPosOrder();
        }
        if (right != null) {
            right.printPosOrder();
        }
        System.out.println(value);
    }
    
    
    
      
    
    
    
    

    @Override
    public String toString() {
        return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
    }

}
