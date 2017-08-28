package py.com.mryensei.datastructure.datastructure.linkedlist;

public class SimpleLinkedList {
	
	private Node firstNode;
	private int size;
	
	public SimpleLinkedList(){
		firstNode=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return this.firstNode == null;
	}
	
	public void addAsFirst(Object data){
		Node newNode = new Node(data);
		if(this.isEmpty()){
			firstNode = newNode;
		}else{
			//almacenamos el primero temporalmente para no perder el dato
			Node temp = firstNode;
			firstNode = newNode;//nuevo node pasa a ser el primero
			firstNode.addNext(temp);//el anterior queda como segundo
		}
		size++;
	}
	
	public Object getData(int index) throws Exception{
		if(index >= size){
			throw new Exception("indice fuera del limite");
		}
		//recorremos a partir del primer elemento
		Node temp = firstNode;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();			
		}
		return temp.getData();
	}

	/**
	 * Busca el Objeto solicitado recorriendo la lista.
	 * @param data
	 * @return
	 */
	public Node findData(Object data){
		//recorremos a partir del primer elemento
		Node temp = firstNode;
		for (int i = 0; i < this.size ; i++) {
			if(temp.getData().equals(data)){
				return temp;
			}else{
				temp = temp.getNext();
			}
		}
		return null;
	}
	
	public int getSize() {
		return size;
	}
	
}
