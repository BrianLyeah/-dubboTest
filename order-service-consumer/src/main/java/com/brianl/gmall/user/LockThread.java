package com.brianl.gmall.user;

import lombok.SneakyThrows;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-28 10:05
 */
public class LockThread extends Thread {

    private final UserA a;
    private final UserA b;

    public LockThread(UserA a, UserA b) {
        this.a = a;
        this.b = b;
    }


    @SneakyThrows
    @Override
    public void run() {
      synchronized (a){
          Thread.sleep(1000);
              System.out.println("线程："+Thread.currentThread().getName()+"获取锁"+a.getName());
          synchronized (b){
              System.out.println("线程："+Thread.currentThread().getName()+"获取锁"+b.getName());
          }
      }
    }
}
