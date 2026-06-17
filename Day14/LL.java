class LL{
    public static class node{
        int data;
        int next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;

    public static void main (String args[]){
       LL ll = new LL();
       LL.head = new node(1);
       LL.head.next = new node(2);
       
    }
}