package com.javarush.test.level22.lesson18.big01;

/**
 * Created by Lenovo on 24.09.2016.
 */
public class Tetris
{
   private Field field;
   private Figure figure;

    public static Tetris game = null;

    public Field getField()
    {
        return field;
    }

    public Figure getFigure()
    {
        return figure;
    }

    public void run(){}
    public void step(){}

    public static void main(String[] args)
    {
game = new Tetris();
        game.run();
    }
}
