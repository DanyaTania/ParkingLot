package com.epam.gourianova;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import static com.epam.gourianova.Constants.TIME_LIMIT;

@ThreadSafe

public final class TimeCounter {
    @GuardedBy("this") private long value = 0;
    public synchronized long getValue() {
        return value;
    }
    public synchronized long increment() {
        if (value == TIME_LIMIT)
             throw new IllegalStateException("пора ехать на другую стоянку");
        return ++value;
    }
    }