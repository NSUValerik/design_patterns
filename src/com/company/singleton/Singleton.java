package com.company.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if( instance == null )
        {
            instance = new Singleton();
        }
        return instance;
    }

    public String toString()
    {
        return "singleton";
    }
}
