package com.javaex.ex02;

public class BirdApp {

    public static void main(String[] args) {
        Bird bird01 = new Duck();
        bird01.setName("꽥꽥이");
        bird01.fly();
        bird01.sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("짹짹이");
        bird02.fly();
        bird02.sing();
        bird02.showName(); //bird에 선행되는값이 있어야 자식들도 따라쓰니 적용해둠
    }

}
