package com.dp.game;

import java.util.ArrayList;

public class Game {
    //State of the game.
    private GameState currentGameState;
    //IDEA:THIS IS OUR MEMENTO.
    private ArrayList<GameState> checkPoint;

    //Constructor
    public Game() {
        currentGameState = new GameState(1,100,0);
        //Now we will be able to save more than one state to our object "game",so we can have all
        //of the game's history saved.
        checkPoint = new ArrayList<GameState>();
    }

    /*
     * This Method Changes The Position Of The hero By N Incremental Steps.
     * @arg: steps         number of steps the hero will move
     */
    public void setHeroPosition(int steps){
        currentGameState.setHeroPosition(currentGameState.getHeroPosition()+steps );
    }
    /*
     * This Method Reduces The Total Number Of Enemies by N enemies killed in the last
     * hero's fight.
     * @arg:  hits         number of enemies killed by hero.
     */
    public void killEnemies(int hits){
          currentGameState.setEnemiesCount(currentGameState.getEnemiesCount()-hits);
          //level up the game's level when hero kills all of his 100 opposing enemies.
          if (currentGameState.getEnemiesCount()<=0)
              levelUp();
    }

    private void levelUp() {
        // reinitialize the game.
        currentGameState.setLevel(currentGameState.getLevel()+1);// leveling the game up by one level.
        currentGameState.setEnemiesCount(100);
        currentGameState.setHeroPosition(0);
    }

    //This Method is responsible for storing the last game's state
    public void saveCheckPoint(){
        // I wont add currentGameState as it is a reference it's value will be change by time,so i have to store a copy of the currentGameState.
        checkPoint.add(new GameState(currentGameState.getLevel(),currentGameState.getEnemiesCount(),currentGameState.getHeroPosition()));
    }

    //This Method is Responsible for Loading The Chosen game state from the saved game state history.
    public void restoreGameState(int index){
        currentGameState = checkPoint.get(index);
    }

    @Override
    public String toString(){
        return currentGameState.toString();
    }

}
