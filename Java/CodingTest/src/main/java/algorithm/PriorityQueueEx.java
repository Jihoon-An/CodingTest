package algorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {

//        PriorityQueue<Person> queue = new PriorityQueue<>(new Person.AgeComparator());
        PriorityQueue<Person> queue = new PriorityQueue<>(Comparator.comparingInt(Person::getAge).reversed());

        queue.add(new Person("Alice",25));
        queue.add(new Person("Bob",30));
        queue.add(new Person("Charlie",20));

        while(!queue.isEmpty()){
            Person person=queue.poll();
            System.out.println(person.getName()+" "+person.getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    // 생성자, getter, setter 등 필요한 메서드들을 정의합니다.
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Comparator를 구현한 inner class를 정의합니다.
    public static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getAge() - p2.getAge();
        }
    }
}
