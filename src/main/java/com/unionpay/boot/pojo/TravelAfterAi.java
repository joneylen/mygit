package com.unionpay.boot.pojo;

import java.util.Date;

public class TravelAfterAi extends TravelAfterAiKey {
    private Short code;

    private Integer sensorClass;

    private Float sensorPro;

    private Date requestTime;

    private Date resultTime;

    public TravelAfterAi(Integer id, String deviceId, Short code, Integer sensorClass, Float sensorPro, Date requestTime, Date resultTime) {
        super(id, deviceId);
        this.code = code;
        this.sensorClass = sensorClass;
        this.sensorPro = sensorPro;
        this.requestTime = requestTime;
        this.resultTime = resultTime;
    }

    public TravelAfterAi() {
        super();
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public Integer getSensorClass() {
        return sensorClass;
    }

    public void setSensorClass(Integer sensorClass) {
        this.sensorClass = sensorClass;
    }

    public Float getSensorPro() {
        return sensorPro;
    }

    public void setSensorPro(Float sensorPro) {
        this.sensorPro = sensorPro;
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