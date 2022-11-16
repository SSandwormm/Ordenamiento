package ordenamientoburbuja;

import java.util.Scanner;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int aux;

        //ingreso de datos del arreglo 
        System.out.println("ingrese los datos del arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        //metodo burbuja
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {

                    aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        

        System.out.print("ordenamiento");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
