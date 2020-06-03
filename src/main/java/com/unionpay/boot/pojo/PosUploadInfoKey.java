package com.unionpay.boot.pojo;

public class PosUploadInfoKey {
    private Integer id;

    private String mchntCd;

    public PosUploadInfoKey(Integer id, String mchntCd) {
        this.id = id;
        this.mchntCd = mchntCd;
    }

    public PosUploadInfoKey() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMchntCd() {
        return mchntCd;
    }

    public void setMchntCd(String mchntCd) {
        this.mchntCd = mchntCd == null ? null : mchntCd.trim();
    }
}