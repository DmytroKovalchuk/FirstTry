package FilesToTry;

/**
 * Created by Lenovo on 13.10.2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class StringFormater1 {
    public StringFormater1() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        String personName = "";

        String line;
        while(!(line = reader.readLine()).isEmpty()) {
            String[] stringArray = line.split(" ");
            String[] i$ = stringArray;
            int k = stringArray.length;

            for(int i$1 = 0; i$1 < k; ++i$1) {
                String str = i$[i$1];

                try {
                    int e = Integer.parseInt(str);
                    list.add(Integer.valueOf(e));
                } catch (NumberFormatException var11) {
                    personName = personName + str + " ";
                }
            }
        }

        reader.close();
        Iterator var12 = list.iterator();

        while(var12.hasNext()) {
            Integer var13 = (Integer)var12.next();
            System.out.println(var13 + "   " + personName);
        }

    }
}