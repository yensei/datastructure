package py.com.mryensei.datastructure.datastructure;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import py.com.mryensei.datastructure.datastructure.linkedlist.Node;
import py.com.mryensei.datastructure.datastructure.linkedlist.SimpleLinkedList;

public class SimpleLinkedListTest {
	
	@Test
	public void testIsEmpty(){
		SimpleLinkedList list = new SimpleLinkedList();
		Assert.assertTrue(list.isEmpty());
	}
	

	@Test
	public void testGetSizeWithEmptyList(){
		SimpleLinkedList list = new SimpleLinkedList();
		Assert.assertTrue(list.getSize() == 0);
	}
	
	@Test
	public void testIsNotEmpty(){
		SimpleLinkedList list = new SimpleLinkedList();
		list.addAsFirst(new Node("Junit test"));
		Assert.assertFalse(list.isEmpty());
	}
	
	@Test
	public void testGetSizeWithNotEmptyList(){
		SimpleLinkedList list = new SimpleLinkedList();
		list.addAsFirst(new Node("Junit test"));
		Assert.assertTrue(list.getSize()==1);
	}
	
	@Test
	public void testGetLastElement() {
		SimpleLinkedList list = new SimpleLinkedList();
		list.addAsFirst("last");
		list.addAsFirst("Junit test2");
		list.addAsFirst("Junit test3");
		list.addAsFirst("Junit test4");
		list.addAsFirst("first");
		try {
			Assert.assertTrue(((String)list.getData(list.getSize()-1)).equals("last"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}	
}
