package com.company.adapter.adapt;

import com.company.adapter.objects.Printer;

import java.util.List;

public class PrinterAdapter implements PageListPrinter {
    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String s : list) {
            printer.print(s);
        }
    }
}


/*
public class PrinterAdapter extends Printer {
    public void printList(List<String> list) {
        for (String s : list) {
            print(s);
        }
    }
}*/
