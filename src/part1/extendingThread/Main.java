package part1.extendingThread;

public class Main {
    public static void main(String[] args) {
        //creating the instance of the thread with its subclass PrintNumber
        System.out.println("Start of Main");
        Thread thread = new PrintNumber();
        //thread.start();
        thread.run();//will not create a new thread
        System.out.println("End of Main");
    }
}
