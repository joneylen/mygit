package com.unionpay.boot.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class TransactionRecordResponseData {


    private String  mchnt_nm ;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp trans_time;

    private BigDecimal trans_at;

    private  Float sensor_pro;//轨迹分数

    private Float bank_score;//银行卡评分

    private Float score;//综合评分

    private  Integer status;//有无异常

    private String mchnt_cd ;//商户ID


    public String getMchnt_nm() {
        return mchnt_nm;
    }

    public void setMchnt_nm(String mchnt_nm) {
        this.mchnt_nm = mchnt_nm;
    }

    public Timestamp getTrans_time() {
        return trans_time;
    }

    public void setTrans_time(Timestamp trans_time) {
        this.trans_time = trans_time;
    }

    public BigDecimal getTrans_at() {
        return trans_at;
    }

    public void setTrans_at(BigDecimal trans_at) {
        this.trans_at = trans_at;
    }

    public Float getSensor_pro() {
        return sensor_pro;
    }

    public void setSensor_pro(Float sensor_pro) {
        this.sensor_pro = sensor_pro;
    }

    public Float getBank_score() {
        return bank_score;
    }

    public void setBank_score(Float bank_score) {
        this.bank_score = bank_score;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMchnt_cd() {
        return mchnt_cd;
    }

    public void setMchnt_cd(String mchnt_cd) {
        this.mchnt_cd = mchnt_cd;
    }

    @Override
    public String toString() {
        return "TransactionRecordResponseData{" +
                "mchnt_nm='" + mchnt_nm + '\'' +
                ", trans_time=" + trans_time +
                ", trans_at=" + trans_at +
                ", sensor_pro=" + sensor_pro +
                ", bank_score=" + bank_score +
                ", score=" + score +
                ", status=" + status +
                ", mchnt_cd='" + mchnt_cd + '\'' +
                '}';
    }
}
