package OOps.trial.multithreding;

public class tets extends Thread{
private counter counter;

    public tets(counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
           counter.increment();

        }
    }
}
