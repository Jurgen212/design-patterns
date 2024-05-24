package com.sanclemente.models.state;

import com.sanclemente.models.user.User;

public abstract class State {

    User user;

    State(User user) {
        this.user = user;
    }

    public abstract String onActive();
    public abstract String onDisable();
    public abstract String onLock();
    public abstract String onBuy();
}
