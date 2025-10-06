package producerconsumer;

class Consumer extends Thread{
private Message board;

public Consumer(Message b){
this.board=b;
}
@Override
public void run(){
String msg;
while(!(msg= board.get()).equals("DONE")){
System.out.println("Consumer reads:"+msg);
}
}
}