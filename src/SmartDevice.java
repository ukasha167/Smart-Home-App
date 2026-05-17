package src;

import java.io.*;

public abstract class SmartDevice implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private boolean state;

    public SmartDevice(String name) {
        this.name = name;
        state = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}
