/* Question 01
 * Consider the following definition of a singly-linked list with head node
 * containing Social Security numbers (SSN)
 */

public class SSNLinkedList {
    private SSNLinkedNode first;
    private SSNLinkedNode last;
    private int length;

    // Constructor
    public SSNLinkedList() {
        SSNLinkedNode ln = new SSNLinkedNode(null);
        first = ln;
        last = ln;
        length = 0;
    }

    // Method - append
    public void append(SSN mySSN) {
        SSNLinkedNode n = new SSNLinkedNode(mySSN);
        last.next = n;
        last = n;
        length++;
    }

    // Method - print each SSN on the list on a separate line on the console
    public void printLastfour() {
        SSNLinkedNode p;
        p = first.next;

        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
}