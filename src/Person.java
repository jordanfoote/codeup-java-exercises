public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main (String[] args) {

        Person p1 = new Person("Jordan");
        Person p2 = new Person("Jon");
        Person p3 = new Person("Joseph");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());

        p2.setName("Jonathan");
        System.out.println(p2.getName());

        p3.sayHello();

        // Person person1 = new Person("John");
        // Person person2 = new Person("John");
        // System.out.println(person1.getName().equals(person2.getName()));
        // System.out.println(person1 == person2);

        // Person person1 = new Person("John");
        // Person person2 = person1;
        // System.out.println(person1 == person2);

        // Person person1 = new Person("John");
        // Person person2 = person1;
        // System.out.println(person1.getName());
        // System.out.println(person2.getName());
        // person2.setName("Jane");
        // System.out.println(person1.getName());
        // System.out.println(person2.getName());
    }
}
