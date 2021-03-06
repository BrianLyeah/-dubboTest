package com.brianl.gmall.thread;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-26 15:57
 */
public class MyThread implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}
