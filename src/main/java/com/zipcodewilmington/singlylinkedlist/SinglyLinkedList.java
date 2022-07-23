package com.zipcodewilmington.singlylinkedlist;

import java.util.Arrays;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private static Node[] singlyLinkedList = new Node[0];

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(Node[] nodeArray) {
        singlyLinkedList = nodeArray;
    }

    public void add(Node node) {
        Node [] addedList = new Node[singlyLinkedList.length+1];
        System.arraycopy(singlyLinkedList, 0, addedList, 0, singlyLinkedList.length);
        addedList[singlyLinkedList.length] = node;
        singlyLinkedList= addedList;
    }

    public void remove(Node node) {
        if (contains(node)) {
            Integer index = find(node);
            Node [] minusList = new Node[singlyLinkedList.length-1];
            for(int x = 0; x<index;x++) {
                minusList[x] = singlyLinkedList[x];
            }
            for(int x = index; x<singlyLinkedList.length;x++) {
                minusList[x] = singlyLinkedList[x+1];
            }
            singlyLinkedList=minusList;
        }
    }

    public Node get(Integer point) {
        return singlyLinkedList[point];
    }

    public Boolean contains(Node node) {
        for (Node node1 : singlyLinkedList) {
            if (node1 == node) {
                return true;
            }
        }
        return false;
    }

    public Integer find(Node node) {
        int x =0;
        for (Node node1 : singlyLinkedList) {
            if (node1 == node) {
                return x++;
            }
        }
        return 0;
    }

    public void sort() {
        Arrays.sort(singlyLinkedList);
    }
    public Integer size(){
        return singlyLinkedList.length;
    }
    public Node[] copy(){
        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList(singlyLinkedList);
        return singlyLinkedList1.getSinglyLinkedList();
    }
    public Node[] getSinglyLinkedList(){
        return singlyLinkedList;
    }
}

