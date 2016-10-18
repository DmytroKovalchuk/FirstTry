package FilesToTry;

import java.io.*;

/**
 * Created by Lenovo on 18.10.2016.
 */
public class TryToSeralizable implements Serializable {
    private static TryToSeralizable instance;


   // public Object readResolve(){return instance;}

    private TryToSeralizable() throws IOException {
        super();
    }


    public static TryToSeralizable getInstance() throws IOException {
        if(instance == null){
            instance = new TryToSeralizable();
        }
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutput output = new ObjectOutputStream(new FileOutputStream("D://test.java"));
        output.writeObject(getInstance());
        output.close();

        //after deseralizable will be two different link at the same object. To solve this problem in Java use method readResolve();
        ObjectInput input1 = new ObjectInputStream(new FileInputStream("D://test.java"));
        TryToSeralizable firstLink = (TryToSeralizable) input1.readObject();
        input1.close();



        ObjectInput input2 = new ObjectInputStream(new FileInputStream("D://test.java"));
        TryToSeralizable secondLink = (TryToSeralizable) input2.readObject();
        input2.close();

        System.out.println("First link hashCode " + firstLink.hashCode());
        System.out.println("Second link hashCode " + secondLink.hashCode());
    }





}
