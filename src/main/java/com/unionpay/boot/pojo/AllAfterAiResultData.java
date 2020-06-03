package com.unionpay.boot.pojo;

import java.util.Date;

public class AllAfterAiResultData extends AllAfterAiResultDataKey {
    private String merId;

    private Short code;

    private Float score;

    private Short status;

    private Date resultTime;

    public AllAfterAiResultData(Integer id, String deviceId, String merId, Short code, Float score, Short status, Date resultTime) {
        super(id, deviceId);
        this.merId = merId;
        this.code = code;
        this.score = score;
        this.status = status;
        this.resultTime = resultTime;
    }

    public AllAfterAiResultData() {
        super();
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }
}