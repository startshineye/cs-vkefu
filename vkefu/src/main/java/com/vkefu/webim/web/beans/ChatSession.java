package com.vkefu.webim.web.beans;

public class ChatSession {
    private String sessionId;

    private String tenantId;

    private String agentuserId;

    private String source;

    private String userId;

    private String userName;

    private String agentId;

    private String agentName;

    private String startTime;

    private String responseTime;

    private String endTime;

    private Integer status;

    private Integer startCause;

    private Integer endCause;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getAgentuserId() {
        return agentuserId;
    }

    public void setAgentuserId(String agentuserId) {
        this.agentuserId = agentuserId == null ? null : agentuserId.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime == null ? null : responseTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStartCause() {
        return startCause;
    }

    public void setStartCause(Integer startCause) {
        this.startCause = startCause;
    }

    public Integer getEndCause() {
        return endCause;
    }

    public void setEndCause(Integer endCause) {
        this.endCause = endCause;
    }
}