package com.javaex.ex04;

public class RectTriangle extends Shape{
	private double width;
	private double height;

	public RectTriangle() {
		super();
	}

	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public final double getWidth() {
		return width;
	}

	public final void setWidth(double width) {
		this.width = width;
	}

	public final double getHeight() {
		return height;
	}

	public final void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "RectTriangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		double result = width * height /2; 
		return result;
	}

	@Override
	public double getPerimeter() {
		double result =width + height +Math.sqrt(width*width+height*height);
		return result;
	}

}