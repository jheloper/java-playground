package com.jhkim.multithread;

import org.awaitility.Awaitility;
import org.junit.Test;

public class MultiThreadTest {

    @Test
    public void makeThreadByRunnable() {

        final Runnable task = new TestTask();
        final Thread thread = new Thread(task);

        thread.start();

        Awaitility.await().until(() -> {
            return thread.getState() == Thread.State.TERMINATED;
        });
    }
}
