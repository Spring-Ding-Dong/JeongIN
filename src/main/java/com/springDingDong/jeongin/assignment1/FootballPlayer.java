package com.springDingDong.jeongin.assignment1;

public interface FootballPlayer {
    //상수 - 포지션
    String POSITION_FW = "Forward";
    String POSITION_MF = "Midfielder";

    //추상 메소드
    void playMatch();

    //디폴트 메소드
    default void celebrateGoal() {
        System.out.println("GOAL!");
    }

    //정적 메소드
    static void endMatch() {
        System.out.println("End of the Match");
    }
}
