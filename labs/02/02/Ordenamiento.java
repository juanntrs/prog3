
package com.mycompany.ordenamiento;
import java.util.Random;

public class Ordenamiento {

    public static void main(String[] args) {
        int[] tam = {100, 500, 1000, 5000, 10000};
        
        for (int i=0;i<tam.length;i++) {
            double[] arreglo = generarArregloAleatorio(tam[i]);
            
            long iBurb = System.nanoTime();
            ordenamientoBurbuja(arreglo);
            
            
            long fBurb = System.nanoTime();
            long iInsercion = System.nanoTime();
            ordenamientoInsercion(arreglo);
            long fInsercion = System.nanoTime();
            long ISelec = System.nanoTime();
            ordenamientoSeleccion(arreglo);
            long fSelec = System.nanoTime();
            long iMerge = System.nanoTime();
            ordenamientoMergeSort(arreglo, 0, arreglo.length-1);
            long fMerge = System.nanoTime();
            System.out.println("Tamaño: "+tam[i]);
            System.out.println("Burbuja: "+(fBurb-iBurb)+" ns");
            System.out.println("Inserción: "+(fInsercion-iInsercion)+" ns");
            System.out.println("Selección: "+(fSelec-ISelec)+" ns");
            System.out.println("Mergesort: "+(fMerge-iMerge)+" ns\n\n");
        }
    }
    
    public static void ordenamientoBurbuja(double[] arreglo) {
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = 0; j < arreglo.length-1-i; j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }
    
    public static void ordenamientoInsercion(double[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            double actual = arreglo[i];
            int j = i-1;
            while (j >= 0 && arreglo[j] > actual) {
                arreglo[j+1] = arreglo[j];
                j--;
            }
            arreglo[j+1] = actual;
        }
    }
    
    public static void ordenamientoSeleccion(double[] arreglo) {
        for (int i = 0; i < arreglo.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arreglo[i];
            arreglo[i] = arreglo[minIndex];
            arreglo[minIndex] = temp;
        }
    }
    
    public static void ordenamientoMergeSort(double[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
        ordenamientoMergeSort(arreglo, inicio, medio);
        ordenamientoMergeSort(arreglo, medio + 1, fin);
        }
    }
    
    public static double[] generarArregloAleatorio(int n) {
        Random rand = new Random();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextDouble();
        }
        return arr;
    }
}