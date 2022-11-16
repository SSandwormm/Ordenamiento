package ordenamientoporinsercion;

import java.util.Scanner;

public class OrdenamientoPorInsercion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int aux;
        int posicion;

        System.out.println("ingrese los datos del arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = entrada.nextInt();
        }

        //metodo de insercion 
        for (int i = 0; i < arreglo.length; i++) {
            posicion = i;
            aux = arreglo[i];
            while ((posicion > 0) && (arreglo[i - 1] > aux)) {
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }
            arreglo[posicion] = aux;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            
        }

      
    }

}
