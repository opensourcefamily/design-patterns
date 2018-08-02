package com.studyinghome.singleton;

/**
 * @author leslie
 * @create 2018-08-01 17:45
 */

public class People {

    public static void main(String[] args) {
        //前天
        int ticket1 = TicketMaker.getInstance();
        System.out.println("剩余票数为:" + ticket1);

        //昨天
        int ticket2 = TicketMaker.getInstance();
        System.out.println("剩余票数为:" + ticket2);

        //今天
        int ticket3 = TicketMaker.getInstance();
        System.out.println("剩余票数为:" + ticket3);
    }
}
