package com.rplbo.math;

public abstract class UnaryOperator extends Node {
    private Node dataNode;

    public Node getDataNode(){return dataNode;}

    public UnaryOperator(Node dataNode){this.dataNode = dataNode;}

    public abstract double hitung();
}
