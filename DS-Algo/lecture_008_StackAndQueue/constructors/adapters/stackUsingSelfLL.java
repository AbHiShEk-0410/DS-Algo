public class stackUsingSelfLL{
    public static class stack {
        private class Node{
            int data;
            Node next;
        }

        Node(int data){
            this.data = data;
        }

        private Node head = null;
        private Node tail = null;
        private int size = 0;

        private void addFirst(int data){
            Node node = new Node(data);
            if(this.size == 0)
                this.head = this.tail = node;
            else{
                this.head = node;   

            }    
        }
    }
}