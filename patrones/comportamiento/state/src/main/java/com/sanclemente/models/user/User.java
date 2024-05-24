package com.sanclemente.models.user;

import com.sanclemente.models.state.ActiveState;
import com.sanclemente.models.state.State;

public class User {
    private State state;
    private boolean enable = true;
    private boolean buying = false;

    public User() {
        this.state = new ActiveState(this);
    }
    
    public String onActive() {
        return state.onActive();
    }

    public String onDisable() {
        return state.onDisable();
    }

    public String onLock() {
        return state.onLock();
    }

    public String onBuy() {
        return state.onBuy();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public boolean getEnable() {
        return this.enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isBuying() {
        return this.buying;
    }

    public void setBuying(boolean buying) {
        this.buying = buying;
    }

    public String startBuy() {
        return "Start buying...";
    }
}
