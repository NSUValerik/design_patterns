package com.company.decorator.objects;

public class Window implements Component {
    @Override
    public void draw() {
        System.out.println("Draw Window");
    }
}
