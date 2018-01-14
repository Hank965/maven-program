package com.zh.thread;

/**
 * Description: RailwayTicket的 Test类<BR>
 * <p>
 * @author zheng.hao
 * ClassName:   RailwayTicketTest  Copyright: Copyright (c)
 * @date 2017/12/17 13:36
 */
public class RailwayTicketTest {

    public static void main(String[] args) {
        RailwayTicket ticket = new RailwayTicket();
        new Thread(ticket).start();
        new Thread(ticket).start();
        new Thread(ticket).start();
        new Thread(ticket).start();
    }
}
