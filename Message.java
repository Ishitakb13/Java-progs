package producerconsumer;

public class Message{
    private String message;
    private boolean hasMessage = false;

    public void put(String msg) {
    	synchronized(this) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        message = msg;
        hasMessage = true;
        notify(); 
    }
    }

    public  String get() {
    	synchronized(this) {
        while (!hasMessage) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String msg=message;
        hasMessage = false;
        notify();
        return message;
    }
}
}