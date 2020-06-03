package com.unionpay.boot.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;


public class AllMerchantsInfoResponseData {

    private BigDecimal trans_at;//金额

    private String  trans_count;//交易总数

    private Integer  trans_throw_count;//异常交易次数

    private String  mer_total;//当前总商户数

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp tfr_dt_tm;//统计时间

    private String  mer_sm_count;//当前小微商户总数

    private String   mer_gen_count;//当前普通移动商户总数

    public BigDecimal getTrans_at() {
        return trans_at;
    }

    public void setTrans_at(BigDecimal trans_at) {
        this.trans_at = trans_at;
    }

    public String getTrans_count() {
        return trans_count;
    }

    public void setTrans_count(String trans_count) {
        this.trans_count = trans_count;
    }

    public Integer getTrans_throw_count() {
        return trans_throw_count;
    }

    public void setTrans_throw_count(Integer trans_throw_count) {
        this.trans_throw_count = trans_throw_count;
    }

    public String getMer_total() {
        return mer_total;
    }

    public void setMer_total(String mer_total) {
        this.mer_total = mer_total;
    }

    public Timestamp getTfr_dt_tm() {
        return tfr_dt_tm;
    }

    public void setTfr_dt_tm(Timestamp tfr_dt_tm) {
        this.tfr_dt_tm = tfr_dt_tm;
    }


    public String getMer_sm_count() {
        return mer_sm_count;
    }

    public void setMer_sm_count(String mer_sm_count) {
        this.mer_sm_count = mer_sm_count;
    }

    public String getMer_gen_count() {
        return mer_gen_count;
    }

    public void setMer_gen_count(String mer_gen_count) {
        this.mer_gen_count = mer_gen_count;
    }

    @Override
    public String toString() {
        return "AllMerchantsInfoResponseData{" +
                "trans_at=" + trans_at +
                ", trans_count='" + trans_count + '\'' +
                ", trans_throw_count=" + trans_throw_count +
                ", mer_total='" + mer_total + '\'' +
                ", tfr_dt_tm=" + tfr_dt_tm +
                ", mer_sm_count='" + mer_sm_count + '\'' +
                ", mer_gen_count='" + mer_gen_count + '\'' +
                '}';
    }
}
