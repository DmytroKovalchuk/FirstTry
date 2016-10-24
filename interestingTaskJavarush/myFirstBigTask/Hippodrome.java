package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Lenovo on 16.09.2016.
 */
public class Hippodrome
{
   public ArrayList<Horse> horses = new ArrayList<Horse>();

    public static Hippodrome game;

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public Horse getWinner() {
      Horse winner = new Horse("Winner",0.0,0.0);
        for(Horse horse : horses){
            if(horse.getDistance() > winner.getDistance()){
                winner = horse;
            }else continue;
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

   public void move(){
       for(Horse horse : horses){
           horse.move();
       }
   }

    public void print(){
        for(Horse horse : horses){
            horse.print();
            System.out.println();
            System.out.println();
        }
    }

    public void run() throws InterruptedException
    {
        for(int i = 1; i <=100; i++){

            move();
            print();
            Thread.sleep(200);
        }
    }


    public static void main(String[] args) throws InterruptedException
    {
game = new Hippodrome();
        Horse horse1 = new Horse("horse1",3.0,0.0);
        Horse horse2 = new Horse("horse2",3.0,0.0);
        Horse horse3 = new Horse("horse3",3.0,0.0);

    game.getHorses().add(horse1);
    game.getHorses().add(horse2);
    game.getHorses().add(horse3);

    game.run();
game.printWinner();
    }
}
