package com.javarush.test.level22.lesson18.big01;

/**
 * Created by Lenovo on 24.09.2016.
 */
public class Field
{
    private int width;
    private int height;
    private int [][] matrix;

    public Field(int width, int height){

        this.height = height;
        this.width = width;
        matrix = new int[height][width];
    }


    public void removeFullLines(){}

    public void print(){}

    public Integer getValue(int x, int y){
        for(int[] k : matrix){}
        return null;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int[][] getMatrix(){
        return matrix;
    }

}
