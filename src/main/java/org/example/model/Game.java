package org.example.model;

public class Game {
    private int fieldWidth;
    private int fieldHeight;
    private int finishFieldWight;
    private int finishFieldHeight;
    private int finishX;
    private int finishY;
    private Entity[] players;
    private int stepCount;

    public Game() {}

    public Game(int fieldWidth,int fieldHeight, int finishFieldHeight, int finishFieldWidth, int finishX,int finishY, Entity[] players) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
        this.finishFieldWight = finishFieldWight;
        this.finishFieldHeight = finishFieldHeight;
        this.finishX = finishX;
        this.finishY = finishY;
        this.players = players;
        this.stepCount = 0;
        Entity.setFieldSize(fieldWidth,fieldHeight);
    }

    public Entity start() {
        while (true) {
            for (int i = 0; i< players.length;i++) {
                players[i].move();
            }
            stepCount++;

            for(int i = 0;i< players.length;i++) {
                if (players[i].getX() >= finishX && players[i].getX() <= finishX+finishFieldWight && players[i].getY() >= finishY && players[i].getY() <= finishY+ finishFieldHeight) {
                    return players[i];
                }

            }
        }
    }
    public int getStepCount() {
        return stepCount;
    }
}
