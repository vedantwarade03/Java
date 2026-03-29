class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void PrintDetails(){
        System.out.println("Name of person is : " + name);
        System.out.println("And age is  : " + age);
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        Person p1 = new Person("Anshika",20);
        Person p2 = new Person("Anshi",21);
        p1.PrintDetails();
        p2.PrintDetails();
    }
    
}
