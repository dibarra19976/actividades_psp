package ud2.exercicis_fills;

import java.util.Scanner;

public class ej4 {

    public static class hiloMascota extends Thread {

        Scanner scan = new Scanner(System.in);
        String name = "";
        int distancia = 1;

        public void run() {
            System.out.println("Ingrese el nombre de la mascota: ");
            name = scan.nextLine();
           do { 
               System.out.print(distancia + "mt ");
               distancia++;
           } while (distancia<=30);
            System.out.println("\nLlego a la meta "+ name);
        }
    }

    public static void main(String[] args) {
        hiloMascota hilo = new hiloMascota();
        hiloMascota hilo2 = new hiloMascota();
        hiloMascota hilo3 = new hiloMascota();
        hilo.start();
        hilo2.start();
        hilo3.start();

    }
}
