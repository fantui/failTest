package org.seckill.entity;

import java.util.Date;

public class SuccessKilled {

    private long seckilledId;

    private long userPhone;

    private short state;

    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getSeckilledId() {
        return seckilledId;
    }

    public void setSeckilledId(long seckilledId) {
        this.seckilledId = seckilledId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckilledId=" + seckilledId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
