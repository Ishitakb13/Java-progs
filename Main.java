package producerconsumer;


public class Main {
public static void main(String[] args) throws InterruptedException {
Message board = new Message();
Producer p=new Producer(board);
Consumer c= new Consumer(board);

p.start();
c.start();

p.join();
c.join();
}
}