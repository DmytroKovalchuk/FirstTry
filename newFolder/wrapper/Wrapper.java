package FilesToTry.MyDecoratorWrapper;

/**
 * Created by Lenovo on 03.11.2016.
 */
public class Wrapper extends ClassToWrapp{
   private ClassToWrapp classToWrapp ;

    public Wrapper(ClassToWrapp classToWrapp) {
        this.classToWrapp = classToWrapp;
    }

    @Override
    public void setName(String name) {
        System.out.println("I am inside Wrapper");
    }

    @Override
    public void setAge(int age) {
        super.setAge(age++);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("I am inside wrapper");
    }

    @Override
    public void setId(int id) {
        super.setId(id++);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public int count() {
        return super.count();
    }
}
