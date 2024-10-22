package ud2.exercicis_fills;

import java.util.Scanner;

public class ej3 {

    public static class hioAtleta extends Thread {

        Scanner scan = new Scanner(System.in);
        String name = "";
        int distancia = 1;

        public void run() {
            System.out.println("Ingrese el nombre del atleta: ");
            name = scan.nextLine();
           do { 
               System.out.print(distancia + " km ");
               distancia++;
           } while (distancia<=30);
            System.out.println("\nLlego a la meta "+ name);
        }
    }

    public static void main(String[] args) {
        hioAtleta hilo = new hioAtleta();
        hilo.start();
    }
}
