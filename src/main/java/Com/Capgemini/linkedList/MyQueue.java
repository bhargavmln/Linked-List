package Com.Capgemini.linkedList;

public class MyQueue {
	private MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void enqueue(INode myNode) {
		myLinkedList.append(myNode);
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}
}
