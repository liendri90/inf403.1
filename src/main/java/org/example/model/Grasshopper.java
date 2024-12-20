package org.example.model;

public class Grasshopper extends Entity{
    public Grasshopper() {}

    public Grasshopper(int x,int y) {
        super("Кузнечик", x, y);
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
                    if (y > 1) {
                        y-=2;
                    } else if (y==1) {
                        y--;
                    }
                    break;
                case 2:
                    if (x < fieldWidth-1) {
                        ++x;
                    }
                    break;
            }

        }
}


