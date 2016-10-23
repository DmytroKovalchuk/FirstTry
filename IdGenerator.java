package FilesToTry;

/**
 * Created by Lenovo on 23.10.2016.
 */
public class IdGenerator {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            double chislo = Math.random();
            System.out.print(Math.round(chislo));
        }
    }
}
