package pl.moras.algorithms;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
