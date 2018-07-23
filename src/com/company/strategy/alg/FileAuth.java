package com.company.strategy.alg;

//some algorithm with file
public class FileAuth implements AuthStrategy {

    public FileAuth(){
      //todo
    }


    @Override
    public boolean checkLogin(String name, String pass) {
        System.out.println("checking file");
        return false;
    }
}
