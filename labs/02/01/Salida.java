package com.mycompany.calculadoramatrices;

public class Salida {
    public static void printMat(double mat[][]) {
        for (double[] mat1 : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("%6.2f", mat1[j]);
            }
            System.out.println();
        }
  }

  public static void printMat(double mat[][], String head) {
    System.out.print(head);
    printMat(mat);
  }
}
