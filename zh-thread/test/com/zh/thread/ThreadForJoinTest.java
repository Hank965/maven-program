package com.zh.thread;

/**
 * Description: ThreadForJoin 的 Test<BR>
 * <p>
 *
 * @author zheng.hao
 * ClassName: ThreadForJoinTest    Copyright: Copyright (c)
 * @date 2017/12/17 14:08
 */
public class ThreadForJoinTest {

    /**
     * ThreadForJoinTest 的线程走到100的时候， 进入了ThreadForJoin 所在的线程，
     * 当ThreadForJoin 所在的线程结束后， 又回到了ThreadForJoinTest所在的线程
     * @param args
     */
    public static void main(String[] args) {
        ThreadForJoin joinTest = new ThreadForJoin();
        Thread thread = new Thread(joinTest);
        thread.start();
        int i = 0;
        while (i< 1000) {
            if(i == 100 || i == 200 || i == 300){
                try {
                    // join();
                    // join(long millis)  // 指定毫秒数
                    // join(long millis, int nanos)  // 指定毫秒数 + 指定的纳秒数
                    // 当指定的时间到达后 ， 又回到了主线程
                    thread.join(1,10);
                } catch (InterruptedException e) {
                    System.out.println("线程出错 ，"+e.getMessage());
                }
            }
            System.out.println("main thrad :" + i++);
        }

    }

}
