package FilesToTry;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

/**
 * Created by Lenovo on 19.10.2016.
 */
public class ClassIdentifire {
    public static class A implements Serializable{
        public String name = "I am class A";

        @Override
        public String toString() {
            return "A{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class B extends A {
       private String name = "I am class B";

        @Override
        public String toString() {
            return "B{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class C extends B {
       private String name = "I am class C";

        @Override
        public String toString() {
            return "C{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream outputStream = new FileOutputStream("D://Java test/ClassIdentifare.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(new B());
        objectOutputStream.close();
        outputStream.close();

        FileInputStream inputStream = new FileInputStream("D://Java test/ClassIdentifare.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object classIdent = objectInputStream.readObject();
        objectInputStream.close();
        inputStream.close();
        if(classIdent instanceof A){
            classIdent = (A)classIdent;
            System.out.println(classIdent.toString());
        }

        if(classIdent instanceof B){
            classIdent = (B)classIdent;
            System.out.println(classIdent.toString());
        }

        else if(classIdent instanceof C){
            classIdent = (C)classIdent;
            System.out.println(classIdent.toString());
        }



    }


}
