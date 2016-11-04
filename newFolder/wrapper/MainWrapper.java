package FilesToTry.MyDecoratorWrapper;

/**
 * Created by Lenovo on 03.11.2016.
 */
public class MainWrapper {
    public static void main(String[] args) {
        ClassToWrapp classToWrapp = new ClassToWrapp();
        Wrapper wrapper = new Wrapper(classToWrapp);
        wrapper.print();
    }
}
