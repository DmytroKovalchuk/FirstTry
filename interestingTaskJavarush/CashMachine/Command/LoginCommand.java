package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.CashMachine;
import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;


import java.util.ResourceBundle;

/**
 * Created by Lenovo on 13.12.2016.
 */
class LoginCommand implements Command
{
    private ResourceBundle validCreditCards = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "verifiedCards");
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "login_en");


    @Override
    public void execute() throws InterruptOperationException
    {
       ConsoleHelper.writeMessage(res.getString("specify.data"));
        long num = 0;
        int cod = 0;
        while (true){
            String number [] = ConsoleHelper.readString().split(" ");
            String code [] = ConsoleHelper.readString().split(" ");
            ConsoleHelper.writeMessage(res.getString("before"));


            if(number.length != 1 || code.length != 1){ConsoleHelper.writeMessage(res.getString("try.again.with.details"));continue;}
            else
            try
            {
                num = Long.parseLong(number[0]);
                cod = Integer.parseInt(code[0]);
            }
            catch (NumberFormatException e){
                ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));
                continue;
            }

          String numOfCard = String.valueOf(num);
          String pinCode = String.valueOf(cod);

            if(numOfCard.length()!=12 || pinCode.length()!=4){
                ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
                continue;
            }
            if(validCreditCards.containsKey(numOfCard) && pinCode.equals(validCreditCards.getString(numOfCard))){
                ConsoleHelper.writeMessage(String.format(res.getString("success.format"),numOfCard));
                break;
            }
           ConsoleHelper.writeMessage(String.format(res.getString("not.verified.format"),numOfCard)); continue;

        }

    }
}
