package com.zh;

/**
 * Description: <BR>
 * <p>
 * @date 2017/12/14 13:30
 */
public class TestCreateThread {

    public static void main(String[] args) {
        CreateThread createThread = new CreateThread();
        System.out.println(Thread.currentThread().getName());
        createThread.getCurrentThreadName();
    }
}
