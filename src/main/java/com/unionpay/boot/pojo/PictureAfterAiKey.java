package com.unionpay.boot.pojo;

public class PictureAfterAiKey {
    private Integer id;

    private String deviceId;

    public PictureAfterAiKey(Integer id, String deviceId) {
        this.id = id;
        this.deviceId = deviceId;
    }

    public PictureAfterAiKey() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }
}