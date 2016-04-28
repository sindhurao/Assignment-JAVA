package com.assignment.test;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import com.assignment.list.LinkedList;
import org.junit.Test;

public class TestLinkedList {

	private LinkedList tlist;
	
	@Before
	public void initialize(){
		tlist = new LinkedList();
		tlist.push(10);
        tlist.push(20);
        tlist.push(30);
        tlist.push(40);
        tlist.push(50);
        tlist.push(60);
        tlist.push(70);
        tlist.push(80);
        tlist.push(90);
	}    
	
	@Test
	public void test() {
		Assert.assertEquals(20, tlist.printNthFromLast(2));
		System.out.println("2nd element from last is :" +tlist.printNthFromLast(2));
		Assert.assertEquals(30, tlist.printNthFromLast(3));
		System.out.println("3rd element from last is :" +tlist.printNthFromLast(3));
		Assert.assertEquals(40, tlist.printNthFromLast(4));
		System.out.println("4th element from last is :" +tlist.printNthFromLast(4));
		}

}
