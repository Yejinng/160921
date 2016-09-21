package com.yejinng.paint.point;

import calculateArea.Drawable;

public class ColorPoint extends Point implements Drawable{
	
	private String color;
	
	public ColorPoint (int x , int y , String color){
		setX(x);
		setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void show(){
		System.out.println("점[x=" + getX() +
				",y=" + getY() + ",color=" + color +"]을 그렸습니다");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		show();
	}
	
}
