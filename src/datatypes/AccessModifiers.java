package datatypes;

public class AccessModifiers {
    public String name; //public usage
    private double salary;
    protected int age;
    String department; //default

}
class Example{
    public static void main(String[] args){
        AccessModifiers object=new AccessModifiers();
        object.name="Srivalli Uma";
        object.age=21;
    }
}
