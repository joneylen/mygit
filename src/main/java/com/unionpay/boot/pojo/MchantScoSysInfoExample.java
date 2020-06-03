package com.unionpay.boot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MchantScoSysInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MchantScoSysInfoExample() {
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

        public Criteria andCupBranchInsIdCdIsNull() {
            addCriterion("cup_branch_ins_id_cd is null");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdIsNotNull() {
            addCriterion("cup_branch_ins_id_cd is not null");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdEqualTo(String value) {
            addCriterion("cup_branch_ins_id_cd =", value, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdNotEqualTo(String value) {
            addCriterion("cup_branch_ins_id_cd <>", value, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdGreaterThan(String value) {
            addCriterion("cup_branch_ins_id_cd >", value, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdGreaterThanOrEqualTo(String value) {
            addCriterion("cup_branch_ins_id_cd >=", value, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdLessThan(String value) {
            addCriterion("cup_branch_ins_id_cd <", value, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdLessThanOrEqualTo(String value) {
            addCriterion("cup_branch_ins_id_cd <=", value, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdLike(String value) {
            addCriterion("cup_branch_ins_id_cd like", value, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdNotLike(String value) {
            addCriterion("cup_branch_ins_id_cd not like", value, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdIn(List<String> values) {
            addCriterion("cup_branch_ins_id_cd in", values, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdNotIn(List<String> values) {
            addCriterion("cup_branch_ins_id_cd not in", values, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdBetween(String value1, String value2) {
            addCriterion("cup_branch_ins_id_cd between", value1, value2, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andCupBranchInsIdCdNotBetween(String value1, String value2) {
            addCriterion("cup_branch_ins_id_cd not between", value1, value2, "cupBranchInsIdCd");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmIsNull() {
            addCriterion("mchnt_cn_nm is null");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmIsNotNull() {
            addCriterion("mchnt_cn_nm is not null");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmEqualTo(String value) {
            addCriterion("mchnt_cn_nm =", value, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmNotEqualTo(String value) {
            addCriterion("mchnt_cn_nm <>", value, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmGreaterThan(String value) {
            addCriterion("mchnt_cn_nm >", value, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_cn_nm >=", value, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmLessThan(String value) {
            addCriterion("mchnt_cn_nm <", value, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmLessThanOrEqualTo(String value) {
            addCriterion("mchnt_cn_nm <=", value, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmLike(String value) {
            addCriterion("mchnt_cn_nm like", value, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmNotLike(String value) {
            addCriterion("mchnt_cn_nm not like", value, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmIn(List<String> values) {
            addCriterion("mchnt_cn_nm in", values, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmNotIn(List<String> values) {
            addCriterion("mchnt_cn_nm not in", values, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmBetween(String value1, String value2) {
            addCriterion("mchnt_cn_nm between", value1, value2, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnNmNotBetween(String value1, String value2) {
            addCriterion("mchnt_cn_nm not between", value1, value2, "mchntCnNm");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrIsNull() {
            addCriterion("mchnt_cn_abbr is null");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrIsNotNull() {
            addCriterion("mchnt_cn_abbr is not null");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrEqualTo(String value) {
            addCriterion("mchnt_cn_abbr =", value, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrNotEqualTo(String value) {
            addCriterion("mchnt_cn_abbr <>", value, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrGreaterThan(String value) {
            addCriterion("mchnt_cn_abbr >", value, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_cn_abbr >=", value, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrLessThan(String value) {
            addCriterion("mchnt_cn_abbr <", value, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrLessThanOrEqualTo(String value) {
            addCriterion("mchnt_cn_abbr <=", value, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrLike(String value) {
            addCriterion("mchnt_cn_abbr like", value, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrNotLike(String value) {
            addCriterion("mchnt_cn_abbr not like", value, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrIn(List<String> values) {
            addCriterion("mchnt_cn_abbr in", values, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrNotIn(List<String> values) {
            addCriterion("mchnt_cn_abbr not in", values, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrBetween(String value1, String value2) {
            addCriterion("mchnt_cn_abbr between", value1, value2, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntCnAbbrNotBetween(String value1, String value2) {
            addCriterion("mchnt_cn_abbr not between", value1, value2, "mchntCnAbbr");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdIsNull() {
            addCriterion("acq_ins_id_cd is null");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdIsNotNull() {
            addCriterion("acq_ins_id_cd is not null");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdEqualTo(String value) {
            addCriterion("acq_ins_id_cd =", value, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdNotEqualTo(String value) {
            addCriterion("acq_ins_id_cd <>", value, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdGreaterThan(String value) {
            addCriterion("acq_ins_id_cd >", value, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdGreaterThanOrEqualTo(String value) {
            addCriterion("acq_ins_id_cd >=", value, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdLessThan(String value) {
            addCriterion("acq_ins_id_cd <", value, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdLessThanOrEqualTo(String value) {
            addCriterion("acq_ins_id_cd <=", value, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdLike(String value) {
            addCriterion("acq_ins_id_cd like", value, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdNotLike(String value) {
            addCriterion("acq_ins_id_cd not like", value, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdIn(List<String> values) {
            addCriterion("acq_ins_id_cd in", values, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdNotIn(List<String> values) {
            addCriterion("acq_ins_id_cd not in", values, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdBetween(String value1, String value2) {
            addCriterion("acq_ins_id_cd between", value1, value2, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqInsIdCdNotBetween(String value1, String value2) {
            addCriterion("acq_ins_id_cd not between", value1, value2, "acqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdIsNull() {
            addCriterion("acpt_ins_id_cd is null");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdIsNotNull() {
            addCriterion("acpt_ins_id_cd is not null");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdEqualTo(String value) {
            addCriterion("acpt_ins_id_cd =", value, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdNotEqualTo(String value) {
            addCriterion("acpt_ins_id_cd <>", value, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdGreaterThan(String value) {
            addCriterion("acpt_ins_id_cd >", value, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdGreaterThanOrEqualTo(String value) {
            addCriterion("acpt_ins_id_cd >=", value, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdLessThan(String value) {
            addCriterion("acpt_ins_id_cd <", value, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdLessThanOrEqualTo(String value) {
            addCriterion("acpt_ins_id_cd <=", value, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdLike(String value) {
            addCriterion("acpt_ins_id_cd like", value, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdNotLike(String value) {
            addCriterion("acpt_ins_id_cd not like", value, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdIn(List<String> values) {
            addCriterion("acpt_ins_id_cd in", values, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdNotIn(List<String> values) {
            addCriterion("acpt_ins_id_cd not in", values, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdBetween(String value1, String value2) {
            addCriterion("acpt_ins_id_cd between", value1, value2, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcptInsIdCdNotBetween(String value1, String value2) {
            addCriterion("acpt_ins_id_cd not between", value1, value2, "acptInsIdCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdIsNull() {
            addCriterion("acq_region_cd is null");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdIsNotNull() {
            addCriterion("acq_region_cd is not null");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdEqualTo(String value) {
            addCriterion("acq_region_cd =", value, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdNotEqualTo(String value) {
            addCriterion("acq_region_cd <>", value, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdGreaterThan(String value) {
            addCriterion("acq_region_cd >", value, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdGreaterThanOrEqualTo(String value) {
            addCriterion("acq_region_cd >=", value, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdLessThan(String value) {
            addCriterion("acq_region_cd <", value, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdLessThanOrEqualTo(String value) {
            addCriterion("acq_region_cd <=", value, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdLike(String value) {
            addCriterion("acq_region_cd like", value, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdNotLike(String value) {
            addCriterion("acq_region_cd not like", value, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdIn(List<String> values) {
            addCriterion("acq_region_cd in", values, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdNotIn(List<String> values) {
            addCriterion("acq_region_cd not in", values, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdBetween(String value1, String value2) {
            addCriterion("acq_region_cd between", value1, value2, "acqRegionCd");
            return (Criteria) this;
        }

        public Criteria andAcqRegionCdNotBetween(String value1, String value2) {
            addCriterion("acq_region_cd not between", value1, value2, "acqRegionCd");
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

        public Criteria andRegionCdIsNull() {
            addCriterion("region_cd is null");
            return (Criteria) this;
        }

        public Criteria andRegionCdIsNotNull() {
            addCriterion("region_cd is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCdEqualTo(String value) {
            addCriterion("region_cd =", value, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdNotEqualTo(String value) {
            addCriterion("region_cd <>", value, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdGreaterThan(String value) {
            addCriterion("region_cd >", value, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdGreaterThanOrEqualTo(String value) {
            addCriterion("region_cd >=", value, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdLessThan(String value) {
            addCriterion("region_cd <", value, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdLessThanOrEqualTo(String value) {
            addCriterion("region_cd <=", value, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdLike(String value) {
            addCriterion("region_cd like", value, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdNotLike(String value) {
            addCriterion("region_cd not like", value, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdIn(List<String> values) {
            addCriterion("region_cd in", values, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdNotIn(List<String> values) {
            addCriterion("region_cd not in", values, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdBetween(String value1, String value2) {
            addCriterion("region_cd between", value1, value2, "regionCd");
            return (Criteria) this;
        }

        public Criteria andRegionCdNotBetween(String value1, String value2) {
            addCriterion("region_cd not between", value1, value2, "regionCd");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrIsNull() {
            addCriterion("card_accpt_nm_addr is null");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrIsNotNull() {
            addCriterion("card_accpt_nm_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrEqualTo(String value) {
            addCriterion("card_accpt_nm_addr =", value, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrNotEqualTo(String value) {
            addCriterion("card_accpt_nm_addr <>", value, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrGreaterThan(String value) {
            addCriterion("card_accpt_nm_addr >", value, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrGreaterThanOrEqualTo(String value) {
            addCriterion("card_accpt_nm_addr >=", value, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrLessThan(String value) {
            addCriterion("card_accpt_nm_addr <", value, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrLessThanOrEqualTo(String value) {
            addCriterion("card_accpt_nm_addr <=", value, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrLike(String value) {
            addCriterion("card_accpt_nm_addr like", value, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrNotLike(String value) {
            addCriterion("card_accpt_nm_addr not like", value, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrIn(List<String> values) {
            addCriterion("card_accpt_nm_addr in", values, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrNotIn(List<String> values) {
            addCriterion("card_accpt_nm_addr not in", values, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrBetween(String value1, String value2) {
            addCriterion("card_accpt_nm_addr between", value1, value2, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andCardAccptNmAddrNotBetween(String value1, String value2) {
            addCriterion("card_accpt_nm_addr not between", value1, value2, "cardAccptNmAddr");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpIsNull() {
            addCriterion("mchnt_acpt_curr_bmp is null");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpIsNotNull() {
            addCriterion("mchnt_acpt_curr_bmp is not null");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpEqualTo(String value) {
            addCriterion("mchnt_acpt_curr_bmp =", value, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpNotEqualTo(String value) {
            addCriterion("mchnt_acpt_curr_bmp <>", value, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpGreaterThan(String value) {
            addCriterion("mchnt_acpt_curr_bmp >", value, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_acpt_curr_bmp >=", value, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpLessThan(String value) {
            addCriterion("mchnt_acpt_curr_bmp <", value, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpLessThanOrEqualTo(String value) {
            addCriterion("mchnt_acpt_curr_bmp <=", value, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpLike(String value) {
            addCriterion("mchnt_acpt_curr_bmp like", value, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpNotLike(String value) {
            addCriterion("mchnt_acpt_curr_bmp not like", value, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpIn(List<String> values) {
            addCriterion("mchnt_acpt_curr_bmp in", values, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpNotIn(List<String> values) {
            addCriterion("mchnt_acpt_curr_bmp not in", values, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpBetween(String value1, String value2) {
            addCriterion("mchnt_acpt_curr_bmp between", value1, value2, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntAcptCurrBmpNotBetween(String value1, String value2) {
            addCriterion("mchnt_acpt_curr_bmp not between", value1, value2, "mchntAcptCurrBmp");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdIsNull() {
            addCriterion("mchnt_dft_curr_cd is null");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdIsNotNull() {
            addCriterion("mchnt_dft_curr_cd is not null");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdEqualTo(String value) {
            addCriterion("mchnt_dft_curr_cd =", value, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdNotEqualTo(String value) {
            addCriterion("mchnt_dft_curr_cd <>", value, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdGreaterThan(String value) {
            addCriterion("mchnt_dft_curr_cd >", value, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_dft_curr_cd >=", value, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdLessThan(String value) {
            addCriterion("mchnt_dft_curr_cd <", value, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdLessThanOrEqualTo(String value) {
            addCriterion("mchnt_dft_curr_cd <=", value, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdLike(String value) {
            addCriterion("mchnt_dft_curr_cd like", value, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdNotLike(String value) {
            addCriterion("mchnt_dft_curr_cd not like", value, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdIn(List<String> values) {
            addCriterion("mchnt_dft_curr_cd in", values, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdNotIn(List<String> values) {
            addCriterion("mchnt_dft_curr_cd not in", values, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdBetween(String value1, String value2) {
            addCriterion("mchnt_dft_curr_cd between", value1, value2, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andMchntDftCurrCdNotBetween(String value1, String value2) {
            addCriterion("mchnt_dft_curr_cd not between", value1, value2, "mchntDftCurrCd");
            return (Criteria) this;
        }

        public Criteria andTransChnlIsNull() {
            addCriterion("trans_chnl is null");
            return (Criteria) this;
        }

        public Criteria andTransChnlIsNotNull() {
            addCriterion("trans_chnl is not null");
            return (Criteria) this;
        }

        public Criteria andTransChnlEqualTo(String value) {
            addCriterion("trans_chnl =", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlNotEqualTo(String value) {
            addCriterion("trans_chnl <>", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlGreaterThan(String value) {
            addCriterion("trans_chnl >", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlGreaterThanOrEqualTo(String value) {
            addCriterion("trans_chnl >=", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlLessThan(String value) {
            addCriterion("trans_chnl <", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlLessThanOrEqualTo(String value) {
            addCriterion("trans_chnl <=", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlLike(String value) {
            addCriterion("trans_chnl like", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlNotLike(String value) {
            addCriterion("trans_chnl not like", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlIn(List<String> values) {
            addCriterion("trans_chnl in", values, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlNotIn(List<String> values) {
            addCriterion("trans_chnl not in", values, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlBetween(String value1, String value2) {
            addCriterion("trans_chnl between", value1, value2, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlNotBetween(String value1, String value2) {
            addCriterion("trans_chnl not between", value1, value2, "transChnl");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInIsNull() {
            addCriterion("direct_acq_settle_in is null");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInIsNotNull() {
            addCriterion("direct_acq_settle_in is not null");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInEqualTo(Boolean value) {
            addCriterion("direct_acq_settle_in =", value, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInNotEqualTo(Boolean value) {
            addCriterion("direct_acq_settle_in <>", value, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInGreaterThan(Boolean value) {
            addCriterion("direct_acq_settle_in >", value, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInGreaterThanOrEqualTo(Boolean value) {
            addCriterion("direct_acq_settle_in >=", value, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInLessThan(Boolean value) {
            addCriterion("direct_acq_settle_in <", value, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInLessThanOrEqualTo(Boolean value) {
            addCriterion("direct_acq_settle_in <=", value, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInIn(List<Boolean> values) {
            addCriterion("direct_acq_settle_in in", values, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInNotIn(List<Boolean> values) {
            addCriterion("direct_acq_settle_in not in", values, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInBetween(Boolean value1, Boolean value2) {
            addCriterion("direct_acq_settle_in between", value1, value2, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andDirectAcqSettleInNotBetween(Boolean value1, Boolean value2) {
            addCriterion("direct_acq_settle_in not between", value1, value2, "directAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleIsNull() {
            addCriterion("mcc_appl_rule is null");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleIsNotNull() {
            addCriterion("mcc_appl_rule is not null");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleEqualTo(Boolean value) {
            addCriterion("mcc_appl_rule =", value, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleNotEqualTo(Boolean value) {
            addCriterion("mcc_appl_rule <>", value, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleGreaterThan(Boolean value) {
            addCriterion("mcc_appl_rule >", value, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mcc_appl_rule >=", value, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleLessThan(Boolean value) {
            addCriterion("mcc_appl_rule <", value, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleLessThanOrEqualTo(Boolean value) {
            addCriterion("mcc_appl_rule <=", value, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleIn(List<Boolean> values) {
            addCriterion("mcc_appl_rule in", values, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleNotIn(List<Boolean> values) {
            addCriterion("mcc_appl_rule not in", values, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleBetween(Boolean value1, Boolean value2) {
            addCriterion("mcc_appl_rule between", value1, value2, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andMccApplRuleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mcc_appl_rule not between", value1, value2, "mccApplRule");
            return (Criteria) this;
        }

        public Criteria andIndustryTpIsNull() {
            addCriterion("industry_tp is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTpIsNotNull() {
            addCriterion("industry_tp is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTpEqualTo(String value) {
            addCriterion("industry_tp =", value, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpNotEqualTo(String value) {
            addCriterion("industry_tp <>", value, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpGreaterThan(String value) {
            addCriterion("industry_tp >", value, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpGreaterThanOrEqualTo(String value) {
            addCriterion("industry_tp >=", value, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpLessThan(String value) {
            addCriterion("industry_tp <", value, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpLessThanOrEqualTo(String value) {
            addCriterion("industry_tp <=", value, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpLike(String value) {
            addCriterion("industry_tp like", value, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpNotLike(String value) {
            addCriterion("industry_tp not like", value, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpIn(List<String> values) {
            addCriterion("industry_tp in", values, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpNotIn(List<String> values) {
            addCriterion("industry_tp not in", values, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpBetween(String value1, String value2) {
            addCriterion("industry_tp between", value1, value2, "industryTp");
            return (Criteria) this;
        }

        public Criteria andIndustryTpNotBetween(String value1, String value2) {
            addCriterion("industry_tp not between", value1, value2, "industryTp");
            return (Criteria) this;
        }

        public Criteria andMisMchntInIsNull() {
            addCriterion("mis_mchnt_in is null");
            return (Criteria) this;
        }

        public Criteria andMisMchntInIsNotNull() {
            addCriterion("mis_mchnt_in is not null");
            return (Criteria) this;
        }

        public Criteria andMisMchntInEqualTo(Boolean value) {
            addCriterion("mis_mchnt_in =", value, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInNotEqualTo(Boolean value) {
            addCriterion("mis_mchnt_in <>", value, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInGreaterThan(Boolean value) {
            addCriterion("mis_mchnt_in >", value, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mis_mchnt_in >=", value, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInLessThan(Boolean value) {
            addCriterion("mis_mchnt_in <", value, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInLessThanOrEqualTo(Boolean value) {
            addCriterion("mis_mchnt_in <=", value, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInIn(List<Boolean> values) {
            addCriterion("mis_mchnt_in in", values, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInNotIn(List<Boolean> values) {
            addCriterion("mis_mchnt_in not in", values, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInBetween(Boolean value1, Boolean value2) {
            addCriterion("mis_mchnt_in between", value1, value2, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andMisMchntInNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mis_mchnt_in not between", value1, value2, "misMchntIn");
            return (Criteria) this;
        }

        public Criteria andLicNoIsNull() {
            addCriterion("lic_no is null");
            return (Criteria) this;
        }

        public Criteria andLicNoIsNotNull() {
            addCriterion("lic_no is not null");
            return (Criteria) this;
        }

        public Criteria andLicNoEqualTo(String value) {
            addCriterion("lic_no =", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoNotEqualTo(String value) {
            addCriterion("lic_no <>", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoGreaterThan(String value) {
            addCriterion("lic_no >", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoGreaterThanOrEqualTo(String value) {
            addCriterion("lic_no >=", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoLessThan(String value) {
            addCriterion("lic_no <", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoLessThanOrEqualTo(String value) {
            addCriterion("lic_no <=", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoLike(String value) {
            addCriterion("lic_no like", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoNotLike(String value) {
            addCriterion("lic_no not like", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoIn(List<String> values) {
            addCriterion("lic_no in", values, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoNotIn(List<String> values) {
            addCriterion("lic_no not in", values, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoBetween(String value1, String value2) {
            addCriterion("lic_no between", value1, value2, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoNotBetween(String value1, String value2) {
            addCriterion("lic_no not between", value1, value2, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtIsNull() {
            addCriterion("lic_expire_dt is null");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtIsNotNull() {
            addCriterion("lic_expire_dt is not null");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtEqualTo(String value) {
            addCriterion("lic_expire_dt =", value, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtNotEqualTo(String value) {
            addCriterion("lic_expire_dt <>", value, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtGreaterThan(String value) {
            addCriterion("lic_expire_dt >", value, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtGreaterThanOrEqualTo(String value) {
            addCriterion("lic_expire_dt >=", value, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtLessThan(String value) {
            addCriterion("lic_expire_dt <", value, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtLessThanOrEqualTo(String value) {
            addCriterion("lic_expire_dt <=", value, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtLike(String value) {
            addCriterion("lic_expire_dt like", value, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtNotLike(String value) {
            addCriterion("lic_expire_dt not like", value, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtIn(List<String> values) {
            addCriterion("lic_expire_dt in", values, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtNotIn(List<String> values) {
            addCriterion("lic_expire_dt not in", values, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtBetween(String value1, String value2) {
            addCriterion("lic_expire_dt between", value1, value2, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andLicExpireDtNotBetween(String value1, String value2) {
            addCriterion("lic_expire_dt not between", value1, value2, "licExpireDt");
            return (Criteria) this;
        }

        public Criteria andRegAddrIsNull() {
            addCriterion("reg_addr is null");
            return (Criteria) this;
        }

        public Criteria andRegAddrIsNotNull() {
            addCriterion("reg_addr is not null");
            return (Criteria) this;
        }

        public Criteria andRegAddrEqualTo(String value) {
            addCriterion("reg_addr =", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrNotEqualTo(String value) {
            addCriterion("reg_addr <>", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrGreaterThan(String value) {
            addCriterion("reg_addr >", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrGreaterThanOrEqualTo(String value) {
            addCriterion("reg_addr >=", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrLessThan(String value) {
            addCriterion("reg_addr <", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrLessThanOrEqualTo(String value) {
            addCriterion("reg_addr <=", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrLike(String value) {
            addCriterion("reg_addr like", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrNotLike(String value) {
            addCriterion("reg_addr not like", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrIn(List<String> values) {
            addCriterion("reg_addr in", values, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrNotIn(List<String> values) {
            addCriterion("reg_addr not in", values, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrBetween(String value1, String value2) {
            addCriterion("reg_addr between", value1, value2, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrNotBetween(String value1, String value2) {
            addCriterion("reg_addr not between", value1, value2, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegCapIsNull() {
            addCriterion("reg_cap is null");
            return (Criteria) this;
        }

        public Criteria andRegCapIsNotNull() {
            addCriterion("reg_cap is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapEqualTo(Integer value) {
            addCriterion("reg_cap =", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapNotEqualTo(Integer value) {
            addCriterion("reg_cap <>", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapGreaterThan(Integer value) {
            addCriterion("reg_cap >", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_cap >=", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapLessThan(Integer value) {
            addCriterion("reg_cap <", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapLessThanOrEqualTo(Integer value) {
            addCriterion("reg_cap <=", value, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapIn(List<Integer> values) {
            addCriterion("reg_cap in", values, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapNotIn(List<Integer> values) {
            addCriterion("reg_cap not in", values, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapBetween(Integer value1, Integer value2) {
            addCriterion("reg_cap between", value1, value2, "regCap");
            return (Criteria) this;
        }

        public Criteria andRegCapNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_cap not between", value1, value2, "regCap");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpIsNull() {
            addCriterion("spec_disc_tp is null");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpIsNotNull() {
            addCriterion("spec_disc_tp is not null");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpEqualTo(String value) {
            addCriterion("spec_disc_tp =", value, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpNotEqualTo(String value) {
            addCriterion("spec_disc_tp <>", value, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpGreaterThan(String value) {
            addCriterion("spec_disc_tp >", value, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpGreaterThanOrEqualTo(String value) {
            addCriterion("spec_disc_tp >=", value, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpLessThan(String value) {
            addCriterion("spec_disc_tp <", value, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpLessThanOrEqualTo(String value) {
            addCriterion("spec_disc_tp <=", value, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpLike(String value) {
            addCriterion("spec_disc_tp like", value, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpNotLike(String value) {
            addCriterion("spec_disc_tp not like", value, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpIn(List<String> values) {
            addCriterion("spec_disc_tp in", values, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpNotIn(List<String> values) {
            addCriterion("spec_disc_tp not in", values, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpBetween(String value1, String value2) {
            addCriterion("spec_disc_tp between", value1, value2, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscTpNotBetween(String value1, String value2) {
            addCriterion("spec_disc_tp not between", value1, value2, "specDiscTp");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlIsNull() {
            addCriterion("spec_disc_lvl is null");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlIsNotNull() {
            addCriterion("spec_disc_lvl is not null");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlEqualTo(String value) {
            addCriterion("spec_disc_lvl =", value, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlNotEqualTo(String value) {
            addCriterion("spec_disc_lvl <>", value, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlGreaterThan(String value) {
            addCriterion("spec_disc_lvl >", value, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlGreaterThanOrEqualTo(String value) {
            addCriterion("spec_disc_lvl >=", value, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlLessThan(String value) {
            addCriterion("spec_disc_lvl <", value, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlLessThanOrEqualTo(String value) {
            addCriterion("spec_disc_lvl <=", value, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlLike(String value) {
            addCriterion("spec_disc_lvl like", value, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlNotLike(String value) {
            addCriterion("spec_disc_lvl not like", value, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlIn(List<String> values) {
            addCriterion("spec_disc_lvl in", values, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlNotIn(List<String> values) {
            addCriterion("spec_disc_lvl not in", values, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlBetween(String value1, String value2) {
            addCriterion("spec_disc_lvl between", value1, value2, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andSpecDiscLvlNotBetween(String value1, String value2) {
            addCriterion("spec_disc_lvl not between", value1, value2, "specDiscLvl");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtIsNull() {
            addCriterion("mchnt_open_dt is null");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtIsNotNull() {
            addCriterion("mchnt_open_dt is not null");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtEqualTo(Date value) {
            addCriterion("mchnt_open_dt =", value, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtNotEqualTo(Date value) {
            addCriterion("mchnt_open_dt <>", value, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtGreaterThan(Date value) {
            addCriterion("mchnt_open_dt >", value, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtGreaterThanOrEqualTo(Date value) {
            addCriterion("mchnt_open_dt >=", value, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtLessThan(Date value) {
            addCriterion("mchnt_open_dt <", value, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtLessThanOrEqualTo(Date value) {
            addCriterion("mchnt_open_dt <=", value, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtIn(List<Date> values) {
            addCriterion("mchnt_open_dt in", values, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtNotIn(List<Date> values) {
            addCriterion("mchnt_open_dt not in", values, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtBetween(Date value1, Date value2) {
            addCriterion("mchnt_open_dt between", value1, value2, "mchntOpenDt");
            return (Criteria) this;
        }

        public Criteria andMchntOpenDtNotBetween(Date value1, Date value2) {
            addCriterion("mchnt_open_dt not between", value1, value2, "mchntOpenDt");
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