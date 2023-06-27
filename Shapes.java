package oopProblems;


public class Shapes {
 public double getArea() {
     return 0.0;
 }
} 

class Rectangl extends Shapes {
 private double length;
 private double width;
 
 public Rectangl(double length, double width) {
     this.length = length;
     this.width = width;
 }
@Override
 public double getArea() {
     return length * width;
 }
}
