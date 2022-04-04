package part1.functionalInterface;

public class Main{
    //Previously we need to create another task and implement runnables
    //then use Thread thread = new Thread(new PrintNumber());
    //then thread.start to start the thread

    //we can simplify the code since runnable is a functional interface
    //a functional interface is a interface that only has one method
    //we can use Interface name = ()->{//override function body} to create a runnable functional interface instance




    public static void main(String[] args) {
        System.out.println("start of main");
        //Method 1: create an runnable instance explictly and then passed into the thread when creating a thread object
        Runnable task = ()->{
            for(int i=0; i<=10; i++){
                System.out.println("i: "+i);
            }
        };

        Thread thread1 = new Thread(task);
        thread1.start();
        //Method 2: use anonymous inner class object in creation of thread object
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<=10; i++){
                    System.out.println("i: "+i);
                }
            }
        });
        thread2.start();
        //Method 3: post Java8, we can use lambda expression to replace the anonymous functional interface instance
        Thread thread3 = new Thread(()->{
            for(int i=0; i<10; i++){
                System.out.println("i: "+i);
            }
        });
        thread3.start();
        System.out.println("end of main");
    }
}
