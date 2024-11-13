public class sleepfor extends Thread{
  public sleepfor(String name){
      super(name);

  }
    @Override
    public void run() {
        for (int i = 1; i <12; i++) {
            System.out.println(currentThread().getName()+"    id started");
            Thread.yield();

        }
    }

    public static void main(String[] args) {
        sleepfor s=new sleepfor("amit");
        sleepfor t=new sleepfor("tad");
        t.start();
        s.start();
    }
}
