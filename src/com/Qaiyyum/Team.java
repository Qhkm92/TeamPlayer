package com.Qaiyyum;

import java.util.ArrayList;

public class Team {
    private String name;
    int won = 0;
    int losses = 0;
    int match = 0;
    int draw = 0;
    int played = 0;

    private ArrayList members = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //add player function
    public boolean addPlayer(Player player){
        //check if player already exist
        if(this.members.contains(player)){
            System.out.println(player + "are already in the game");
            return false;
        } else {
            this.members.add(player);
            System.out.println(player.getName() + " picked for the game " + this.name);
            return true;
        }
    }

    //display num of players
    public int numOfPlayers(){
        return members.size();
    }

    //display match result
    public void matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        } else if(ourScore == theirScore){
            draw++;
        } else {
            losses++;
        }
        played++;
        if(opponent != null){
            matchResult(null, theirScore, ourScore);
        }

    }

    //display ranking
    public int ranking(){
        return (won * 2) + draw;
    }
}
