public class linkedlist {

    public static class LinkedList {
        public class Node {
            int data = 0;
            Node next = null;

            Node(int data) {
                this.data = data;
            }
        }

        public Node head = null;
        public Node tail = null;
        public int size = 0;

        public int size() {
            return this.size;
        }

        public boolean isEmpty() {
            return this.size == 0;
        }

        public void addFirstNode(Node node) {
            if (this.size == 0)
                this.head = this.tail = node;
            else {
                node.next = this.head;
                this.head = node;
            }
            this.size++;

        }

        public void addFirst(int data) {
            Node node = new Node(data);
            addFirstNode(node);

        }

        public void addLastNode(Node node) {
            if (this.size == 0) {
                this.head = this.tail = node;
            } else {
                this.tail.next = node;
                this.tail = node;
            }
            this.size++;
        }

        public void addLast(int data) {
            Node node = new Node(data);
            addLastNode(node);
        }

        public void addAt(int idx,int data){
               
        }

        private Node removeFirstNode() {
            Node node = this.head;
            if (this.size == 1)
                this.head = this.tail = null;
            else {
                this.head = this.head.next;
                node.next = null;
            }

            this.size++;
            return node;
        }

        public int removeFirst() {
            if (this.size == 0)
                return -1;

            Node node = removeFirstNode();
            return node.data;
        }

        private Node removeLastNode(){
            Node node = this.tail;
            if(this.size == 1)
                this.head = this.tail = null;
            else{
                Node secondLast = getNodeAt(this.size - 2);
                secondLast.next = null;
                this.tail = secondLast;
            }
            this.size--;
            return node;
                
        }

        public int removeLast(){
            if(this.size == 0)
                return -1;

            return removeLastNode().data;
        }

        public int removeAt(){
            
        }

        private Node getNodeAt(int idx) {
            Node curr = this.head;
            while (idx-- > 0) {
                curr = curr.next;
            }
        }

        

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

    }
}