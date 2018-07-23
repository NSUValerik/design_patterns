package com.company.adapter;


import com.company.adapter.adapt.PrinterAdapter;

import java.util.ArrayList;

/*
Помогает двум разным интерфейсам работать вместе
Реализуется 2 способами: наследованием и композицией
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        list.add("str3");

        PrinterAdapter pa = new PrinterAdapter();
        pa.print(list);
    }
}
