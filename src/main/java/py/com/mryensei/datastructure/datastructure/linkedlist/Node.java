package py.com.mryensei.datastructure.datastructure.linkedlist;

public class Node {
	
	private Object data;
	private Node next;
	
	public Node(Object data) {
		this.data = data;
		this.next = null;
	}
	
	public void addNext(Node node){
		this.next = node;
	}
	
	public Node getNext(){
		return this.next;
	}

	public Object getData() {
		return this.data;
	}

	public boolean hasNext(){
		return this.next == null;
	}
}
