package com.rplbo.math;

public class binary extends OperatorNode{
    public binary (Node kiri,Node kanan){
        super(kiri,kanan);
    }
    public double hitung(){
        return Math.pow(this.getKiri().hitung(), this.getKanan().hitung());
    }
}
