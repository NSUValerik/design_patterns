package com.company.state.state;

public class FireState implements TransformerState{
    @Override
    public void doAction() {
        System.out.println("fire");
    }
}
