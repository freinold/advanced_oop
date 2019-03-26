package se.hh.aoop.assignment1.exercise2;

import java.util.Arrays;

public class Matrix {

  private double[][] elements;
  private final int rows;
  private final int columns;

  public Matrix(int r, int c) {
    this.rows = r;
    this.columns = c;
    this.elements = new double[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        this.setElement(i, j, 0.0);
      }
    }
  }

  public double getElement(int r, int c) {
    return elements[r][c];
  }

  public void setElement(int r, int c, double value){
    elements[r][c] = value;
  }

  private int getColumns() {
    return columns;
  }

  private int getRows() {
    return rows;
  }

  public Matrix add(Matrix other) {
    Matrix result = new Matrix(rows, columns);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result.setElement(i, j , this.getElement(i, j) + other.getElement(i, j));
      }
    }
    return result;
  }

  @Override
  public String toString() {
    return "Matrix{" +
        "elements=" + Arrays.deepToString(elements) +
        ", rows=" + rows +
        ", columns=" + columns +
        '}';
  }

  public Matrix multiply(Matrix other) {
    int a = this.getRows();
    int b = other.getColumns();
    int c = this.getColumns();
    Matrix result = new Matrix(rows, other.getColumns());
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        for (int k = 0; k < c; k++) {
          result.setElement(i, j, result.getElement(i, j) + this.getElement(i, k) * other.getElement(k, j));
        }
      }
    }
    return result;
  }

}