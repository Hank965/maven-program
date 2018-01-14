package com.zh.thread;

/**
 * Description: <BR>
 * <p>

 * @date 2017/12/17 16:05
 */
public class WhileFor {

    public static void main(String[] args) {
        int x = 10;
        while (true) {
            if(x == 5 ){
               break;
            }
            System.out.println(x--);
        }
    }
}
