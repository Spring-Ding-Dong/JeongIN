package com.springDingDong.jeongin.assignment1;

public class Midfielder implements FootballPlayer{
    private String name;

    public Midfielder(String name) {
        this.name = name;
    }

    @Override
    public void playMatch() {
        System.out.println(name + " is playing in the " + POSITION_MF + " position.");
    }
}
