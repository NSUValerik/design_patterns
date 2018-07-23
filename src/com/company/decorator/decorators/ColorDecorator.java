package com.company.decorator.decorators;

import com.company.decorator.objects.Component;

public class ColorDecorator extends Decorator {
    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("color decorator");
    }
}
