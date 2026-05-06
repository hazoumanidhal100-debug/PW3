 Person.java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
 Student.java
public class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade >= 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}
 TestStudent.java
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("Sami", 20, 14.5);
        System.out.println(s.toString());
        System.out.println("Passed: " + s.isPassed());
    }
}
