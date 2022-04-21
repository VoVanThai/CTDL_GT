package com.thaivv2004110036.kiemtracuoiky;

public class GoodsLinkedList {
    Node head = null;
    Node tail = null;
    Goods goods;
    
    public void them(){ 
        Goods goods = new Goods();
        Node newGoods = new Node(goods);
        newGoods.goods.nhapThongTin();
        if(head == null){
            head = newGoods;
            tail = newGoods;
        } 
        else{
            tail.next = newGoods;
            tail = newGoods;
        }
    }

    boolean maHangCoTrongDanhSach(String id){
        Node current = head;
        boolean result = false;
        while(current!=null){
            if(current.MaHang.equals(id)){
                result =true;
                return result;
            }
            current=current.next;
        }
        return result;
    }

    void timTheoMaHang(String id){
        Node current = head;
        if(true==maHangCoTrongDanhSach(id)){
            current.goods.inThongTin();
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }

    boolean giaHangCoTrongDanhSach(int gia){
        Node current = head;
        boolean result = false;
        while(current!=null){
            if(current.GiaHang.equals(gia)){
                result =true;
                return result;
            }
            current=current.next;
        }
        return result;
    }

    void timTheoGiaHang(int gia){
        Node current = head;
        if(true==giaHangCoTrongDanhSach(gia)){
            current.goods.inThongTin();
        }
        else{
            System.out.println("Không tìm thấy");
        }
    }

    public void in(){   
        Node current = head;
        if(head == null){
            System.out.println("DANH SÁCH RỖNG!");
        }
        else{
            while(current != null){
                current.goods.inThongTin();
                current = current.next;
            }
        }
    }

    public void xepTangDan() {   //Bubble Sort
        Node current = head, nextNode = null;
        int temp;

        while (current != null) {
            nextNode = current.next;
            while (nextNode != null) {
                if (current.GiaHang > nextNode.GiaHang) {
                    temp = current.GiaHang;
                    current.GiaHang = nextNode.GiaHang;
                    nextNode.GiaHang = temp;
                }
                nextNode = nextNode.next;
            }
            current = current.next;
        }
    }

    public void xepGiamDan() {   // Selection Sort
        Node current = head, maxNode = null, nextNode = null;
        int temp;

        while (current != null) {
            nextNode = current.next;
            maxNode = current;
            while (nextNode != null) {
                if (nextNode.GiaHang > maxNode.GiaHang) {
                    maxNode = nextNode;
                }
                nextNode = nextNode.next;
            }
           
            temp = maxNode.GiaHang;
            maxNode.GiaHang = current.GiaHang;
            current.GiaHang = temp;
            
            current = current.next;
        }
    }

}
