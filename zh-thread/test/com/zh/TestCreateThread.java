package com.zh;

/**
 * Description: <BR>
 * <p>
 * @date 2017/12/14 13:30
 */
public class TestCreateThread {

    public static void main(String[] args) {
        new CreateThread().start();
        while (true) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
