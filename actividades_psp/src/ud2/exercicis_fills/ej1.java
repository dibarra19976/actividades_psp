package ud2.exercicis_fills;

import java.util.Scanner;

public class ej1 {

    public static class empleatThread extends Thread {

        Scanner scan = new Scanner(System.in);
        String name = "";
        String day = "";
        Double hour = 0.0;

        public void run() {
            System.out.println("Ingrese el nombre del empleado: ");
            name = scan.nextLine();
            System.out.println("Ingrese el dia: ");
            day = scan.nextLine();
            System.out.println("Ingrese la hora: ");
            hour = scan.nextDouble();
            System.out.print(name);
            if (hour < 8.0) {
                System.out.print(" llego a tiempo el dia ");

            }
            else{
                System.out.print(" llego tarde el dia ");

            }
            System.out.println(day);
        }
    }

    public static void main(String[] args) {
        empleatThread hilo = new empleatThread();
        empleatThread hilo2 = new empleatThread();
        hilo.start();
        hilo2.start();
    }
}
