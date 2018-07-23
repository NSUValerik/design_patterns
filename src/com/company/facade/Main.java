package com.company.facade;


/*
Скрыть сложную внутреннюю реализацию и предоставить простой интерфейс
Упрощение взаимодейстия с объектами системы
Более высокий уровень использования системы
Можно обращаться и к сами внутренним объектам
 */
public class Main {
    public static void main(String[] args)
    {
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
