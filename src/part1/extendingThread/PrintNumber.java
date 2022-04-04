package part1.extendingThread;

public class PrintNumber extends Thread{
    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            System.out.println("i: "+i);
        }
    }
}
