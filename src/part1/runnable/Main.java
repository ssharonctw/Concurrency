package part1.runnable;

public class Main {
    public static void main(String[] args) {
        //creating a thread, and specifying what a thread will do (by passing in a runnable)
        System.out.println("Start of main thread");
        Thread thread = new Thread(new PrintNumber());
        thread.start();
        System.out.println("End of main thread");
    }
}
