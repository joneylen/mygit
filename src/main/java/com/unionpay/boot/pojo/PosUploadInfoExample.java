package com.unionpay.boot.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PosUploadInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PosUploadInfoExample() {
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

        public Criteria andMchntNmIsNull() {
            addCriterion("mchnt_nm is null");
            return (Criteria) this;
        }

        public Criteria andMchntNmIsNotNull() {
            addCriterion("mchnt_nm is not null");
            return (Criteria) this;
        }

        public Criteria andMchntNmEqualTo(String value) {
            addCriterion("mchnt_nm =", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmNotEqualTo(String value) {
            addCriterion("mchnt_nm <>", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmGreaterThan(String value) {
            addCriterion("mchnt_nm >", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_nm >=", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmLessThan(String value) {
            addCriterion("mchnt_nm <", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmLessThanOrEqualTo(String value) {
            addCriterion("mchnt_nm <=", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmLike(String value) {
            addCriterion("mchnt_nm like", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmNotLike(String value) {
            addCriterion("mchnt_nm not like", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmIn(List<String> values) {
            addCriterion("mchnt_nm in", values, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmNotIn(List<String> values) {
            addCriterion("mchnt_nm not in", values, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmBetween(String value1, String value2) {
            addCriterion("mchnt_nm between", value1, value2, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmNotBetween(String value1, String value2) {
            addCriterion("mchnt_nm not between", value1, value2, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmIsNull() {
            addCriterion("acquier_nm is null");
            return (Criteria) this;
        }

        public Criteria andAcquierNmIsNotNull() {
            addCriterion("acquier_nm is not null");
            return (Criteria) this;
        }

        public Criteria andAcquierNmEqualTo(String value) {
            addCriterion("acquier_nm =", value, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmNotEqualTo(String value) {
            addCriterion("acquier_nm <>", value, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmGreaterThan(String value) {
            addCriterion("acquier_nm >", value, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmGreaterThanOrEqualTo(String value) {
            addCriterion("acquier_nm >=", value, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmLessThan(String value) {
            addCriterion("acquier_nm <", value, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmLessThanOrEqualTo(String value) {
            addCriterion("acquier_nm <=", value, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmLike(String value) {
            addCriterion("acquier_nm like", value, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmNotLike(String value) {
            addCriterion("acquier_nm not like", value, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmIn(List<String> values) {
            addCriterion("acquier_nm in", values, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmNotIn(List<String> values) {
            addCriterion("acquier_nm not in", values, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmBetween(String value1, String value2) {
            addCriterion("acquier_nm between", value1, value2, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierNmNotBetween(String value1, String value2) {
            addCriterion("acquier_nm not between", value1, value2, "acquierNm");
            return (Criteria) this;
        }

        public Criteria andAcquierCdIsNull() {
            addCriterion("acquier_cd is null");
            return (Criteria) this;
        }

        public Criteria andAcquierCdIsNotNull() {
            addCriterion("acquier_cd is not null");
            return (Criteria) this;
        }

        public Criteria andAcquierCdEqualTo(String value) {
            addCriterion("acquier_cd =", value, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdNotEqualTo(String value) {
            addCriterion("acquier_cd <>", value, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdGreaterThan(String value) {
            addCriterion("acquier_cd >", value, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdGreaterThanOrEqualTo(String value) {
            addCriterion("acquier_cd >=", value, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdLessThan(String value) {
            addCriterion("acquier_cd <", value, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdLessThanOrEqualTo(String value) {
            addCriterion("acquier_cd <=", value, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdLike(String value) {
            addCriterion("acquier_cd like", value, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdNotLike(String value) {
            addCriterion("acquier_cd not like", value, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdIn(List<String> values) {
            addCriterion("acquier_cd in", values, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdNotIn(List<String> values) {
            addCriterion("acquier_cd not in", values, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdBetween(String value1, String value2) {
            addCriterion("acquier_cd between", value1, value2, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andAcquierCdNotBetween(String value1, String value2) {
            addCriterion("acquier_cd not between", value1, value2, "acquierCd");
            return (Criteria) this;
        }

        public Criteria andMchntTpIsNull() {
            addCriterion("mchnt_tp is null");
            return (Criteria) this;
        }

        public Criteria andMchntTpIsNotNull() {
            addCriterion("mchnt_tp is not null");
            return (Criteria) this;
        }

        public Criteria andMchntTpEqualTo(String value) {
            addCriterion("mchnt_tp =", value, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpNotEqualTo(String value) {
            addCriterion("mchnt_tp <>", value, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpGreaterThan(String value) {
            addCriterion("mchnt_tp >", value, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_tp >=", value, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpLessThan(String value) {
            addCriterion("mchnt_tp <", value, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpLessThanOrEqualTo(String value) {
            addCriterion("mchnt_tp <=", value, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpLike(String value) {
            addCriterion("mchnt_tp like", value, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpNotLike(String value) {
            addCriterion("mchnt_tp not like", value, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpIn(List<String> values) {
            addCriterion("mchnt_tp in", values, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpNotIn(List<String> values) {
            addCriterion("mchnt_tp not in", values, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpBetween(String value1, String value2) {
            addCriterion("mchnt_tp between", value1, value2, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andMchntTpNotBetween(String value1, String value2) {
            addCriterion("mchnt_tp not between", value1, value2, "mchntTp");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNull() {
            addCriterion("term_id is null");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNotNull() {
            addCriterion("term_id is not null");
            return (Criteria) this;
        }

        public Criteria andTermIdEqualTo(String value) {
            addCriterion("term_id =", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotEqualTo(String value) {
            addCriterion("term_id <>", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThan(String value) {
            addCriterion("term_id >", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThanOrEqualTo(String value) {
            addCriterion("term_id >=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThan(String value) {
            addCriterion("term_id <", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThanOrEqualTo(String value) {
            addCriterion("term_id <=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLike(String value) {
            addCriterion("term_id like", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotLike(String value) {
            addCriterion("term_id not like", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdIn(List<String> values) {
            addCriterion("term_id in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotIn(List<String> values) {
            addCriterion("term_id not in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdBetween(String value1, String value2) {
            addCriterion("term_id between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotBetween(String value1, String value2) {
            addCriterion("term_id not between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andCardNmIsNull() {
            addCriterion("card_nm is null");
            return (Criteria) this;
        }

        public Criteria andCardNmIsNotNull() {
            addCriterion("card_nm is not null");
            return (Criteria) this;
        }

        public Criteria andCardNmEqualTo(String value) {
            addCriterion("card_nm =", value, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmNotEqualTo(String value) {
            addCriterion("card_nm <>", value, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmGreaterThan(String value) {
            addCriterion("card_nm >", value, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmGreaterThanOrEqualTo(String value) {
            addCriterion("card_nm >=", value, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmLessThan(String value) {
            addCriterion("card_nm <", value, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmLessThanOrEqualTo(String value) {
            addCriterion("card_nm <=", value, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmLike(String value) {
            addCriterion("card_nm like", value, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmNotLike(String value) {
            addCriterion("card_nm not like", value, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmIn(List<String> values) {
            addCriterion("card_nm in", values, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmNotIn(List<String> values) {
            addCriterion("card_nm not in", values, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmBetween(String value1, String value2) {
            addCriterion("card_nm between", value1, value2, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardNmNotBetween(String value1, String value2) {
            addCriterion("card_nm not between", value1, value2, "cardNm");
            return (Criteria) this;
        }

        public Criteria andCardTpIsNull() {
            addCriterion("card_tp is null");
            return (Criteria) this;
        }

        public Criteria andCardTpIsNotNull() {
            addCriterion("card_tp is not null");
            return (Criteria) this;
        }

        public Criteria andCardTpEqualTo(String value) {
            addCriterion("card_tp =", value, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpNotEqualTo(String value) {
            addCriterion("card_tp <>", value, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpGreaterThan(String value) {
            addCriterion("card_tp >", value, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpGreaterThanOrEqualTo(String value) {
            addCriterion("card_tp >=", value, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpLessThan(String value) {
            addCriterion("card_tp <", value, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpLessThanOrEqualTo(String value) {
            addCriterion("card_tp <=", value, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpLike(String value) {
            addCriterion("card_tp like", value, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpNotLike(String value) {
            addCriterion("card_tp not like", value, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpIn(List<String> values) {
            addCriterion("card_tp in", values, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpNotIn(List<String> values) {
            addCriterion("card_tp not in", values, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpBetween(String value1, String value2) {
            addCriterion("card_tp between", value1, value2, "cardTp");
            return (Criteria) this;
        }

        public Criteria andCardTpNotBetween(String value1, String value2) {
            addCriterion("card_tp not between", value1, value2, "cardTp");
            return (Criteria) this;
        }

        public Criteria andTransTpIsNull() {
            addCriterion("trans_tp is null");
            return (Criteria) this;
        }

        public Criteria andTransTpIsNotNull() {
            addCriterion("trans_tp is not null");
            return (Criteria) this;
        }

        public Criteria andTransTpEqualTo(String value) {
            addCriterion("trans_tp =", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpNotEqualTo(String value) {
            addCriterion("trans_tp <>", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpGreaterThan(String value) {
            addCriterion("trans_tp >", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpGreaterThanOrEqualTo(String value) {
            addCriterion("trans_tp >=", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpLessThan(String value) {
            addCriterion("trans_tp <", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpLessThanOrEqualTo(String value) {
            addCriterion("trans_tp <=", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpLike(String value) {
            addCriterion("trans_tp like", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpNotLike(String value) {
            addCriterion("trans_tp not like", value, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpIn(List<String> values) {
            addCriterion("trans_tp in", values, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpNotIn(List<String> values) {
            addCriterion("trans_tp not in", values, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpBetween(String value1, String value2) {
            addCriterion("trans_tp between", value1, value2, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransTpNotBetween(String value1, String value2) {
            addCriterion("trans_tp not between", value1, value2, "transTp");
            return (Criteria) this;
        }

        public Criteria andTransCdIsNull() {
            addCriterion("trans_cd is null");
            return (Criteria) this;
        }

        public Criteria andTransCdIsNotNull() {
            addCriterion("trans_cd is not null");
            return (Criteria) this;
        }

        public Criteria andTransCdEqualTo(String value) {
            addCriterion("trans_cd =", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotEqualTo(String value) {
            addCriterion("trans_cd <>", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdGreaterThan(String value) {
            addCriterion("trans_cd >", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_cd >=", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLessThan(String value) {
            addCriterion("trans_cd <", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLessThanOrEqualTo(String value) {
            addCriterion("trans_cd <=", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLike(String value) {
            addCriterion("trans_cd like", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotLike(String value) {
            addCriterion("trans_cd not like", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdIn(List<String> values) {
            addCriterion("trans_cd in", values, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotIn(List<String> values) {
            addCriterion("trans_cd not in", values, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdBetween(String value1, String value2) {
            addCriterion("trans_cd between", value1, value2, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotBetween(String value1, String value2) {
            addCriterion("trans_cd not between", value1, value2, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransAtIsNull() {
            addCriterion("trans_at is null");
            return (Criteria) this;
        }

        public Criteria andTransAtIsNotNull() {
            addCriterion("trans_at is not null");
            return (Criteria) this;
        }

        public Criteria andTransAtEqualTo(BigDecimal value) {
            addCriterion("trans_at =", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtNotEqualTo(BigDecimal value) {
            addCriterion("trans_at <>", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtGreaterThan(BigDecimal value) {
            addCriterion("trans_at >", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trans_at >=", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtLessThan(BigDecimal value) {
            addCriterion("trans_at <", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trans_at <=", value, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtIn(List<BigDecimal> values) {
            addCriterion("trans_at in", values, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtNotIn(List<BigDecimal> values) {
            addCriterion("trans_at not in", values, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trans_at between", value1, value2, "transAt");
            return (Criteria) this;
        }

        public Criteria andTransAtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trans_at not between", value1, value2, "transAt");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroIsNull() {
            addCriterion("is_pwd_micro is null");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroIsNotNull() {
            addCriterion("is_pwd_micro is not null");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroEqualTo(Boolean value) {
            addCriterion("is_pwd_micro =", value, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroNotEqualTo(Boolean value) {
            addCriterion("is_pwd_micro <>", value, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroGreaterThan(Boolean value) {
            addCriterion("is_pwd_micro >", value, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pwd_micro >=", value, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroLessThan(Boolean value) {
            addCriterion("is_pwd_micro <", value, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pwd_micro <=", value, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroIn(List<Boolean> values) {
            addCriterion("is_pwd_micro in", values, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroNotIn(List<Boolean> values) {
            addCriterion("is_pwd_micro not in", values, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pwd_micro between", value1, value2, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andIsPwdMicroNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pwd_micro not between", value1, value2, "isPwdMicro");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNull() {
            addCriterion("trans_time is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("trans_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(Date value) {
            addCriterion("trans_time =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(Date value) {
            addCriterion("trans_time <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(Date value) {
            addCriterion("trans_time >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trans_time >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(Date value) {
            addCriterion("trans_time <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(Date value) {
            addCriterion("trans_time <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<Date> values) {
            addCriterion("trans_time in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<Date> values) {
            addCriterion("trans_time not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(Date value1, Date value2) {
            addCriterion("trans_time between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(Date value1, Date value2) {
            addCriterion("trans_time not between", value1, value2, "transTime");
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