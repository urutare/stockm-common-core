package com.urutare.commoncore.helpers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public interface Schedule {
    ExecutorService exec = Executors.newFixedThreadPool(3,
            runnable -> {
                Thread thread = new Thread(runnable);
                thread.setDaemon(true);
                return thread;
            });
}
