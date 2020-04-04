package com.dp.characters;

import com.dp.game.Game;

import java.util.Random;

public class Hero {
    private Game game;

    //Constructor
    public Hero(Game game) {
        this.game = game;
    }

    //This Method Is Responsible For Moving Hero N Steps.
    public void walk(int steps){
        //Change position of hero
        game.setHeroPosition(steps);
    }

    /*
      This Method is Responsible for Generating a Random Number Of Enemies That will be Eliminated
      By hero in each different fight.
      The Range Of The Random Generated Number Is From 0 to 20.
    */
    public void fight(){
        Random random = new Random();
        // Generate a random integer smaller than 20.
        int hits = random.nextInt(20);
        //kill number(hits) of enemies.
        game.killEnemies(hits);
    }
}
