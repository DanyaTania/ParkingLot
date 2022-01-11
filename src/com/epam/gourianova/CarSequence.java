package com.epam.gourianova;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class CarSequence {
        @GuardedBy("this") private Car nextCar;
        public synchronized Car getNext() {
            return new Car();
        }
}
