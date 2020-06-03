package com.unionpay.boot.pojo;

public class AllAfterAiResultDataKey {
    private Integer id;

    private String deviceId;

    public AllAfterAiResultDataKey(Integer id, String deviceId) {
        this.id = id;
        this.deviceId = deviceId;
    }

    public AllAfterAiResultDataKey() {
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