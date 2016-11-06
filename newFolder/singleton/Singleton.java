package FilesToTry.MySingleton;

/**
 * Created by Lenovo on 03.11.2016.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Critical Error");
    }

    public static Singleton getInstance(){
        if(instance == null){
         instance = new Singleton();
        }
    return instance;
    }
}
