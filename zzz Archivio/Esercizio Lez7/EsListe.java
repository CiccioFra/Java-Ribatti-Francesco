package com.company;

public class EsListe {

    public static void main(String[] args) {
//        Node n1 = new Node(new Node(new Node(new Nil(),1),2),3);
        List lista = new Node(new Node(new Node(new Nil(),1),2),3);
        System.out.println(lista.get(2));
        System.out.println(lista);
        lista.add(0,5);
        System.out.println(lista);

    }
}
