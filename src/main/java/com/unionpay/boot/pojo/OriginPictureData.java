package com.unionpay.boot.pojo;

import java.util.Date;

public class OriginPictureData extends OriginPictureDataKey {
    private Date requestTime;

    private byte[] pictureByte;

    public OriginPictureData(Integer id, String deviceId, Date requestTime, byte[] pictureByte) {
        super(id, deviceId);
        this.requestTime = requestTime;
        this.pictureByte = pictureByte;
    }

    public OriginPictureData() {
        super();
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public byte[] getPictureByte() {
        return pictureByte;
    }

    public void setPictureByte(byte[] pictureByte) {
        this.pictureByte = pictureByte;
    }
}