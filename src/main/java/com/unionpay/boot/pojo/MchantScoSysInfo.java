package com.unionpay.boot.pojo;

import java.util.Date;

public class MchantScoSysInfo extends MchantScoSysInfoKey {
    private String cupBranchInsIdCd;

    private String mchntCnNm;

    private String mchntCnAbbr;

    private String acqInsIdCd;

    private String acptInsIdCd;

    private String acqRegionCd;

    private String mchntTp;

    private String regionCd;

    private String cardAccptNmAddr;

    private String mchntAcptCurrBmp;

    private String mchntDftCurrCd;

    private String transChnl;

    private Boolean directAcqSettleIn;

    private Boolean mccApplRule;

    private String industryTp;

    private Boolean misMchntIn;

    private String licNo;

    private String licExpireDt;

    private String regAddr;

    private Integer regCap;

    private String specDiscTp;

    private String specDiscLvl;

    private Date mchntOpenDt;

    public MchantScoSysInfo(Integer id, String mchntCd, String cupBranchInsIdCd, String mchntCnNm, String mchntCnAbbr, String acqInsIdCd, String acptInsIdCd, String acqRegionCd, String mchntTp, String regionCd, String cardAccptNmAddr, String mchntAcptCurrBmp, String mchntDftCurrCd, String transChnl, Boolean directAcqSettleIn, Boolean mccApplRule, String industryTp, Boolean misMchntIn, String licNo, String licExpireDt, String regAddr, Integer regCap, String specDiscTp, String specDiscLvl, Date mchntOpenDt) {
        super(id, mchntCd);
        this.cupBranchInsIdCd = cupBranchInsIdCd;
        this.mchntCnNm = mchntCnNm;
        this.mchntCnAbbr = mchntCnAbbr;
        this.acqInsIdCd = acqInsIdCd;
        this.acptInsIdCd = acptInsIdCd;
        this.acqRegionCd = acqRegionCd;
        this.mchntTp = mchntTp;
        this.regionCd = regionCd;
        this.cardAccptNmAddr = cardAccptNmAddr;
        this.mchntAcptCurrBmp = mchntAcptCurrBmp;
        this.mchntDftCurrCd = mchntDftCurrCd;
        this.transChnl = transChnl;
        this.directAcqSettleIn = directAcqSettleIn;
        this.mccApplRule = mccApplRule;
        this.industryTp = industryTp;
        this.misMchntIn = misMchntIn;
        this.licNo = licNo;
        this.licExpireDt = licExpireDt;
        this.regAddr = regAddr;
        this.regCap = regCap;
        this.specDiscTp = specDiscTp;
        this.specDiscLvl = specDiscLvl;
        this.mchntOpenDt = mchntOpenDt;
    }

    public MchantScoSysInfo() {
        super();
    }

    public String getCupBranchInsIdCd() {
        return cupBranchInsIdCd;
    }

    public void setCupBranchInsIdCd(String cupBranchInsIdCd) {
        this.cupBranchInsIdCd = cupBranchInsIdCd == null ? null : cupBranchInsIdCd.trim();
    }

    public String getMchntCnNm() {
        return mchntCnNm;
    }

    public void setMchntCnNm(String mchntCnNm) {
        this.mchntCnNm = mchntCnNm == null ? null : mchntCnNm.trim();
    }

    public String getMchntCnAbbr() {
        return mchntCnAbbr;
    }

    public void setMchntCnAbbr(String mchntCnAbbr) {
        this.mchntCnAbbr = mchntCnAbbr == null ? null : mchntCnAbbr.trim();
    }

    public String getAcqInsIdCd() {
        return acqInsIdCd;
    }

    public void setAcqInsIdCd(String acqInsIdCd) {
        this.acqInsIdCd = acqInsIdCd == null ? null : acqInsIdCd.trim();
    }

    public String getAcptInsIdCd() {
        return acptInsIdCd;
    }

