package org.seckill.entity;

import java.util.Date;

/**
 * Created by ad-young on 2017/8/24.
 */
public class Seckill {

    private long seckillId;
    private String name;
    private int number;
    private Date StartTime;
    private Date endTime;
    private Date createTime;

    private Seckill seckill;

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public Seckill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", StartTime=" + StartTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }



    public Seckill(long seckillId, String name, int number, Date startTime, Date endTime, Date createTime) {
        this.seckillId = seckillId;
        this.name = name;
        this.number = number;
        StartTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
    }
}
