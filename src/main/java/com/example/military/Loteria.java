package com.example.military;

import java.util.Random;

public class Loteria {
    private int max;
    private int min;

    public Loteria(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int random() {
        return new Random().nextInt(max + min) + 1;
    }
}
