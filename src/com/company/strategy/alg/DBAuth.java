package com.company.strategy.alg;

//some algorithm with db
public class DBAuth implements AuthStrategy {
    public DBAuth(){
        //todo
    }

    @Override
    public boolean checkLogin(String name, String pass) {
        System.out.println("checking db");
        return true;
    }
}
