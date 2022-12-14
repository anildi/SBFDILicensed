/*
Copyright 2019-2022 Anil Pal
All rights reserved by The Third Lane, LLC.
*/

package ttl.larku.domain;

import java.time.Duration;

public class DummyTimerConfigFromProps {

    private Duration timeout;
    private boolean countDown;

    public Duration getTimeout() {
        return timeout;
    }

    public void setTimeout(Duration timeout) {
        this.timeout = timeout;
    }

    public boolean isCountDown() {
        return countDown;
    }

    public void setCountDown(boolean countDown) {
        this.countDown = countDown;
    }
}
