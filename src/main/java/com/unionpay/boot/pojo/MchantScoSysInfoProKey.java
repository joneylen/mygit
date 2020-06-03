package com.unionpay.boot.pojo;

public class MchantScoSysInfoProKey {
    private Integer id;

    private String mchntCd;

    public MchantScoSysInfoProKey(Integer id, String mchntCd) {
        this.id = id;
        this.mchntCd = mchntCd;
    }

    public MchantScoSysInfoProKey() {
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