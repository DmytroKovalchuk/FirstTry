package FilesToTry.MyDecoratorWrapper;

/**
 * Created by Lenovo on 03.11.2016.
 */
public class ClassToWrapp {
   private String name = "I am inside classTowrapp";
    private int age = 99;
    private int id = 999;

   public void print(){
       System.out.println("I am inside classtowrapp");
   }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int count(){
        return 12;
    }

}
