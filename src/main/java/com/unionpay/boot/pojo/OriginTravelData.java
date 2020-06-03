package com.unionpay.boot.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class OriginTravelData extends OriginTravelDataKey {

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date requestTime;

    private Date originalTime;

    private Float accX;

    private Float accY;

    private Float accZ;

    private Float gyroX;

    private Float gyroY;

    private Float gyroZ;

    private Float magX;

    private Float magY;

    private Float magZ;

    public OriginTravelData(Integer id, String deviceId, Date requestTime, Date originalTime, Float accX, Float accY, Float accZ, Float gyroX, Float gyroY, Float gyroZ, Float magX, Float magY, Float magZ) {
        super(id, deviceId);
        this.requestTime = requestTime;
        this.originalTime = originalTime;
        this.accX = accX;
        this.accY = accY;
        this.accZ = accZ;
        this.gyroX = gyroX;
        this.gyroY = gyroY;
        this.gyroZ = gyroZ;
        this.magX = magX;
        this.magY = magY;
        this.magZ = magZ;
    }

    public OriginTravelData() {
        super();
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getOriginalTime() {
        return originalTime;
    }

    public void setOriginalTime(Date originalTime) {
        this.originalTime = originalTime;
    }

    public Float getAccX() {
        return accX;
    }

    public void setAccX(Float accX) {
        this.accX = accX;
    }

    public Float getAccY() {
        return accY;
    }

    public void setAccY(Float accY) {
        this.accY = accY;
    }

    public Float getAccZ() {
        return accZ;
    }

    public void setAccZ(Float accZ) {
        this.accZ = accZ;
    }

    public Float getGyroX() {
        return gyroX;
    }

    public void setGyroX(Float gyroX) {
        this.gyroX = gyroX;
    }

    public Float getGyroY() {
        return gyroY;
    }

    public void setGyroY(Float gyroY) {
        this.gyroY = gyroY;
    }

    public Float getGyroZ() {
        return gyroZ;
    }

    public void setGyroZ(Float gyroZ) {
        this.gyroZ = gyroZ;
    }

    public Float getMagX() {
        return magX;
    }

    public void setMagX(Float magX) {
        this.magX = magX;
    }

    public Float getMagY() {
        return magY;
    }

    public void setMagY(Float magY) {
        this.magY = magY;
    }

    public Float getMagZ() {
        return magZ;
    }

    public void setMagZ(Float magZ) {
        this.magZ = magZ;
    }
}