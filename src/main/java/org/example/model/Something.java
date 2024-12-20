package org.example.model;

public class Something extends Entity {
    public Something() {}

    public Something(int x,int y) {
        super("Нечто",x,y);
    }

    @Override
    public void move() {
        this.x = (int) (Math.random() * fieldWidth);
        this.y = (int) (Math.random() * fieldHeigth);


    }
}
