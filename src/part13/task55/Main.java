package part13.task55;

import part13.task54.MyThread;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 5; i++) {
            new ThreadWriter("Thread " + i, "directoryTask55", "array" + i + ".txt").start();
        }
    }
}


