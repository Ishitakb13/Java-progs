package producerconsumer;


public class Producer extends Thread {
    private Message board;

    public Producer(Message b) {
        this.board = b;
    }

    @Override
    public void run() {
        String[] messages = {
            "Exam on Monday",
            "Holiday on Tuesday",
            "Workshop on Wednesday"
        };

        for (String msg : messages) {
            System.out.println("Producer sends: " + msg);
            board.put(msg);
           
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        board.put("DONE"); 
    }
}
