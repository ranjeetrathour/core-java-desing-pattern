package creational.abstractpattern.builder;

public class Person {
    private String name;
    private int age;

    private Person( PersonBuilder personBuilder){
        this.name= name;
        this.age=age;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class PersonBuilder{
        private String name;
        private int age;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

}
