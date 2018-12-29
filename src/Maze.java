/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarc
 */
public class Maze {

    coordinate start, end;
    int x, y;
    wall w1 = new wall(new coordinate(1, 4), new coordinate(2, 4));
    wall w2 = new wall(new coordinate(2, 5), new coordinate(2, 4));
    wall w3 = new wall(new coordinate(3, 5), new coordinate(3, 4));
    wall w4 = new wall(new coordinate(3, 4), new coordinate(4, 4));
    wall w5 = new wall(new coordinate(3, 4), new coordinate(3, 3));
    wall w6 = new wall(new coordinate(2, 3), new coordinate(3, 3));

    public Maze() {
    }

    public Maze(int x, int y, int sx, int sy, int ex, int ey) {
        this.start = new coordinate(sx, sy);
        this.end = new coordinate(ex, ey);;
        this.x = x;
        this.y = y;

    }

    public class coordinate {

        int x, y;

        public coordinate() {
        }

        public coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public class wall {

        coordinate left, right;

        public wall(coordinate left, coordinate right) {
            this.left = left;
            this.right = right;
        }
    }
}
