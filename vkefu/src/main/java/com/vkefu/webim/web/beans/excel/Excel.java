package com.vkefu.webim.web.beans.excel;

import java.io.Serializable;

public class Excel implements Serializable{
    @cn.afterturn.easypoi.excel.annotation.Excel(name = "任务ID")
    private Integer     id;

    @cn.afterturn.easypoi.excel.annotation.Excel(name = "电话号码")
    private String        phone;

    @cn.afterturn.easypoi.excel.annotation.Excel(name = "客户ID")
    private long   customId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public long getCustomId() {
        return customId;
    }

    public void setCustomId(long customId) {
        this.customId = customId;
    }
}