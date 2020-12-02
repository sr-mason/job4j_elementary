package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to03then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = 3;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to11then5() {
        int expected = 5;
        int x1 = -3;
        int y1 = 2;
        int x2 = 1;
        int y2 = -1;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        int expected = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when002to022then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int z1 = 2;
        int x2 = 0;
        int y2 = 2;
        int z2 = 2;
        double out = new Point(x1, y1, z1).distance(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }
}