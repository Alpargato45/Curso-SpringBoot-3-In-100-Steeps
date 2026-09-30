package com.jorge.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements  GamingConsole{

    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }
}
