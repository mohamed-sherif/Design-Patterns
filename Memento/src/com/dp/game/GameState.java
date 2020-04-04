package com.dp.game;

/*
 * This class is the backbone of memento design pattern,as it allowed us to encapsulate the state of the
 * game.
 */
public class GameState {
    //Game State.
    private int level;
    private int enemiesCount;
    private int heroPosition;

    public GameState(int level, int enemiesCount, int heroPosition) {
        this.level = level;
        this.enemiesCount = enemiesCount;
        this.heroPosition = heroPosition;
    }

    public int getLevel() {
        return level;
    }

    public int getEnemiesCount() {
        return enemiesCount;
    }

    public int getHeroPosition() {
        return heroPosition;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setEnemiesCount(int enemiesCount) {
        this.enemiesCount = enemiesCount;
    }

    public void setHeroPosition(int heroPosition) {
        this.heroPosition = heroPosition;
    }

    //Overriding the toString method as println() calls String.valueOf which calls toString
    //to be able to print a meaningful representation to the game state.
    @Override
    public String toString(){
        return "Level:"+level+","+"number of enimes:"+enemiesCount+","+"position:"+heroPosition;
    }

}
