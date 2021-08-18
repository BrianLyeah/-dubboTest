package com.brianl.gmall.tree;

import com.brianl.gmall.thread.MyThread;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-26 16:01
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            test();
        }
        Thread.sleep(100000);

    }

    public static void test() {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    long id = Thread.currentThread().getId();
                    Node node = new Node(i);
                    System.out.println(id+"------"+i);
                }
            }
        });
        t.start();
        System.out.println(t.getId());
        
    }
    public static void digui(){
        digui();
    }
}
