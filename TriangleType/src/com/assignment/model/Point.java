package com.assignment.model;

public class Point {
	private double x;
	private double y;
	private double z;
	
	/**
	 * Constructor
	 * @param x coordinate
	 * @param y coordinate
	 * @param z coordinate
	 */
	public Point(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * 
	 * @return
	 */
	public double getX() {
		return x;
	}

	/**
	 * 
	 * @return
	 */
	public double getY() {
		return y;
	}

	/**
	 * 
	 * @return
	 */
	public double getZ() {
		return z;
	}

}
