package com.unionpay.boot.pojo;

import java.util.Date;

public class PictureAfterAi extends PictureAfterAiKey {
    private Short code;

    private Float bankScore;

    private Date requestTime;

    private Date resultTime;

    public PictureAfterAi(Integer id, String deviceId, Short code, Float bankScore, Date requestTime, Date resultTime) {
        super(id, deviceId);
        this.code = code;
        this.bankScore = bankScore;
        this.requestTime = requestTime;
        this.resultTime = resultTime;
    }

    public PictureAfterAi() {
        super();
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public Float getBankScore() {
        return bankScore;
    }

    public void setBankScore(Float bankScore) {
        this.bankScore = bankScore;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }
}