package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.CashMachine;
import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulator;
import com.javarush.test.level26.lesson15.big01.CurrencyManipulatorFactory;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;
import com.javarush.test.level26.lesson15.big01.exception.NotEnoughMoneyException;

import java.util.ResourceBundle;

/**
 * Created by Lenovo on 09.12.2016.
 */
class WithdrawCommand implements Command
{
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "withdraw_en");

    @Override
    public void execute() throws InterruptOperationException
    {
       String code =  ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(code);
        int data;
        while (true){
            ConsoleHelper.writeMessage(res.getString("specify.amount"));

            try
            {
                String src[] = ConsoleHelper.readString().split(" ");
                ConsoleHelper.writeMessage(res.getString("before"));
                if(src.length != 1){
                    ConsoleHelper.writeMessage(res.getString("specify.amount"));
                    continue;
                }
                else
                {
                    data = Integer.parseInt(src[0]);
                }
            }
            catch (NumberFormatException e){
                ConsoleHelper.writeMessage(res.getString("specify.not.empty.amount"));
            continue;
            }
            if(data < 0){ConsoleHelper.writeMessage(res.getString("specify.not.empty.amount"));}

            if(!manipulator.isAmountAvailable(data)){
                ConsoleHelper.writeMessage(res.getString("not.enough.money"));
                continue;
            }
            try
            {
                manipulator.withdrawAmount(data);
            } catch (NotEnoughMoneyException e)
            {
                ConsoleHelper.writeMessage(res.getString("exact.amount.not.available"));
                continue;
            }
            ConsoleHelper.writeMessage(String.format(res.getString("success.format"), data, code));
            break;

        }


    }
}
