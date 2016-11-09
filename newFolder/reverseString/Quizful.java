package FilesToTry;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Lenovo on 09.11.2016.
 */
public class Quizful {
 private static String string = "abcdefghijklmnopqrstyvwxyz";
    public static void main(String[] args) {

        System.out.println(timeOfCompliting("1"));
        System.out.println(timeOfCompliting("2"));
        System.out.println(timeOfCompliting("3"));
    }

    public static String reversStringBuilder(String string){
        StringBuilder stringBuilder = new StringBuilder();
        char array [] = string.toCharArray();
        for(int i = string.length()-1; i >= 0; i--){
            stringBuilder.append(array[i]);
        }
    return stringBuilder.toString();
    }

    public static String reversToChangeElen(String string){
        char[] strToChar = string.toCharArray();
        char result[] = new char[strToChar.length];
        int length = strToChar.length;
        int maxElem = length-1;
        for(int i = maxElem; i >= 0; i--){
            result[maxElem - i] = strToChar[i];
        }
    return new String(result);
    }

    public static String reversWithCombinate(String string){
        char array [] = string.toCharArray();
        int length = array.length;
        int maxElem = length-1;
        for(int i = maxElem; i >= length/2; i--){
            char temporary = array[i];
            array[i] = array[maxElem-i];
            array[maxElem-i] = temporary;


        }
        return new String(array);
    }

    public static long timeOfCompliting(String param){
        if(param.equals("1")){
            long timeStart = System.currentTimeMillis();
            for(int i = 0; i < 1000; i++){
            Quizful.reversStringBuilder(string);
        }
            long endTime = System.currentTimeMillis();
            return endTime - timeStart;
        }
      else if(param.equals("2")){
            long timeStart = System.currentTimeMillis();
            for(int i = 0; i < 1000; i++){
                Quizful.reversToChangeElen(string);
            }
            long endTime = System.currentTimeMillis();
            return endTime - timeStart;
        }
       else if(param.equals("3")){
            long timeStart = System.currentTimeMillis();
            for(int i = 0; i < 1000; i++){
                Quizful.reversWithCombinate(string);
            }
            long endTime = System.currentTimeMillis();
            return endTime - timeStart;
        }
        else return -1;
    }


}
