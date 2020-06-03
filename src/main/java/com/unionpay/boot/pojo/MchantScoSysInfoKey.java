package com.unionpay.boot.pojo;

public class MchantScoSysInfoKey {
    private Integer id;

    private String mchntCd;

    public MchantScoSysInfoKey(Integer id, String mchntCd) {
        this.id = id;
        this.mchntCd = mchntCd;
    }

    public MchantScoSysInfoKey() {
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