package com.gnaf.chap03.sequence;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        MySequence sequence = new MySequence(5);
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        sequence.add(4);
        sequence.add(5);
        System.out.println(sequence.length());
        System.out.println(sequence);
        sequence.remove(0);
        System.out.println(sequence);

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
