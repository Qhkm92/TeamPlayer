package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player qaiyyum = new FootballPlayer("qaiyyum");
        Player amin = new SoccerPlayer("amin");
        Player abu = new BaseballPlayer("abu");

        Team perak = new Team("perak");

        perak.addPlayer(qaiyyum);
        perak.addPlayer(amin);
        perak.addPlayer(abu);

        System.out.println(perak.numOfPlayers());
        System.out.println(perak.getName());



    }
}
