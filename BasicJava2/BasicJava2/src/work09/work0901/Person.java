package work09.work0901;

public class Person {

}
class Employee extends Person {
}

class InheritanceTest {
    public static void main(String[] args) {
        Person p;
        p = new Person();
        p = new Employee();

        Employee emp;
        emp = new Employee();
        //emp = new Person();
    }
}
