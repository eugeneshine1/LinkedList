package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node = new Node();

        singlyLinkedList.add(node);

        Assert.assertTrue(singlyLinkedList.contains(node));
    }

    @Test
    public void removeTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node = new Node();
        Node node1 = new Node();
        Node node2 = new Node();

        singlyLinkedList.add(node);
        singlyLinkedList.add(node1);
        singlyLinkedList.add(node2);
        singlyLinkedList.remove(node1);

        Assert.assertFalse(singlyLinkedList.contains(node1));
    }

    @Test
    public void copyTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node = new Node();
        Node node1 = new Node();
        Node node2 = new Node();

        singlyLinkedList.add(node);
        singlyLinkedList.add(node1);
        singlyLinkedList.add(node2);
        Node [] copy = singlyLinkedList.copy();

        Assert.assertEquals(singlyLinkedList.getSinglyLinkedList(),copy);
    }
}
