package com.assignment.test;

import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import com.compare.main.CompareLists;
import com.compare.main.MyData;


public class TestLists {
	private List<MyData> list1;
	private List<MyData> list2;
	private List<MyData> list3;
	private List<MyData> list4;
	
	@Before
	public void initialize(){
		list1 = new ArrayList<MyData>();
		list1.add(new MyData("Mark", true));
        list1.add(new MyData("Steve", true));
        list1.add(new MyData("Rick", true));

		list2 = new ArrayList<MyData>();
		list2.add(new MyData("Mark", true));
        list2.add(new MyData("Steve", true));
        list2.add(new MyData("Rick", true));
        list2.add(new MyData("Adam", true));
        
        list3 = new ArrayList<MyData>();
		list3.add(new MyData("Mark", true));
        list3.add(new MyData("Steve", true));
        list3.add(new MyData("Rick", true));

		list4 = new ArrayList<MyData>();
        list4.add(new MyData("Steve", true));
        list4.add(new MyData("Rick", true));
        list4.add(new MyData("Adam", true));
	}
	@Test
	public void test() {
		Assert.assertEquals(true, CompareLists.CompLists(list1, list2));
		System.out.println("Elements in list1 contains in list2 : " +CompareLists.CompLists(list1, list2));
		
		Assert.assertEquals(false, CompareLists.CompLists(list3, list4));
		System.out.println("Elements in list3 contains in list4 : " +CompareLists.CompLists(list3, list4));
	}
	
}
