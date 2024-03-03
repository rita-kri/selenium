package demo;

final class Circle extends Shape {
 private final double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

final class Rectangle extends Shape {
 private final double length;
 private final double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double calculateArea() {
     return length * width;
 }
}

final class Triangle extends Shape {
 private final double base;
 private final double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return 0.5 * base * height;
 }
}

public class SealedExample {
 public static void main(String[] args) {
     Circle circle = new Circle(5);
     System.out.println("Circle Area: " + circle.calculateArea());

     Rectangle rectangle = new Rectangle(4, 6);
     System.out.println("Rectangle Area: " + rectangle.calculateArea());

     Triangle triangle = new Triangle(3, 8);
     System.out.println("Triangle Area: " + triangle.calculateArea());
 }
}

