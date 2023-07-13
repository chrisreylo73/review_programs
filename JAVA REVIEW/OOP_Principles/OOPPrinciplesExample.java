package OOP_Principles;

// Encapsulation: Data hiding and bundling related data and methods together
class Person {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void introduce() {
    System.out.println(
      "Hello, my name is " + name + " and I'm " + age + " years old."
    );
  }
}

// Inheritance: Creating a new class (Student) that inherits properties and methods from a base class (Person)
class Student extends Person {

  private int studentId;

  public Student(String name, int age, int studentId) {
    super(name, age); // Call the constructor of the base class (Person)
    this.studentId = studentId;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  @Override // Polymorphism: Overriding the introduce() method from the base class (Person)
  public void introduce() {
    System.out.println(
      "Hello, my name is " +
      getName() +
      ", I'm " +
      getAge() +
      " years old, and my student ID is " +
      studentId +
      "."
    );
  }
}

// Abstraction: Creating an abstract class (Shape) with a common method (calculateArea()) that subclasses must implement
abstract class Shape {

  abstract double calculateArea();
}

class Rectangle extends Shape {

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  double calculateArea() {
    return length * width;
  }
}

class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double calculateArea() {
    return Math.PI * radius * radius;
  }
}

public class OOPPrinciplesExample {

  public static void main(String[] args) {
    // Encapsulation example
    Person person = new Person("John Doe", 30);
    person.introduce();

    // Inheritance and Polymorphism example
    Student student = new Student("Jane Smith", 20, 123456);
    student.introduce();

    // Abstraction example
    Shape rectangle = new Rectangle(5.0, 3.0);
    System.out.println("Rectangle Area: " + rectangle.calculateArea());

    Shape circle = new Circle(2.5);
    System.out.println("Circle Area: " + circle.calculateArea());
  }
}
