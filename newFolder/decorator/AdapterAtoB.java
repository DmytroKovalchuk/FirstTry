package FilesToTry.MyAdapter;

/**
 * Created by Lenovo on 03.11.2016.
 */
public class AdapterAtoB implements Binterface {
   private Ainterface ainterface;

    public AdapterAtoB(Ainterface ainterface) {
        this.ainterface = ainterface;
    }


    @Override
    public String getName() {
      return   String.valueOf(ainterface.getCount());
    }

    @Override
    public String getIndex() {
        return String.valueOf(ainterface.setCount());
    }


    @Override
    public void draw() {
        System.out.println("B interface is working");
 ainterface.move();
    }

    @Override
    public void take() {
ainterface.print();
    }
}

