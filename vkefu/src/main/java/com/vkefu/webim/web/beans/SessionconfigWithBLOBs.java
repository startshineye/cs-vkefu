package com.vkefu.webim.web.beans;

public class SessionconfigWithBLOBs extends Sessionconfig {
    private String workinghours;

    private String notinwhmsg;

    public String getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(String workinghours) {
        this.workinghours = workinghours == null ? null : workinghours.trim();
    }

    public String getNotinwhmsg() {
        return notinwhmsg;
    }

    public void setNotinwhmsg(String notinwhmsg) {
        this.notinwhmsg = notinwhmsg == null ? null : notinwhmsg.trim();
    }
}