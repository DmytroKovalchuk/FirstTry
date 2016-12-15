package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.IOException;

/**
 * Created by Lenovo on 09.12.2016.
 */
interface Command
{
   void execute() throws  InterruptOperationException;

}
