package com.vkefu.test;


import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 统计测试类
 * @author JueYue
 *   2014年12月17日 上午11:51:10
 */
public class TestEntity {

    @Excel(name = "任务ID")
    private String     id;

    @Excel(name = "电话号码")
    private String        phone;

    @Excel(name = "客户ID")
    private long   customerId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
}
