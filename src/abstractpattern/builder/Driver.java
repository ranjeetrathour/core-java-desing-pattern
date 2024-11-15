package abstractpattern.builder;

public class Driver {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().setName("dfgyu").build();
        System.out.println(person.getAge());
    }
}
