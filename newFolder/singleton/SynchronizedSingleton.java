package FilesToTry.MySingleton;

/**
 * Created by Lenovo on 03.11.2016.
 */
public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton instance;

    private SynchronizedSingleton() {
    }

    public SynchronizedSingleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new SynchronizedSingleton();
                }
            }
        }
    return instance;
    }
}
