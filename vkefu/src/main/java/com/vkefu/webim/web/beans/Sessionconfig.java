package com.vkefu.webim.web.beans;

public class Sessionconfig {
    private String sessionconfigId;

    private String tenantId;

    private String creater;

    private String userName;

    private String name;

    private String sessionmsg;

    private String distribution;

    private String timeoutmsg;

    private String retimeoutmsg;

    private Byte satisfaction;

    private String createtime;

    private Byte lastagent;

    private Byte sessiontimeout;

    private Integer timeout;

    private Integer agenttimeoutmsg;

    private Integer maxuser;

    private Byte hourcheck;

    private String noagentmsg;

    private String agentbusymsg;

    private String successmsg;

    public String getSessionconfigId() {
        return sessionconfigId;
    }

    public void setSessionconfigId(String sessionconfigId) {
        this.sessionconfigId = sessionconfigId == null ? null : sessionconfigId.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSessionmsg() {
        return sessionmsg;
    }

    public void setSessionmsg(String sessionmsg) {
        this.sessionmsg = sessionmsg == null ? null : sessionmsg.trim();
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution == null ? null : distribution.trim();
    }

    public String getTimeoutmsg() {
        return timeoutmsg;
    }

    public void setTimeoutmsg(String timeoutmsg) {
        this.timeoutmsg = timeoutmsg == null ? null : timeoutmsg.trim();
    }

    public String getRetimeoutmsg() {
        return retimeoutmsg;
    }

    public void setRetimeoutmsg(String retimeoutmsg) {
        this.retimeoutmsg = retimeoutmsg == null ? null : retimeoutmsg.trim();
    }

    public Byte getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(Byte satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public Byte getLastagent() {
        return lastagent;
    }

    public void setLastagent(Byte lastagent) {
        this.lastagent = lastagent;
    }

    public Byte getSessiontimeout() {
        return sessiontimeout;
    }

    public void setSessiontimeout(Byte sessiontimeout) {
        this.sessiontimeout = sessiontimeout;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getAgenttimeoutmsg() {
        return agenttimeoutmsg;
    }

    public void setAgenttimeoutmsg(Integer agenttimeoutmsg) {
        this.agenttimeoutmsg = agenttimeoutmsg;
    }

    public Integer getMaxuser() {
        return maxuser;
    }

    public void setMaxuser(Integer maxuser) {
        this.maxuser = maxuser;
    }

    public Byte getHourcheck() {
        return hourcheck;
    }

    public void setHourcheck(Byte hourcheck) {
        this.hourcheck = hourcheck;
    }

    public String getNoagentmsg() {
        return noagentmsg;
    }

    public void setNoagentmsg(String noagentmsg) {
        this.noagentmsg = noagentmsg == null ? null : noagentmsg.trim();
    }

    public String getAgentbusymsg() {
        return agentbusymsg;
    }

    public void setAgentbusymsg(String agentbusymsg) {
        this.agentbusymsg = agentbusymsg == null ? null : agentbusymsg.trim();
    }

    public String getSuccessmsg() {
        return successmsg;
    }

    public void setSuccessmsg(String successmsg) {
        this.successmsg = successmsg == null ? null : successmsg.trim();
    }
}