package com.youssfi.prot;

public abstract class Figure implements Cloneable {
	protected Point p1;
	protected Point p2;
	
	public Figure(Point p1, Point p2) {
		this.p1 = p1; 
		this.p2 = p2;
	}
	
	@Override
	public Figure clone() throws CloneNotSupportedException {
		return (Figure)super.clone();
	}
	
	public abstract double getSurface();
	
	@Override
	public String toString() {
		return "p1=" + p1 + ", p2=" + p2;
	}
}
