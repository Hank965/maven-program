package com.zh.thread;

/**
 * Description: 使用线程实现火车票售卖 <BR>
 * <p>
 * Title: <BR>
 *
 * @author zheng.hao
 * ClassName: RailwayTicket    Copyright: Copyright (c)
 * @date 2017/12/17 13:27
 */
public class RailwayTicket /*extends  Thread */ implements Runnable {
    private Integer tickets = 1000;

    private String synicedUse = new String("");
    @Override
    public void run() {
        /* 线程同步， 靠的是检查一个对象的标志位  ， 只要让代码块和函数使用同一个监视器对象即可
         所以， 这里监听的对象可以使this ， 也可以是 synicedUse ，
         但是，不能使用 tickets ，因为 tickets 处于不断变化之中
        */
        synchronized (this) {
            while (true) {
                // 正常线程使用
                if (tickets > 0) {
                  /*  try {
//                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println("线程睡眠时 ， 被打断了，异常信息："+e.getMessage());
                    }*/
                    System.out.println("当前线程名：" + Thread.currentThread().getName() + "_" + tickets);
                    tickets --;
                } else {
                    break;
                }
            }
        }

        // 设置为后台线程
        /*while (true) {
            System.out.println("当前线程名：" + Thread.currentThread().getName());
        }*/
    }


}
