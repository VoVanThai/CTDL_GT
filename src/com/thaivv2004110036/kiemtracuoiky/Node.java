package com.thaivv2004110036.kiemtracuoiky;

public class Node {
    Goods goods;
    Node next;
    String MaHang;
    Integer GiaHang;

    public Node(){
        goods = null;
        next = null;
    }

    public Node(Goods newGoods) {
        goods = newGoods;
        next = null;
    }

    public Node(Goods newGoods, Node node) {
        goods = newGoods;
        next = node;
    }
}
