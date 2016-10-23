package FilesToTry;

/**
 * Created by Lenovo on 14.10.2016.
 */
public class HowToUseSplitMethod {


    public static void main(String[] args) {

        String string = "How to use split, method? In Java properties we could find = space and - as a delimiter.";
        String[] firstDelim = string.split(" ");
        StringBuffer buffer1;
        StringBuffer buffer2 = new StringBuffer();
        StringBuffer buffer3 = new StringBuffer();

       buffer1 = forToBuildNewString(firstDelim);

        System.out.println(buffer1.toString());
    }

    private static StringBuffer forToBuildNewString(String[] Delim) {
        StringBuffer str = new StringBuffer();
        for (String x : Delim){
            str.append(x);
        }
        return str;
    }
}
