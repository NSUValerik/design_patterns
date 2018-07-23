package com.company.decorator;

/*
другое название - обертка
Расширение функционала объекта без дочерних классов (альтернатива наследованию)
Более гибкий способ добавить новый функционал к любовму существующему объекту
Возможность включения и сключения нового поведения для любого объекта в любое время (в отличие от статичного способа с помощью наследования)
Когда нельзя создать дочерный класс, но нужно добавить новое поведение, которое может быть не связано по смыслу
Декораторы могут вкладываться друг в друга
*/

import com.company.decorator.decorators.BorderDecorator;
import com.company.decorator.decorators.ColorDecorator;
import com.company.decorator.objects.Component;
import com.company.decorator.objects.TextView;
import com.company.decorator.objects.Window;

public class Main {
    private static Component window;

    public static void main(String[] args)
    {
        window = new Window();
        boolean showBorder = false;

        if( showBorder )
        {
            window = new BorderDecorator( window );
        }
        else
        {
            window = new ColorDecorator( window );
        }
        window.draw();

        System.out.println("---------------");
        TextView tv = new TextView();
        BorderDecorator bd = new BorderDecorator( tv );

        tv.draw();
        System.out.println("-------------");
        bd.draw();
        System.out.println("-------------");
        ColorDecorator cd = new ColorDecorator( bd );
        cd.draw();
    }
}
