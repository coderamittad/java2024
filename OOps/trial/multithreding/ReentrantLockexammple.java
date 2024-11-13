package OOps.trial.multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockexammple {
    private Lock lock=new ReentrantLock();
    public void outerlook(){
        lock.lock();
        try {
            System.out.println("outer look");
            innerlook();
        }finally {
            lock.unlock();
        }   }

    public void innerlook(){
        lock.lock();
        try {
            System.out.println("innerr look");
        }finally {
            lock.unlock();

        }
    }
    public static void main(String[] args) {
        ReentrantLockexammple reentrantLockexammple=new ReentrantLockexammple();
        reentrantLockexammple.outerlook();

    }}

