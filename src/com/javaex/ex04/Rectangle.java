package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	private double width;
	private double height;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
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
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public double getArea() {

		Double result = width * height;

		return result;
	}

	@Override
	public double getPerimeter() {

		Double result = (width + height) * 2;

		return result;
	}

	@Override
	public void resize(double s) {

		setWidth(width * s);
		setHeight(height * s);
	}

}