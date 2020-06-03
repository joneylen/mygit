package com.unionpay.boot.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PosUploadInfo extends PosUploadInfoKey {
    private String mchntNm;

    private String acquierNm;

    private String acquierCd;

    private String mchntTp;

    private String termId;

    private String cardNm;

    private String cardTp;

    private String transTp;

    private String transCd;

    private BigDecimal transAt;

    private Boolean isPwdMicro;

    private Date transTime;

    public PosUploadInfo(Integer id, String mchntCd, String mchntNm, String acquierNm, String acquierCd, String mchntTp, String termId, String cardNm, String cardTp, String transTp, String transCd, BigDecimal transAt, Boolean isPwdMicro, Date transTime) {
        super(id, mchntCd);
        this.mchntNm = mchntNm;
        this.acquierNm = acquierNm;
        this.acquierCd = acquierCd;
        this.mchntTp = mchntTp;
        this.termId = termId;
        this.cardNm = cardNm;
        this.cardTp = cardTp;
        this.transTp = transTp;
        this.transCd = transCd;
        this.transAt = transAt;
        this.isPwdMicro = isPwdMicro;
        this.transTime = transTime;
    }

    public PosUploadInfo() {
        super();
    }

    public String getMchntNm() {
        return mchntNm;
    }

    public void setMchntNm(String mchntNm) {
        this.mchntNm = mchntNm == null ? null : mchntNm.trim();
    }

    public String getAcquierNm() {
        return acquierNm;
    }

    public void setAcquierNm(String acquierNm) {
        this.acquierNm = acquierNm == null ? null : acquierNm.trim();
    }

    public String getAcquierCd() {
        return acquierCd;
    }

    public void setAcquierCd(String acquierCd) {
        this.acquierCd = acquierCd == null ? null : acquierCd.trim();
    }

    public String getMchntTp() {
        return mchntTp;
    }

    public void setMchntTp(String mchntTp) {
        this.mchntTp = mchntTp == null ? null : mchntTp.trim();
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId == null ? null : termId.trim();
    }

    public String getCardNm() {
        return cardNm;
    }

    public void setCardNm(String cardNm) {
        this.cardNm = cardNm == null ? null : cardNm.trim();
    }

    public String getCardTp() {
        return cardTp;
    }

    public void setCardTp(String cardTp) {
        this.cardTp = cardTp == null ? null : cardTp.trim();
    }

    public String getTransTp() {
        return transTp;
    }

    public void setTransTp(String transTp) {
        this.transTp = transTp == null ? null : transTp.trim();
    }

    public String getTransCd() {
        return transCd;
    }

    public void setTransCd(String transCd) {
        this.transCd = transCd == null ? null : transCd.trim();
    }

    public BigDecimal getTransAt() {
        return transAt;
    }

    public void setTransAt(BigDecimal transAt) {
        this.transAt = transAt;
    }

    public Boolean getIsPwdMicro() {
        return isPwdMicro;
    }

    public void setIsPwdMicro(Boolean isPwdMicro) {
        this.isPwdMicro = isPwdMicro;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }
}