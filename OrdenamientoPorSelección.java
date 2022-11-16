package ordenamientoporselección;

import java.util.Scanner;

public class OrdenamientoPorSelección {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int temp;
        int[] arreglo = new int[10];

        System.out.println("ingrese los Datos del Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("el orden original:....");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(i + " : " + arreglo[i]);
        }

        System.out.println("ordenando por seleccion");

        for (int i = 0; i < arreglo.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }
            temp = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = temp;

        }
        System.out.println("orden ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println( arreglo[i]);
        }
    }
}

