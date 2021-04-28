class OddThread extends Thread{

    public OddThread(){

    }
    public void run(){
        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 != 0) System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}