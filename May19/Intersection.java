package May19;

import java.util.LinkedList;

public class Intersection {

    static class Node {
        int num;
        Node next;
        Node (int x){
            num = x;
            next = null;
        }
    }
    static class LinkedList1 {
        Node head;
        LinkedList1 (Node h) {
            head = h;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {5,6,8,11};
        Node n1 = new Node(array1[0]);
        Node n2 = new Node(array2[0]);
        LinkedList1 ll1 = new LinkedList1(n1);
        LinkedList1 ll0 = new LinkedList1(n2);
        Node currentNode0 = ll0.head;
        Node currentNode1 = ll1.head;

        for (int i=1; i<array1.length; i++) {
            System.out.println(currentNode1.num);
            currentNode1.next = new Node(array1[i]);
            currentNode1 = currentNode1.next;
        }
        System.out.println("::");
        for (int i=1; i<array2.length; i++) {
            currentNode0.next = new Node(array2[i]);
            currentNode0 = currentNode0.next;
        }
        System.out.println(checkIntersectingNode(ll1, ll0));
    }

    public static Node checkIntersectingNode(LinkedList1 ll1, LinkedList1 ll2) {
        Node currentNode1 = ll1.head;
        Node currentNode2 = ll2.head;
        /*
        To check intersection of reference, use ==
         */
        while (currentNode1 != null){
            currentNode2=ll2.head;
            while (currentNode2 != null){
                if (currentNode1==currentNode2) return currentNode1;
                System.out.println(currentNode1+" "+currentNode2);
                currentNode2 = currentNode2.next;
            }currentNode1=currentNode1.next;
        }
        return null;
    }
}
