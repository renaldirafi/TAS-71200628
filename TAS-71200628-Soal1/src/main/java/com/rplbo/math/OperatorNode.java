package com.rplbo.math;

public abstract class OperatorNode {
    private Node kiri;
    private Node kanan;
    private Node tiga;

    public OperatorNode(Node kiri, Node kanan){
        this.kiri = kiri;
        this.kanan = kanan;
    }
    public OperatorNode(Node kiri,Node kanan, Node tiga){
        this.kiri = kiri;
        this.kanan = kanan;
        this.tiga = tiga;
    }
    public Node getKiri(){return kiri;}
    public Node getKanan(){return kanan;}
    public Node getTiga(){return tiga;}

    public abstract double hitung();
}
