package org.example.model;

public class Turtle extends Entity {
    public Turtle() {}

    public Turtle(int x,int y) {
        super("Черепаха",x,y);
    }
    @Override
    public void move() {
        int direction = (int) (Math.random() * 3);
        switch (direction) {
            case 0:
                if (x>0) {
                    --x;
                }
                break;
            case 1:
                if (y > 0) {
                    --y;
                }
                break;
            case 2:
                if (x < fieldWidth) {
                    ++x;
                }
                break;
        }

    }
}
