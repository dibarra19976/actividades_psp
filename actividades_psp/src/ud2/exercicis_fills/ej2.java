package ud2.exercicis_fills;

public class ej2 {

    public static class hiloNUmeros extends Thread {

        int i = 1;
        public void run() {
            try {
                do { 
                    System.out.println(i);
                    i++;
                    sleep(1500);
                } while (i<=20);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        hiloNUmeros hilo = new hiloNUmeros();
        hilo.start();
    }
}
