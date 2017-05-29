package ua.nure.fedirko.Task2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] ar;

    public Matrix(double[][] ar) {
        this.ar = ar;
        rows = ar.length;
        cols = ar[0].length;
    }

    public void add(Matrix m) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ar[i][j] += m.ar[i][j];
            }
        }
    }

    public void mul(double x) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ar[i][j] *= x;
            }
        }
    }

    public void mul(Matrix m) {
        double[][] res = new double[rows][m.cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                for (int k = 0; k < m.rows; k++) {
                    res[i][j] += ar[i][k] * m.ar[k][j];
                }
            }
        }
        ar = res;
        rows = ar.length;
        cols = ar[0].length;
    }

    public void transpose() {
        double[][] res = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[j][i] = ar[i][j];
            }
        }

        int t = cols;
        cols = rows;
        rows = t;
        ar = res;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(ar[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Matrix m = new Matrix(new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0}
        });

        Matrix m2 = new Matrix(new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0}
        });

        System.out.println("~~~ m");
        m.print();

        System.out.println("~~~ m2");
        m2.print();

        System.out.println("~~~ transpose m");
        m.transpose();
        m.print();

        System.out.println("~~~ mul m on m2");
        m.mul(m2);
        m.print();

        System.out.println("~~~ mul m2 on 2");
        m2.mul(2);
        m2.print();
    }

}
