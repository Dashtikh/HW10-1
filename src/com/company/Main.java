package com.company;

public class Main {

    public static void main(String[] args) {
        Saver saver = new Saver();
        Updater updater = new Updater();
        saver.start();
        updater.start();
    }
}
