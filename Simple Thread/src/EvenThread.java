public class EvenThread extends Thread{

    public EvenThread(){

    }

    public void run(){
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
            try {
                Thread.sleep(110);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
