package binarysearchtree;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import java.lang.NullPointerException;

public class BinarySearchTreeTest {
	BST bst =null;
	@Before
	public void initilize(){
	bst=new BST();
		
	}
   @Test
   public void initTest(){
	  BST b = new BST();
	   assertNotNull(b);
	   
   } 
   @Test
   public void isEmpty(){
	   	
	   TestCase.assertTrue(bst.isEmpty());
	   bst.insert(32);
	   assertFalse(bst.isEmpty());
   }


}
