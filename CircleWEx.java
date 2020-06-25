package be.vdab.OOOef25juni;

import be.vdab.OOOef24juni.Circle;

public class CircleWEx extends Circle {
    public CircleWEx(int radius) {
        setRadius(radius);
        setCount(getCount()+1);
    }

    @Override
    public void setRadius(int nwradius) throws IllegalArgumentException{
        if (nwradius >= 0)
            super.setRadius(nwradius);
        else
            throw new IllegalArgumentException("radius moet positief zijn !");

    }

    @Override
    public int getRadius() {
        return super.getRadius();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
