package com.rplbo.math;

public class Kuadrat extends UnaryOperator{
    public Kuadrat(Node dataNode){super(dataNode);}

    public double hitung(){
        return Math.pow(this.getDataNode().hitung(),2);
    }
}
