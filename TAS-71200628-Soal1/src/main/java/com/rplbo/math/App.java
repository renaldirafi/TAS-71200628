package com.rplbo.math;

public class App 
{
    public static void main( String[] args )
    {
        OperandNode o1 = new OperandNode(25);
        OperandNode o2 = new OperandNode(4);
        UnaryOperator op1 = new Kuadrat(o2);
        OperatorNode op2 = new Kali(o1,op1);
        System.out.println(op2.hitung());

        OperandNode o3 = new OperandNode(5);
        OperatorNode op3 = new Kali(o3,op1);
        System.out.println(op3.hitung());

        OperandNode o4 = new OperandNode(2);
        OperandNode o5 = new OperandNode(3);
        OperatorNode op4 = new binary(o4,o5);
        System.out.println(op4.hitung());

        OperandNode o6 = new OperandNode(5);
        OperatorNode op5 = new Pythagoras(o5,o2,o6);
        System.out.println(op5.hitung());

        OperandNode o7 = new OperandNode(1);
        OperatorNode op6 = new Pythagoras(o7,o4,o5);
        System.out.println(op6.hitung());
    }
}
