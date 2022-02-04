package com.company;

public class Box
{
    double width;
    double height;
    double length;

    public Box(double w, double h, double l)
    {
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public double volume()
    {
        return this.width * this.height * this.length;
    }
}
