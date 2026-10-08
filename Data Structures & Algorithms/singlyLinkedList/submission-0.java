class LinkedList {

    private static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
   
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public int get(int index) {
        Node temp = head;

        while (temp != null && index > 0) {
            temp = temp.next;
            index--;
        }

        return temp != null ? temp.val : -1;
    }

    public void insertHead(int val) {
        Node temp = new Node(val);

        temp.next = head;
        head = temp;
    }

    public void insertTail(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public boolean remove(int index) {

        if (head == null) {
            return false;
        }

        if (index == 0) {
            head = head.next;
            return true;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                return false;
            }
            temp = temp.next;
        }
        
        if (temp.next == null) {
            return false;
        }

        temp.next = temp.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> result = new ArrayList<>();

        Node temp = head;

        while (temp != null) {
            result.add(temp.val);
            temp = temp.next;
        }

        return result;
    }
}