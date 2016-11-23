package com.javarush.test.level26.lesson15.big01;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 23.11.2016.
 */
public class ConsoleHelper
{
   private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString()
    {

        String line = "";
        try
        {
           line = reader.readLine();
        }
        catch (IOException e){

        }

        return line;
    }

    public static String askCurrencyCode() throws IOException
    {
        System.out.println("Please input currency code");
   String code = "";
    do
    {
         code = reader.readLine();
        if(code.length() != 3){
            System.out.println("Please insert correct code");
        }
    }
    while (code.length() != 3);



    return code.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode){



    }
}
