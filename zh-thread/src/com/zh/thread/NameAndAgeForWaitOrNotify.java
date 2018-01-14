package com.zh.thread;

/**
 * Description: <BR>
 * <p>

 * @date 2017/12/17 16:30
 */
public class NameAndAgeForWaitOrNotify {

    private String name ;
    private int age ;
    /**
     * true : 可以放入
     * false ： 可以取出
     */
    private boolean isPut ;

    public synchronized void put( String name , int age ) throws InterruptedException {
        if(isPut){
            wait();
        }
        this.name = name;
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println("线程休眠异常 ， 异常信息 ：" + e.getMessage());
        }
        this.age = age ;
        isPut = true;
        notify();
    }

    public synchronized void get() throws InterruptedException {
        if(!isPut){
            wait();
        }
        isPut = false ;
        System.out.println("获取到的 name = " + this.name + "， 获取到的 age = "+ this.age);
    }
}
