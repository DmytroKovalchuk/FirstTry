package FilesToTry.MyAdapter;

import FilesToTry.MyAdapter.AdapterAtoB;
import FilesToTry.MyAdapter.Ainterface;
import FilesToTry.MyAdapter.AinterfaceManeger;
import FilesToTry.MyAdapter.Binterface;

/**
 * Created by Lenovo on 03.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Ainterface create = AinterfaceManeger.createAinterface();
        Binterface binterface = new AdapterAtoB(create);
        binterface.draw();
    }
}
