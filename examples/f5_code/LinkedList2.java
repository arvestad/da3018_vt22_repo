import java.util.NoSuchElementException;
import java.util.Iterator;

class LinkedList<E> implements Iterable<E> {
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

    public Iterator<E> iterator() {
	return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
	private Node<E> current;

	public ListIterator() {
	    this.current = head;
	}

	public boolean hasNext() {
	    return this.current != null;
	}

	public E next() {
	    if (this.hasNext()) {
		E res = this.current.get_data();
		this.current = this.current.next;
		return res;
	    } else {
		throw new NoSuchElementException();
	    }
	}

	public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
	LinkedList<String> lst = new LinkedList<String>();
	lst.add("DA2004");
	lst.add("DA3018");

	for (String s: lst) {
	    System.out.println(s);
	}
    }
}
