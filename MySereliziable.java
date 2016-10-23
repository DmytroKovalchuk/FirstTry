package FilesToTry;

import java.io.*;
import java.util.Date;

/**
 * Created by Lenovo on 19.10.2016.
 */
public class MySereliziable implements Serializable {

    private static MySereliziable unit = new MySereliziable();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = reader.readLine();
        String lastName = reader.readLine();
        Boolean sex = Boolean.parseBoolean(reader.readLine());
        unit.setFirstName(firstName);
        unit.setLastName(lastName);
        unit.setDateOfBirth(new Date());
        unit.setSex(sex);
        reader.close();

        FileOutputStream outputStream = new FileOutputStream("D://Java test/trySerializable.java");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
       // MySereliziable toSave = toStart();
        objectOutputStream.writeObject(unit);
        objectOutputStream.close();
        objectOutputStream.close();

        FileInputStream inputStream = new FileInputStream("D://Java test/trySerializable.java");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        MySereliziable my = (MySereliziable)objectInputStream.readObject();
        inputStream.close();
        objectInputStream.close();

        System.out.println(my);


       // System.out.println(new MySereliziable("Anya","Kovalchuk",true,new Date()));
    }

   /* public static MySereliziable toStart() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String firstName = reader.readLine();
            String lastName = reader.readLine();
            Boolean sex = Boolean.parseBoolean(reader.readLine());
            unit.setFirstName(firstName);
            unit.setLastName(lastName);
            unit.setDateOfBirth(new Date());
            unit.setSex(sex);
            reader.close();

            return unit;
    }*/

    @Override
    public String toString() {
        return "MySereliziable{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    //public static transient final String dateFormate = "dd mm yyyy, EEEE";

    private transient   String firstName;
    private transient String lastName;
    private transient boolean sex;
    private  Date dateOfBirth;

   public MySereliziable(){}

    public MySereliziable(String firstName, String lastName, boolean sex, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
