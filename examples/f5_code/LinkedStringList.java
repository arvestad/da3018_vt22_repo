class LinkedStringList  {
    // Single linked list
    private StringNode head;

    public LinkedStringList() {
	head = null;
    }

    public void add(String s) {
	StringNode node = new StringNode(s);
	node.next = head;
	head = node;
    }

    public StringNode get_head() {
	return head;
    }

    public static void main(String[] args) {
	LinkedStringList l = new LinkedStringList();
	l.add("DA2004");
	l.add("DA3018");

	for (StringNode n = l.get_head(); n != null; n=n.next) {
	    System.out.println(n.get_data());
	}
    }
}

    
