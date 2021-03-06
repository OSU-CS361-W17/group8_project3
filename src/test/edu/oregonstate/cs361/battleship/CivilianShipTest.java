package edu.oregonstate.cs361.battleship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Chase McWhirt 3/4/2017.
 */

class CivilianShipTest {
    @Test
    public void testCivShip() {
        //Place civilian ship.
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 2);
        Point mid = new Point(0, 1);
        hits = new ArrayList<Point>;
        Ship s = new CivilianShip("civShip", 3, p1, p2, 0);
        BattleshipModel b = new BattleshipModel();

        assertEquals("civShip", s.name);
        assertEquals(3, s.length);
        assertEquals(p1, s.start);
        assertEquals(p2, s.end);
        assertEquals(0, s.getHit());

        //DestroyCivilianShip
        s.setHit(1);
        s.destroy(b);
        hits = b.getPlayerHits();

        assertEquals(1, s.getHit());
        assertEquals(p1, hits[0]);
        assertEquals(mid, hits[1]);
        assertEquals(p2, hits[2]);


        /*
        //Fire f = new Fire(0, 0);  //Not sure how to do this call.
        s.setHit(1);
        if (s.getHit() == 1) { s.destroy(); }
        assertEquals(1, s.hit);
        assertEquals(0, s.health);
        */
        /*
        if((i == 2) || (i == 3)) {
            allCpuShips[i].setHit(1);
            allCpuShips[i].destroy(userModel);
        }
        */
    }

}