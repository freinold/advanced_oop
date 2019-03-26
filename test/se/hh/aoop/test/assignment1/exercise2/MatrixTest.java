package se.hh.aoop.test.assignment1.exercise2;

import se.hh.aoop.assignment1.exercise2.Matrix;

public class MatrixTest {

  public static void main(String[] args) {
    Matrix a = new Matrix(1,2);
    Matrix b = new Matrix(2,1);
    a.setElement(0,0,1.0);
    a.setElement(0,1,2.0);
    b.setElement(0,0,3.0);
    b.setElement(1,0,4.0);
    Matrix c = a.multiply(b);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
  }

}
