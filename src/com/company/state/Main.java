package com.company.state;

import com.company.state.context.TransformerContext;
import com.company.state.state.FireState;
import com.company.state.state.MoveState;
import com.company.state.state.TransformerState;

/*
Объект меняет свое поведение в зависимости от своего состояния
Позволяет избегать многочисленных условий if
 */
public class Main {
    public static void main(String[] args)
    {
        TransformerContext context = new TransformerContext();

        TransformerState move = new MoveState();
        TransformerState fire = new FireState();

        context.setState(move);
        context.doAction();

        context.setState(fire);
        context.doAction();
    }
}
