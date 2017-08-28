package py.com.mryensei.datastructure.datastructure;

import java.util.ArrayList;
import java.util.List;

import py.com.mryensei.datastructure.datastructure.linkedlist.Node;

public class App 
{
    public static void main( String[] args ) {
    	
    	//Cargamos los nodos, con tipos diferentes
    	Node node1 = new Node("Nodo número 1");
    	Node node2 = new Node(new Integer(25));
    	
    	//creamos un array y almacenamos en un nodo
    	List<String> array = new ArrayList<String>();
    	array.add("Elemento del arreglo");
    	array.add("other ");
    	array.add("transformer nro 3 ");
    	Node node3 = new Node(array);
    	
    	//Unimos los nodos
    	node1.addNext(node2);
    	node1.getNext().addNext(node3);//obtenemos el 2 a partir del 1 y linkeamos con el 3     	
    	
    	
    	//Recorremos la lista enlazada.
    	Node node = node1;
    	while(true){
    		System.out.println(node.getData());
    		if(node.hasNext()){
    			break;
    		}
    		node = node.getNext();
    	}
    }
}
