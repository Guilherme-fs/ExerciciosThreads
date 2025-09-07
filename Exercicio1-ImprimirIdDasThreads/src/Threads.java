public class Threads extends Thread{
  @Override
    public void run() {
        //int id = (int) getId();
        int id = (int) threadId();
        System.out.println("Id: "+id);


    }
}
