package com.rplbo.math;

public class Pythagoras extends OperatorNode{
    public Pythagoras(Node kiri,Node kanan, Node tiga){
        super(kiri,kanan,tiga);
    }
    public double hitung(){
        double z = this.getTiga().hitung();
        double hasil = 0;
        hasil = Math.sqrt(Math.pow(this.getKiri().hitung(),2)+Math.pow(this.getKanan().hitung(),2));
        if(hasil == z){
            return 1;
        }else{
            return -1;
        }

    }
}
