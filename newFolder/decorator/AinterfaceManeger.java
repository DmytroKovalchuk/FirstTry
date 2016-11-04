package FilesToTry.MyAdapter;

import FilesToTry.MyAdapter.Ainterface;

/**
 * Created by Lenovo on 03.11.2016.
 */
public class AinterfaceManeger {
    public static Ainterface createAinterface(){
        return new Ainterface() {
            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public int setCount() {
                return 1;
            }

            @Override
            public void move() {
                System.out.println("I am inside AinterfaceManeger");
            }

            @Override
            public void print() {
                System.out.println("I am inside interface maneger");
            }
        };
    }
}
