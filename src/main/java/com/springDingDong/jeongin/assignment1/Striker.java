package com.springDingDong.jeongin.assignment1;

public class Striker implements FootballPlayer{
    private String name;

    public Striker(String name) {
        this.name = name;
    }

    @Override
    public void playMatch() {
        System.out.println(name + " is playing in the " + POSITION_FW + " position.");
    }
}
