package com.rplbo.math;

public class Bagi extends OperatorNode{
    public Bagi(Node kiri,Node kanan){super(kiri,kanan);}

    public double hitung(){
        double hasil = 0;
        if(this.getKanan().hitung()>0){
            hasil = this.getKiri().hitung()/this.getKanan().hitung();
        }
        return hasil;
    }
}
