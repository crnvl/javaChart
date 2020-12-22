package com.angelsflyinhell.javaChart.core;

import com.angelsflyinhell.javaChart.util.javaChart;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> nodes = new HashMap<>();
        Random r = new Random();
        for (int i = 0; i < 30; i++) {
            nodes.put(i, r.nextInt(15000));
        }

        javaChart.process(nodes, "angelsflyinhell");
    }

}
