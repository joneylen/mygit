package com.unionpay.boot.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;


public class TransactionStatisticsData {

    private String tran_num;//历史统计交易次数
    private String abn_tran_num;//历史统计异常此时\
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp tfr_dt_tm;//统计时间


    private BigDecimal tran_amount;//历史交易金额
    private String mer_total;//历史统计时间商户数
    private String mer_sm_count;//历史小微商户数
    private String mer_gen_count;//普通上户总数

    public String getTran_num() {
        return tran_num;
    }

    public void setTran_num(String tran_num) {
        this.tran_num = tran_num;
    }

    public String getAbn_tran_num() {
        return abn_tran_num;
    }

    public void setAbn_tran_num(String abn_tran_num) {
        this.abn_tran_num = abn_tran_num;
    }

    public Timestamp getTfr_dt_tm() {
        return tfr_dt_tm;
    }

    public void setTfr_dt_tm(Timestamp tfr_dt_tm) {
        this.tfr_dt_tm = tfr_dt_tm;
    }

    public BigDecimal getTran_amount() {
        return tran_amount;
    }

    public void setTran_amount(BigDecimal tran_amount) {
        this.tran_amount = tran_amount;
    }

    public String getMer_total() {
        return mer_total;
    }

    public void setMer_total(String mer_total) {
        this.mer_total = mer_total;
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
        return "TransactionStatisticsData{" +
                "tran_num='" + tran_num + '\'' +
                ", abn_tran_num='" + abn_tran_num + '\'' +
                ", tfr_dt_tm=" + tfr_dt_tm +
                ", tran_amount=" + tran_amount +
                ", mer_total='" + mer_total + '\'' +
                ", mer_sm_count='" + mer_sm_count + '\'' +
                ", mer_gen_count='" + mer_gen_count + '\'' +
                '}';
    }
}
