package com.itheima;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author malichun
 * @create 2023/01/12 0012 20:36
 */
public class TimerTaskApp {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer task run...");
            }
        };
        timer.schedule(timerTask,0,2000);
    }
}
