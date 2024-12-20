package org.example;


import org.example.model.Ant;
import org.example.model.Entity;
import org.example.model.Turtle;
import org.example.model.Grasshopper;
import org.example.model.Something;
import org.example.model.Game;


public class Main {
    public static void main(String[] args) {
        int finishFieldWight = 10;
        int finishFieldHeight = 10;
        int finishX = 495;
        int finishY = 495;
        Entity[] entities = new Entity[4];
        entities[0] = new Ant(0,0);
        entities[1] = new Turtle(0,0);
        entities[2] = new Grasshopper(0,0);
        entities[3] = new Something(0,0);


        Game game = new Game(1000,1000, finishFieldWight,finishFieldHeight,finishX,finishY,entities);

        Entity champion = game.start();
        System.out.println("Победитель: "+champion);
        System.out.println("Количество шагов: " + game.getStepCount());
    }
}