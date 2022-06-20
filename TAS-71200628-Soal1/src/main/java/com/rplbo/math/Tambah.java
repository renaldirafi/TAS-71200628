package com.rplbo.math;

public class Tambah extends OperatorNode{
    public Tambah(Node kiri, Node kanan){super(kiri,kanan);}

    public double hitung(){return this.getKiri().hitung() + this.getKanan().hitung();}
}
