package com.zh.thread;

/**
 * Description: RailwayTicket的 Test类 ， 设置为后台线程 <BR>
 * <p>
 *
 * @author zheng.hao
 * ClassName:   RailwayTicketTest  Copyright: Copyright (c)
 * @date 2017/12/17 13:36
 */
public class RailwayTicketDaemonTest {

    public static void main(String[] args) {
        RailwayTicket ticket = new RailwayTicket();
        Thread thread = new Thread(ticket);
        thread.setDaemon(true);
        thread.start();

    }
}
