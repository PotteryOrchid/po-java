package com.po.concurrent;

/**
 * Thread 应用
 * Created by ZJ on 27/03/2018.
 */
public class NumThreadApp {


  public static void main(String[] args) {

    ThreadControlFlag threadControlFlag = new ThreadControlFlag();

    // 线程获得资源执行完后执行 notify() 以唤醒另一个线程，当条件不允许执行时执行 wait() 让出已获得的资源。
    new EvenNumThread(threadControlFlag).start();
    // 线程获得资源执行完后执行 notify() 以唤醒另一个线程，当条件不允许执行时执行 wait() 让出已获得的资源。
    new OddNumThread(threadControlFlag).start();

  }

}
