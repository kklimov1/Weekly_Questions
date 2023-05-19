package May19;

import java.util.HashSet;
import java.util.Set;

public class CircLinkedList1 {
    public static void main(String[] args) {
        Node1 head = new Node1(1);
        LinkedList1 l1 = new LinkedList1(head);
        Node1 loopListEntranceNode = new Node1(4);

        Node1 pointer = head;
        Node1 n2 = new Node1(2);

        pointer.next = n2;
        pointer = pointer.next;

        pointer.next = new Node1(3);
        pointer = pointer.next;

        pointer.next = loopListEntranceNode;
        pointer = pointer.next;

        pointer.next = new Node1(5);
        pointer = pointer.next;

        pointer.next = loopListEntranceNode;
        System.out.println(determineLoopEntrance(l1).val);
    }

    public static Node1 determineLoopEntrance(LinkedList1 ll1) {
        Set<Node1> newSet = new HashSet<>();
        Node1 pointer = ll1.head;
        while (pointer != null) {
            if (!newSet.add(pointer)) return pointer;

            pointer = pointer.next;
        }
        return null;
    }

}