    public void setAcptInsIdCd(String acptInsIdCd) {
        this.acptInsIdCd = acptInsIdCd == null ? null : acptInsIdCd.trim();
    }

    public String getAcqRegionCd() {
        return acqRegionCd;
    }

    public void setAcqRegionCd(String acqRegionCd) {
        this.acqRegionCd = acqRegionCd == null ? null : acqRegionCd.trim();
    }

    public String getMchntTp() {
        return mchntTp;
    }

    public void setMchntTp(String mchntTp) {
        this.mchntTp = mchntTp == null ? null : mchntTp.trim();
    }

    public String getRegionCd() {
        return regionCd;
    }

    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd == null ? null : regionCd.trim();
    }

    public String getCardAccptNmAddr() {
        return cardAccptNmAddr;
    }

    public void setCardAccptNmAddr(String cardAccptNmAddr) {
        this.cardAccptNmAddr = cardAccptNmAddr == null ? null : cardAccptNmAddr.trim();
    }

    public String getMchntAcptCurrBmp() {
        return mchntAcptCurrBmp;
    }

    public void setMchntAcptCurrBmp(String mchntAcptCurrBmp) {
        this.mchntAcptCurrBmp = mchntAcptCurrBmp == null ? null : mchntAcptCurrBmp.trim();
    }

    public String getMchntDftCurrCd() {
        return mchntDftCurrCd;
    }

    public void setMchntDftCurrCd(String mchntDftCurrCd) {
        this.mchntDftCurrCd = mchntDftCurrCd == null ? null : mchntDftCurrCd.trim();
    }

    public String getTransChnl() {
        return transChnl;
    }

    public void setTransChnl(String transChnl) {
        this.transChnl = transChnl == null ? null : transChnl.trim();
    }

    public Boolean getDirectAcqSettleIn() {
        return directAcqSettleIn;
    }

    public void setDirectAcqSettleIn(Boolean directAcqSettleIn) {
        this.directAcqSettleIn = directAcqSettleIn;
    }

    public Boolean getMccApplRule() {
        return mccApplRule;
    }

    public void setMccApplRule(Boolean mccApplRule) {
        this.mccApplRule = mccApplRule;
    }

    public String getIndustryTp() {
        return industryTp;
    }

    public void setIndustryTp(String industryTp) {
        this.industryTp = industryTp == null ? null : industryTp.trim();
    }

    public Boolean getMisMchntIn() {
        return misMchntIn;
    }

    public void setMisMchntIn(Boolean misMchntIn) {
        this.misMchntIn = misMchntIn;
    }

    public String getLicNo() {
        return licNo;
    }

    public void setLicNo(String licNo) {
        this.licNo = licNo == null ? null : licNo.trim();
    }

    public String getLicExpireDt() {
        return licExpireDt;
    }

    public void setLicExpireDt(String licExpireDt) {
        this.licExpireDt = licExpireDt == null ? null : licExpireDt.trim();
    }

    public String getRegAddr() {
        return regAddr;
    }

    public void setRegAddr(String regAddr) {
        this.regAddr = regAddr == null ? null : regAddr.trim();
    }

    public Integer getRegCap() {
        return regCap;
    }

    public void setRegCap(Integer regCap) {
        this.regCap = regCap;
    }

    public String getSpecDiscTp() {
        return specDiscTp;
    }

    public void setSpecDiscTp(String specDiscTp) {
        this.specDiscTp = specDiscTp == null ? null : specDiscTp.trim();
    }

    public String getSpecDiscLvl() {
        return specDiscLvl;
    }

    public void setSpecDiscLvl(String specDiscLvl) {
        this.specDiscLvl = specDiscLvl == null ? null : specDiscLvl.trim();
    }

    public Date getMchntOpenDt() {
        return mchntOpenDt;
    }

    public void setMchntOpenDt(Date mchntOpenDt) {
        this.mchntOpenDt = mchntOpenDt;
    }
}