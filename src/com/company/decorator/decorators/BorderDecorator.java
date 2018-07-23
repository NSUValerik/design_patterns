package com.company.decorator.decorators;

import com.company.decorator.objects.Component;

public class BorderDecorator extends Decorator {
    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("border decorator");
    }
}
