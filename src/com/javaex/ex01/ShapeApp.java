package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강"); -public abstract void draw(); 값은 다른자식값과 있어야함
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 10, 20);
		Shape sr1 = new Ractangle("빨강", 5, 4);
		
		//sr1을 그리는 메소드 호출
		
		sr1.draw();
		
		//sr1의 가로크기 출력
		
		System.out.println(sr1.toString());
	}
}

	
	