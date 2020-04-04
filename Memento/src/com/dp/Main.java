package com.dp;

import com.dp.characters.Hero;
import com.dp.game.Game;
/*
 * This code is an example on "memento design pattern" implementation.
 * in this example we are going to implement a simple game that starts with a simple
 * character called "hero" at a default position. hero has to kill all of his 100 enemies
 * in order to level up to the next level.there will be a checkpoint to save the current game state
 * in case hero wanted to start over from the last saved checkpoint.
 *
 * @author: Mohamed Sherif Hosny.
 */
public class Main {

    public static void main(String[] args) {
	    // Initializing the game along with the main character "hero".
        Game game = new Game();
        Hero hero = new Hero(game);
        //Printing out the game state.
        System.out.println(game);
        //=========================================================================
        // Start of the game,make hero walk through the map and fight his enemies.
        //=========================================================================
        hero.walk(10);// moving hero n steps.
        hero.fight();// hero killing his enemies.
        hero.fight();
        hero.fight();
        hero.fight();
        System.out.println(game);
        //hero will use checkPoint to save the last game state.
        game.saveCheckPoint();
        System.out.println("CheckPoint Created.");

        hero.walk(5);
        hero.fight();
        hero.fight();
        hero.fight();
        hero.fight();
        System.out.println(game);
        hero.walk(30);
        hero.fight();
        hero.fight();
        hero.fight();
        hero.fight();
        System.out.println(game);
        // Restoring The Last Saved CheckPoint "Last Saved Game State".
        game.restoreGameState(0);
        System.out.println("----------CheckPoint Restored-------------");
        System.out.println(game);
    }
}

