package com.studyinghome.singleton;

/**
 * ${单例类}
 *
 * @author leslie
 * @create 2018-08-01 17:44
 */

public class TicketMaker {
    private static int ticket = 1000;

    private TicketMaker() {
    }

    public synchronized static int getInstance() {
        return ticket--;
    }
}
