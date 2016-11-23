package com.javarush.test.level26.lesson15.big01;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Lenovo on 23.11.2016.
 */
public class CurrencyManipulatorFactory
{
   public static HashMap<String,CurrencyManipulator> map = new HashMap<String,CurrencyManipulator>();

    private CurrencyManipulatorFactory(){}

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode){
       CurrencyManipulator currencyManipulator;
        if(map.containsKey(currencyCode)){
           return map.get(currencyCode);
       }
        else currencyManipulator = new CurrencyManipulator(currencyCode);
             map.put(currencyCode,currencyManipulator);
             return currencyManipulator;

    }
}
