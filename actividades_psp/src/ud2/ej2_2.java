package ud2;

public class ej2_2 {

    public static class hilo1 implements Runnable {

        @Override
        public void run() {
            int i = 1;
            try {
                do {
                    System.out.println("TIC");
                } while (i == 1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static class hilo2 implements Runnable {

        @Override
        public void run() {
            int i = 1;
            try {
                do {
                    System.out.println("TAC");
                } while (i == 1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        hilo1 hilo1 = new hilo1();
        hilo2 hilo2 = new hilo2();
        Thread hilotic = new Thread(hilo1);
        Thread hilotac = new Thread(hilo2);
        hilotic.start();
        hilotac.start();

      
    }
}
