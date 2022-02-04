package com.company;

public class Main
{
    public static void main(String args[])
    {
        Box box1 = new Box(7, 10, 15);
        Box box2 = new Box(3, 2, 1);
        Box box3 = new Box(8, 5, 3);
        Box box4 = new Box(2.3, 4.7, 6.1);
        Box box5 = new Box(18, 14, 12);

        double vol;
        System.out.println(box1);

        vol = box1.volume();
        System.out.println(" Объём box1 : " + vol);

        vol = box2.volume();
        System.out.println(" Объём box2 : " + vol);

        vol = box3.volume();
        System.out.println(" Объём box3 : " + vol);

        vol = box4.volume();
        System.out.println(" Объём box4 : " + vol);

        vol = box5.volume();
        System.out.println(" Объём box5 : " + vol);
    }
}
