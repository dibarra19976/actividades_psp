package ud2;

public class ej2_1 {

    public static class hilo1 extends Thread {

        @Override
        public void run() {
            int i = 1;
            try {
                do {
                    System.out.println("TIC");
                    sleep(1000);
                } while (i == 1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static class hilo2 extends Thread {

        @Override
        public void run() {
            int i = 1;
            try {
                do {
                    System.out.println("TAC");
                    sleep(1000);
                } while (i == 1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        hilo1 hilotic = new hilo1();
        hilo2 hilotac = new hilo2();
        hilotic.start();
        hilotac.start();

      
    }
}
