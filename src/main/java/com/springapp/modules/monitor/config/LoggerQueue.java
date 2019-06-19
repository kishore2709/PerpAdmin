package com.springapp.modules.monitor.config;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.springapp.modules.monitor.domain.LogMessage;

public class LoggerQueue {
	  /**
     ** Queue size
     */
    public static final int QUEUE_MAX_SIZE = 10000;

    private static LoggerQueue alarmMessageQueue = new LoggerQueue();
    /**
     *Blocking queue
     */
    private BlockingQueue blockingQueue = new LinkedBlockingQueue<>(QUEUE_MAX_SIZE);

    private LoggerQueue() {
    }

    public static LoggerQueue getInstance() {
        return alarmMessageQueue;
    }

    /**
     * Message entry
     * @param log
     * @return
     */
    public boolean push(LogMessage log) {
        return this.blockingQueue.add(log);
    }

    /**
     * Message out
     *
     * @return
     */
    public LogMessage poll() {
        LogMessage result = null;
        try {
            result = (LogMessage) this.blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
