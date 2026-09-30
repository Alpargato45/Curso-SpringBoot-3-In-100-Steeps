package com.jorge.spring.learn_spring_framework.game;

public class PacmanGame implements GamingConsole{
    public void up() {
        System.out.println("Pac up");
    }

    public void down() {
        System.out.println("Pac down");
    }

    public void left() {
        System.out.println("Pac left");
    }

    public void right() {
        System.out.println("Pac right");
    }
}
