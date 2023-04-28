/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ut4_hernandez_bascialla_pijuan;

import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ale_macbook
 */
public class NodeBinarioTest {

    public NodeBinarioTest() {
    }

    /**
     * Test of getValue method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testGetValue() {
        System.out.println("getValue");

        NodeBinario instance = new NodeBinario(10);

        Integer expResult = 10;
        Integer result = instance.getValue();

        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testSetValue() {
        System.out.println("setValue");

        Integer value = 5;
        NodeBinario instance = new NodeBinario(value);

        instance.setValue(value);
    }

    /**
     * Test of getLeft method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testGetLeft() {
        System.out.println("getLeft");

        NodeBinario instance = new NodeBinario(5);
        instance.add(3);

        NodeBinario expResult = new NodeBinario(3);
        NodeBinario result = instance.getLeft();

        assertEquals(expResult, result);
    }

    /**
     * Test of setLeft method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testSetLeft() {
        System.out.println("setLeft");

        NodeBinario instance = new NodeBinario(10);
        NodeBinario left = new NodeBinario(4);

        instance.setLeft(left);
    }

    /**
     * Test of getRight method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testGetRight() {
        System.out.println("getRight");

        NodeBinario instance = new NodeBinario(10);
        NodeBinario expResult = new NodeBinario(15);

        instance.setRight(expResult);
        NodeBinario result = instance.getRight();

        assertEquals(expResult, result);
    }

    /**
     * Test of setRight method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testSetRight() {
        System.out.println("setRight");

        NodeBinario instance = new NodeBinario(10);
        NodeBinario right = new NodeBinario(15);

        instance.setRight(right);
    }

    /**
     * Test of add method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        System.out.println("add");

        NodeBinario instance = new NodeBinario(10);
        Integer value = 5;

        instance.add(value);
    }

    /**
     * Test of find method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testFind() {
        System.out.println("find");

        NodeBinario instance = new NodeBinario(10);
        Integer value = 5;
        instance.add(value);

        Optional<NodeBinario> expResult = Optional.of(instance.getLeft());
        Optional<NodeBinario> result = instance.find(value);

        assertEquals(expResult, result);
    }

    /**
     * Test of printInOrder method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testPrintInOrder() {
        System.out.println("printInOrder");

        NodeBinario instance = new NodeBinario(10);
        instance.add(5);
        instance.add(20);

        instance.printInOrder();
        System.out.println("Expected order: [5, 10, 20].");
    }

    /**
     * Test of printPreOrder method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testPrintPreOrder() {
        System.out.println("printPreOrder");

        NodeBinario instance = new NodeBinario(10);
        instance.add(5);
        instance.add(20);

        instance.printPreOrder();
        System.out.println("Expected order: [10, 5, 20].");
    }

    /**
     * Test of printPosOrder method, of class NodeBinario.
     */
    @org.junit.jupiter.api.Test
    public void testPrintPosOrder() {
        System.out.println("printPosOrder");

        NodeBinario instance = new NodeBinario(10);
        instance.add(5);
        instance.add(20);

        instance.printPosOrder();
        System.out.println("Expected order: [5, 20, 10].");
    }

}
