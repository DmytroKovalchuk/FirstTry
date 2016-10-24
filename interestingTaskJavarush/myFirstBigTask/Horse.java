package com.javarush.test.level21.lesson16.big01;



/**
 * Created by Lenovo on 16.09.2016.
 */
public class Horse
{
    public String name;
    public double speed;
    public double distance;

public void move(){
    distance += speed*Math.random();
}


    public void print(){
int num = (int) Math.round(getDistance());
    StringBuilder builder = new StringBuilder();
        for(int i = 0; i < num; i++){
            builder.append(".");
        }
        System.out.println(builder.toString() + getName());
    }

    public Horse(String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public double getDistance()
    {
        return distance;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }


}
