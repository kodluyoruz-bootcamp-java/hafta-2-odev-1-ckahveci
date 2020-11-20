package com.hafta2_odev;

public class Main {

    public static void main(String[] args) {

        Keyboard keysKeyboard = new KeysKeyboard();
        Keyboard touchKeyboard = new TouchKeybord();

        System.out.println("Apple: ");
        Apple apple = new Apple();
        apple.read(touchKeyboard);
        apple.shareScreen();
        apple.videoCall();
        apple.makeCall();
        apple.sendMessage();

        System.out.println("Samsung: ");
        Samsung samsung = new Samsung();
        samsung.read(keysKeyboard);
        samsung.listenMP3();
        samsung.shareFile();
        samsung.makeCall();
        samsung.sendMessage();


    }
}
