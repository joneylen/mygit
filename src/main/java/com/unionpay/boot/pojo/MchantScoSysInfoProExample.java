package com.unionpay.boot.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MchantScoSysInfoProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MchantScoSysInfoProExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMchntCdIsNull() {
            addCriterion("mchnt_cd is null");
            return (Criteria) this;
        }

        public Criteria andMchntCdIsNotNull() {
            addCriterion("mchnt_cd is not null");
            return (Criteria) this;
        }

        public Criteria andMchntCdEqualTo(String value) {
            addCriterion("mchnt_cd =", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdNotEqualTo(String value) {
            addCriterion("mchnt_cd <>", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdGreaterThan(String value) {
            addCriterion("mchnt_cd >", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_cd >=", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdLessThan(String value) {
            addCriterion("mchnt_cd <", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdLessThanOrEqualTo(String value) {
            addCriterion("mchnt_cd <=", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdLike(String value) {
            addCriterion("mchnt_cd like", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdNotLike(String value) {
            addCriterion("mchnt_cd not like", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdIn(List<String> values) {
            addCriterion("mchnt_cd in", values, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdNotIn(List<String> values) {
            addCriterion("mchnt_cd not in", values, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdBetween(String value1, String value2) {
            addCriterion("mchnt_cd between", value1, value2, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdNotBetween(String value1, String value2) {
            addCriterion("mchnt_cd not between", value1, value2, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrIsNull() {
            addCriterion("num_succes_tr is null");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrIsNotNull() {
            addCriterion("num_succes_tr is not null");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrEqualTo(Integer value) {
            addCriterion("num_succes_tr =", value, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrNotEqualTo(Integer value) {
            addCriterion("num_succes_tr <>", value, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrGreaterThan(Integer value) {
            addCriterion("num_succes_tr >", value, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_succes_tr >=", value, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrLessThan(Integer value) {
            addCriterion("num_succes_tr <", value, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrLessThanOrEqualTo(Integer value) {
            addCriterion("num_succes_tr <=", value, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrIn(List<Integer> values) {
            addCriterion("num_succes_tr in", values, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrNotIn(List<Integer> values) {
            addCriterion("num_succes_tr not in", values, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrBetween(Integer value1, Integer value2) {
            addCriterion("num_succes_tr between", value1, value2, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrNotBetween(Integer value1, Integer value2) {
            addCriterion("num_succes_tr not between", value1, value2, "numSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrIsNull() {
            addCriterion("amount_succes_tr is null");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrIsNotNull() {
            addCriterion("amount_succes_tr is not null");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrEqualTo(BigDecimal value) {
            addCriterion("amount_succes_tr =", value, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrNotEqualTo(BigDecimal value) {
            addCriterion("amount_succes_tr <>", value, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrGreaterThan(BigDecimal value) {
            addCriterion("amount_succes_tr >", value, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_succes_tr >=", value, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrLessThan(BigDecimal value) {
            addCriterion("amount_succes_tr <", value, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_succes_tr <=", value, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrIn(List<BigDecimal> values) {
            addCriterion("amount_succes_tr in", values, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrNotIn(List<BigDecimal> values) {
            addCriterion("amount_succes_tr not in", values, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_succes_tr between", value1, value2, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_succes_tr not between", value1, value2, "amountSuccesTr");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetIsNull() {
            addCriterion("num_succes_tr_ret is null");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetIsNotNull() {
            addCriterion("num_succes_tr_ret is not null");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetEqualTo(Integer value) {
            addCriterion("num_succes_tr_ret =", value, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetNotEqualTo(Integer value) {
            addCriterion("num_succes_tr_ret <>", value, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetGreaterThan(Integer value) {
            addCriterion("num_succes_tr_ret >", value, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_succes_tr_ret >=", value, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetLessThan(Integer value) {
            addCriterion("num_succes_tr_ret <", value, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetLessThanOrEqualTo(Integer value) {
            addCriterion("num_succes_tr_ret <=", value, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetIn(List<Integer> values) {
            addCriterion("num_succes_tr_ret in", values, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetNotIn(List<Integer> values) {
            addCriterion("num_succes_tr_ret not in", values, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetBetween(Integer value1, Integer value2) {
            addCriterion("num_succes_tr_ret between", value1, value2, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumSuccesTrRetNotBetween(Integer value1, Integer value2) {
            addCriterion("num_succes_tr_ret not between", value1, value2, "numSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetIsNull() {
            addCriterion("amount_succes_tr_ret is null");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetIsNotNull() {
            addCriterion("amount_succes_tr_ret is not null");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetEqualTo(BigDecimal value) {
            addCriterion("amount_succes_tr_ret =", value, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetNotEqualTo(BigDecimal value) {
            addCriterion("amount_succes_tr_ret <>", value, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetGreaterThan(BigDecimal value) {
            addCriterion("amount_succes_tr_ret >", value, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_succes_tr_ret >=", value, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetLessThan(BigDecimal value) {
            addCriterion("amount_succes_tr_ret <", value, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_succes_tr_ret <=", value, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetIn(List<BigDecimal> values) {
            addCriterion("amount_succes_tr_ret in", values, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetNotIn(List<BigDecimal> values) {
            addCriterion("amount_succes_tr_ret not in", values, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_succes_tr_ret between", value1, value2, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andAmountSuccesTrRetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_succes_tr_ret not between", value1, value2, "amountSuccesTrRet");
            return (Criteria) this;
        }

        public Criteria andNumPayCardIsNull() {
            addCriterion("num_pay_card is null");
            return (Criteria) this;
        }

        public Criteria andNumPayCardIsNotNull() {
            addCriterion("num_pay_card is not null");
            return (Criteria) this;
        }

        public Criteria andNumPayCardEqualTo(Double value) {
            addCriterion("num_pay_card =", value, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardNotEqualTo(Double value) {
            addCriterion("num_pay_card <>", value, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardGreaterThan(Double value) {
            addCriterion("num_pay_card >", value, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardGreaterThanOrEqualTo(Double value) {
            addCriterion("num_pay_card >=", value, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardLessThan(Double value) {
            addCriterion("num_pay_card <", value, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardLessThanOrEqualTo(Double value) {
            addCriterion("num_pay_card <=", value, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardIn(List<Double> values) {
            addCriterion("num_pay_card in", values, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardNotIn(List<Double> values) {
            addCriterion("num_pay_card not in", values, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardBetween(Double value1, Double value2) {
            addCriterion("num_pay_card between", value1, value2, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andNumPayCardNotBetween(Double value1, Double value2) {
            addCriterion("num_pay_card not between", value1, value2, "numPayCard");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountIsNull() {
            addCriterion("devia_amount is null");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountIsNotNull() {
            addCriterion("devia_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountEqualTo(Double value) {
            addCriterion("devia_amount =", value, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountNotEqualTo(Double value) {
            addCriterion("devia_amount <>", value, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountGreaterThan(Double value) {
            addCriterion("devia_amount >", value, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("devia_amount >=", value, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountLessThan(Double value) {
            addCriterion("devia_amount <", value, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountLessThanOrEqualTo(Double value) {
            addCriterion("devia_amount <=", value, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountIn(List<Double> values) {
            addCriterion("devia_amount in", values, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountNotIn(List<Double> values) {
            addCriterion("devia_amount not in", values, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountBetween(Double value1, Double value2) {
            addCriterion("devia_amount between", value1, value2, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andDeviaAmountNotBetween(Double value1, Double value2) {
            addCriterion("devia_amount not between", value1, value2, "deviaAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumIsNull() {
            addCriterion("propor_credit_num is null");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumIsNotNull() {
            addCriterion("propor_credit_num is not null");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumEqualTo(Float value) {
            addCriterion("propor_credit_num =", value, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumNotEqualTo(Float value) {
            addCriterion("propor_credit_num <>", value, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumGreaterThan(Float value) {
            addCriterion("propor_credit_num >", value, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumGreaterThanOrEqualTo(Float value) {
            addCriterion("propor_credit_num >=", value, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumLessThan(Float value) {
            addCriterion("propor_credit_num <", value, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumLessThanOrEqualTo(Float value) {
            addCriterion("propor_credit_num <=", value, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumIn(List<Float> values) {
            addCriterion("propor_credit_num in", values, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumNotIn(List<Float> values) {
            addCriterion("propor_credit_num not in", values, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumBetween(Float value1, Float value2) {
            addCriterion("propor_credit_num between", value1, value2, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditNumNotBetween(Float value1, Float value2) {
            addCriterion("propor_credit_num not between", value1, value2, "proporCreditNum");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountIsNull() {
            addCriterion("propor_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountIsNotNull() {
            addCriterion("propor_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountEqualTo(Float value) {
            addCriterion("propor_credit_amount =", value, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountNotEqualTo(Float value) {
            addCriterion("propor_credit_amount <>", value, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountGreaterThan(Float value) {
            addCriterion("propor_credit_amount >", value, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("propor_credit_amount >=", value, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountLessThan(Float value) {
            addCriterion("propor_credit_amount <", value, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountLessThanOrEqualTo(Float value) {
            addCriterion("propor_credit_amount <=", value, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountIn(List<Float> values) {
            addCriterion("propor_credit_amount in", values, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountNotIn(List<Float> values) {
            addCriterion("propor_credit_amount not in", values, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountBetween(Float value1, Float value2) {
            addCriterion("propor_credit_amount between", value1, value2, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporCreditAmountNotBetween(Float value1, Float value2) {
            addCriterion("propor_credit_amount not between", value1, value2, "proporCreditAmount");
            return (Criteria) this;
        }

        public Criteria andProporTimeIsNull() {
            addCriterion("propor_time is null");
            return (Criteria) this;
        }

        public Criteria andProporTimeIsNotNull() {
            addCriterion("propor_time is not null");
            return (Criteria) this;
        }

        public Criteria andProporTimeEqualTo(Double value) {
            addCriterion("propor_time =", value, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeNotEqualTo(Double value) {
            addCriterion("propor_time <>", value, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeGreaterThan(Double value) {
            addCriterion("propor_time >", value, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("propor_time >=", value, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeLessThan(Double value) {
            addCriterion("propor_time <", value, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeLessThanOrEqualTo(Double value) {
            addCriterion("propor_time <=", value, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeIn(List<Double> values) {
            addCriterion("propor_time in", values, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeNotIn(List<Double> values) {
            addCriterion("propor_time not in", values, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeBetween(Double value1, Double value2) {
            addCriterion("propor_time between", value1, value2, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporTimeNotBetween(Double value1, Double value2) {
            addCriterion("propor_time not between", value1, value2, "proporTime");
            return (Criteria) this;
        }

        public Criteria andProporYsfIsNull() {
            addCriterion("propor_ysf is null");
            return (Criteria) this;
        }

        public Criteria andProporYsfIsNotNull() {
            addCriterion("propor_ysf is not null");
            return (Criteria) this;
        }

        public Criteria andProporYsfEqualTo(Float value) {
            addCriterion("propor_ysf =", value, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfNotEqualTo(Float value) {
            addCriterion("propor_ysf <>", value, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfGreaterThan(Float value) {
            addCriterion("propor_ysf >", value, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfGreaterThanOrEqualTo(Float value) {
            addCriterion("propor_ysf >=", value, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfLessThan(Float value) {
            addCriterion("propor_ysf <", value, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfLessThanOrEqualTo(Float value) {
            addCriterion("propor_ysf <=", value, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfIn(List<Float> values) {
            addCriterion("propor_ysf in", values, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfNotIn(List<Float> values) {
            addCriterion("propor_ysf not in", values, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfBetween(Float value1, Float value2) {
            addCriterion("propor_ysf between", value1, value2, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporYsfNotBetween(Float value1, Float value2) {
            addCriterion("propor_ysf not between", value1, value2, "proporYsf");
            return (Criteria) this;
        }

        public Criteria andProporStripeIsNull() {
            addCriterion("propor_stripe is null");
            return (Criteria) this;
        }

        public Criteria andProporStripeIsNotNull() {
            addCriterion("propor_stripe is not null");
            return (Criteria) this;
        }

        public Criteria andProporStripeEqualTo(Float value) {
            addCriterion("propor_stripe =", value, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeNotEqualTo(Float value) {
            addCriterion("propor_stripe <>", value, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeGreaterThan(Float value) {
            addCriterion("propor_stripe >", value, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeGreaterThanOrEqualTo(Float value) {
            addCriterion("propor_stripe >=", value, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeLessThan(Float value) {
            addCriterion("propor_stripe <", value, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeLessThanOrEqualTo(Float value) {
            addCriterion("propor_stripe <=", value, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeIn(List<Float> values) {
            addCriterion("propor_stripe in", values, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeNotIn(List<Float> values) {
            addCriterion("propor_stripe not in", values, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeBetween(Float value1, Float value2) {
            addCriterion("propor_stripe between", value1, value2, "proporStripe");
            return (Criteria) this;
        }

        public Criteria andProporStripeNotBetween(Float value1, Float value2) {
            addCriterion("propor_stripe not between", value1, value2, "proporStripe");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}