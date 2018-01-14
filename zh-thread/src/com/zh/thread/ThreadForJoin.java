package com.zh.thread;

/**
 * Description: Thread の Join(); <BR>
 * <p>
 *
 * @author zheng.hao
 * ClassName: ThreadForJoin    Copyright: Copyright (c)
 * @date 2017/12/17 14:03
 */
public class ThreadForJoin implements  Runnable{

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(Thread.currentThread().getName() + "_" + i++);
        }
    }
}
