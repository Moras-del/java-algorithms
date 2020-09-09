package pl.moras.algorithmsapi;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person[] getData(){
        return new Person[]{new Person("kate", 20), new Person("adam", 30), new Person("mike", 40)};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person person) {
        int result = 0;
        if (age > person.age)
            result = 1;
        else if (age < person.age)
            result = -1;
        else {
            if (name.compareTo(person.name) > 0)
                result = 1;
            else if (name.compareTo(person.name) < 0)
                result = -1;
        }
        return result;
    }
}
