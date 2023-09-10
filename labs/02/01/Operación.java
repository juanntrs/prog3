package com.mycompany.calculadoramatrices;

class Operacion {   // se recomienda guardarlo en un archivo .java separado
    public static double[][] suma(double [][]matA, double [][] matB) {
      double[][] matR = new double[matA.length][matA[0].length];

    for (int i = 0; i < matR.length; i++)
      for (int j = 0; j < matR[0].length; j++)
        matR[i][j] = matA[i][j] + matB[i][j];
    return matR;
  }

  public static double[][] producto(double [][]matA, double [][]matB) {
    double[][] matR = new double[matA[0].length][matB.length];
    
    
    
    for (int i = 0; i < matR.length; i++) {
            for (int j = 0; j < matR[0].length; j++) {
                for (int k = 0; k < matA[0].length; k++) {
                    matR[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
    
    return matR;
  }

  // ... continuar con los demás métodos
        }

       

        // Clase principal de la aplicación (por ello es la única  que contiene el método main)
        