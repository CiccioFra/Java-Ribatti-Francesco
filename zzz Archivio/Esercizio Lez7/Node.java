package com.company;

public class Node extends List {
//    private Node next;        //fatto refact
    private List next;
    private int value;

// Prima creazione
//    public Node(Node next, int value) {     // viene richiamato con l'istruzione new
//        this.next = next;
//        this.value = value;
//    }     // facciamo un refact =>
    public Node(List next, int value) {
        this.next = next;
        this.value = value;
    }

    public List getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int get(int index) {
        if (index == 0)
            return this.value;
        else
            return this.next.get(index-1);
    }

    @Override
    public List add(int index, int value) {
        if (index == 0){
            this.next = new Node(this.next, this.value);
            this.value = value;
        }
        else {
            this.next = this.next.add(index-1,value);
        }
        return this;
    }

    @Override
    public String toString() {
        return "" + value +
                ' '+ this.next.toString();
    }


}

// il tipo reale è il tipo dell'oggetto con cui è stato creato l'oogetto con new
// il tipo apparente è il tipo con cui ci riferiamo nello stack