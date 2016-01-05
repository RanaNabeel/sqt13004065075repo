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
   @Test
   public void insertTest(){
	   bst.insert(3);
	   assertTrue( bst.search(3));
	   bst.insert(2);
	   assertTrue( bst.search(2));
	   bst.insert(9);
	   assertTrue( bst.search(9));
   }
   @Test
   public void deleteTest(){
	   bst.insert(2);
	   bst.insert(3);
	   assertTrue(bst.search(2));
	   bst.delete(2);
	   assertFalse(bst.search(2));
   }



}
