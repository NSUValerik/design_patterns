package com.company.strategy;

import com.company.strategy.alg.DBAuth;
import com.company.strategy.alg.FileAuth;

/*
Выбор одного из семейства алгоритмов для выполнения действия
Не зависит от конкретных реализаций
Смысл действия - один, реализация - разные
Классический пример - сортировка Collections.sort()

Отличие от state
 не хранит ссылку на объект
 одноразовое действие
 */
public class Main {
    public static void main(String[] args)
    {
        UserChecker userChecker = new UserChecker();
        userChecker.check( new DBAuth());
        userChecker.check( new FileAuth());
    }
}
