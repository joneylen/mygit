package com.unionpay.boot.pojo;

import java.math.BigDecimal;

public class MchantScoSysInfoPro extends MchantScoSysInfoProKey {
    private Integer numSuccesTr;

    private BigDecimal amountSuccesTr;

    private Integer numSuccesTrRet;

    private BigDecimal amountSuccesTrRet;

    private Double numPayCard;

    private Double deviaAmount;

    private Float proporCreditNum;

    private Float proporCreditAmount;

    private Double proporTime;

    private Float proporYsf;

    private Float proporStripe;

    public MchantScoSysInfoPro(Integer id, String mchntCd, Integer numSuccesTr, BigDecimal amountSuccesTr, Integer numSuccesTrRet, BigDecimal amountSuccesTrRet, Double numPayCard, Double deviaAmount, Float proporCreditNum, Float proporCreditAmount, Double proporTime, Float proporYsf, Float proporStripe) {
        super(id, mchntCd);
        this.numSuccesTr = numSuccesTr;
        this.amountSuccesTr = amountSuccesTr;
        this.numSuccesTrRet = numSuccesTrRet;
        this.amountSuccesTrRet = amountSuccesTrRet;
        this.numPayCard = numPayCard;
        this.deviaAmount = deviaAmount;
        this.proporCreditNum = proporCreditNum;
        this.proporCreditAmount = proporCreditAmount;
        this.proporTime = proporTime;
        this.proporYsf = proporYsf;
        this.proporStripe = proporStripe;
    }

    public MchantScoSysInfoPro() {
        super();
    }

    public Integer getNumSuccesTr() {
        return numSuccesTr;
    }

    public void setNumSuccesTr(Integer numSuccesTr) {
        this.numSuccesTr = numSuccesTr;
    }

    public BigDecimal getAmountSuccesTr() {
        return amountSuccesTr;
    }

    public void setAmountSuccesTr(BigDecimal amountSuccesTr) {
        this.amountSuccesTr = amountSuccesTr;
    }

    public Integer getNumSuccesTrRet() {
        return numSuccesTrRet;
    }

    public void setNumSuccesTrRet(Integer numSuccesTrRet) {
        this.numSuccesTrRet = numSuccesTrRet;
    }

    public BigDecimal getAmountSuccesTrRet() {
        return amountSuccesTrRet;
    }

    public void setAmountSuccesTrRet(BigDecimal amountSuccesTrRet) {
        this.amountSuccesTrRet = amountSuccesTrRet;
    }

    public Double getNumPayCard() {
        return numPayCard;
    }

    public void setNumPayCard(Double numPayCard) {
        this.numPayCard = numPayCard;
    }

    public Double getDeviaAmount() {
        return deviaAmount;
    }

    public void setDeviaAmount(Double deviaAmount) {
        this.deviaAmount = deviaAmount;
    }

    public Float getProporCreditNum() {
        return proporCreditNum;
    }

    public void setProporCreditNum(Float proporCreditNum) {
        this.proporCreditNum = proporCreditNum;
    }

    public Float getProporCreditAmount() {
        return proporCreditAmount;
    }

    public void setProporCreditAmount(Float proporCreditAmount) {
        this.proporCreditAmount = proporCreditAmount;
    }

    public Double getProporTime() {
        return proporTime;
    }

    public void setProporTime(Double proporTime) {
        this.proporTime = proporTime;
    }

    public Float getProporYsf() {
        return proporYsf;
    }

    public void setProporYsf(Float proporYsf) {
        this.proporYsf = proporYsf;
    }

    public Float getProporStripe() {
        return proporStripe;
    }

    public void setProporStripe(Float proporStripe) {
        this.proporStripe = proporStripe;
    }
}