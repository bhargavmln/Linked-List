package Com.Capgemini.linkedList;

public class MyNode<K> {
	private K key;
	private MyNode next;

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public static void main(String[] args) {

	}
}
