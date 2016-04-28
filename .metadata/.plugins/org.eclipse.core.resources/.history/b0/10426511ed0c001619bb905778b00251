package com.assignment.shape;
import com.assignment.model.Point;

public class TriangleType {
	private static final String  EQUILATERAL_TRIANGLE = "EQUILATERAL TRIANGLE";
	private static final String  ISOSCELES_TRIANGLE = "ISOSCELES TRIANGLE";
	private static final String  SCALENE_TRIANGLE = "SCALENE TRIANGLE";
	private static final String ERROR = "Not valid triangle";
	
	
	public static String getType(Point p)
    {
        if(p.getX()<=0||p.getY()<=0||p.getZ()<=0)
            throw new IllegalArgumentException("Length of sides cannot be equal to or less than zero");
        if(p.getX()==p.getY()&&p.getY()==p.getZ()&&p.getZ()==p.getX())
            return EQUILATERAL_TRIANGLE;
        else if((p.getX()==p.getY())||(p.getY()==p.getZ())||(p.getZ()==p.getX()))
            return ISOSCELES_TRIANGLE;
        else if(p.getX()!=p.getY()&&p.getY()!=p.getZ()&&p.getZ()!=p.getX())
            return SCALENE_TRIANGLE;
        else
            return ERROR;
    }


    public static void main(String[] args)
    {
        System.out.println(getType(new Point(13, 13, 1)));

    }
}
