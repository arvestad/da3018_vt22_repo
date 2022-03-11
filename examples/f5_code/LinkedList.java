class LinkedList<E>  {
    // Single linked list
    private Node<E> head;

    public LinkedList() {
	head = null;
    }

    public void add(E s) {
	Node<E> node = new Node<E>(s);
	node.next = head;
	head = node;
    }

    public Node<E> get_head() {
	return head;
    }

    public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<String>();
	l.add("DA2004");
	l.add("DA3018");

	for (Node<String> n = l.get_head(); n != null; n=n.next) {
	    System.out.println(n.get_data());
	}
    }    
}

    
