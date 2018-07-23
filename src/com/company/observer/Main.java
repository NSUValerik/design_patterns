package com.company.observer;

/*
Наблюдатель ждет наступления определенного события и оповещает об этом всех слушателей
Помогает реализовать слабую зависимость между объектами
 */
public class Main {
    public static void main(String[] args)
    {
        Subscriber s = new Subscriber();
        Subscriber2 s2 = new Subscriber2();

        Publisher p = new Publisher();
        p.addListener(s);
        p.addListener(s2);

        p.createNewMessage("new Message create");
    }
}
