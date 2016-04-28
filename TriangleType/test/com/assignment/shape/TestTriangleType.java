package com.assignment.shape;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;

import com.assignment.model.Point;
import com.assignment.shape.TriangleType;


public class TestTriangleType {
	
	private Point point;
	private Point point2;
	private Point point3;
	@Before
	public void initialize(){
		point = new Point(13.0, 13.0, 1.0);
		point2 = new Point(13.0, 13.0, 13.0);
		point3 = new Point(11.0, 12.0, 13.0);
	}

	@Test
	public void test() {
	String triangletype = TriangleType.getType(point);
	String triangletype2 = TriangleType.getType(point2);
	String triangletype3 = TriangleType.getType(point3);
	Assert.assertEquals("ISOSCELES TRIANGLE", triangletype);
	System.out.println(triangletype +" for coordinates "+point.getX()+","+point.getY()+","+point.getZ());
	Assert.assertEquals("EQUILATERAL TRIANGLE", triangletype2);
	System.out.println(triangletype2 +" for coordinates "+point2.getX()+","+point2.getY()+","+point2.getZ());
	Assert.assertEquals("SCALENE TRIANGLE", triangletype3);
	System.out.println(triangletype3 +" for coordinates "+point3.getX()+","+point3.getY()+","+point3.getZ());
 }

}
