package com.unionpay.boot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AndroidCollectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AndroidCollectInfoExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImsiIsNull() {
            addCriterion("imsi is null");
            return (Criteria) this;
        }

        public Criteria andImsiIsNotNull() {
            addCriterion("imsi is not null");
            return (Criteria) this;
        }

        public Criteria andImsiEqualTo(String value) {
            addCriterion("imsi =", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotEqualTo(String value) {
            addCriterion("imsi <>", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThan(String value) {
            addCriterion("imsi >", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiGreaterThanOrEqualTo(String value) {
            addCriterion("imsi >=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThan(String value) {
            addCriterion("imsi <", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLessThanOrEqualTo(String value) {
            addCriterion("imsi <=", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiLike(String value) {
            addCriterion("imsi like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotLike(String value) {
            addCriterion("imsi not like", value, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiIn(List<String> values) {
            addCriterion("imsi in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotIn(List<String> values) {
            addCriterion("imsi not in", values, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiBetween(String value1, String value2) {
            addCriterion("imsi between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andImsiNotBetween(String value1, String value2) {
            addCriterion("imsi not between", value1, value2, "imsi");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressIsNull() {
            addCriterion("wifiMacAddress is null");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressIsNotNull() {
            addCriterion("wifiMacAddress is not null");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressEqualTo(String value) {
            addCriterion("wifiMacAddress =", value, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressNotEqualTo(String value) {
            addCriterion("wifiMacAddress <>", value, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressGreaterThan(String value) {
            addCriterion("wifiMacAddress >", value, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressGreaterThanOrEqualTo(String value) {
            addCriterion("wifiMacAddress >=", value, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressLessThan(String value) {
            addCriterion("wifiMacAddress <", value, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressLessThanOrEqualTo(String value) {
            addCriterion("wifiMacAddress <=", value, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressLike(String value) {
            addCriterion("wifiMacAddress like", value, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressNotLike(String value) {
            addCriterion("wifiMacAddress not like", value, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressIn(List<String> values) {
            addCriterion("wifiMacAddress in", values, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressNotIn(List<String> values) {
            addCriterion("wifiMacAddress not in", values, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressBetween(String value1, String value2) {
            addCriterion("wifiMacAddress between", value1, value2, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andWifimacaddressNotBetween(String value1, String value2) {
            addCriterion("wifiMacAddress not between", value1, value2, "wifimacaddress");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNull() {
            addCriterion("serialNumber is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIsNotNull() {
            addCriterion("serialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberEqualTo(String value) {
            addCriterion("serialNumber =", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotEqualTo(String value) {
            addCriterion("serialNumber <>", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThan(String value) {
            addCriterion("serialNumber >", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("serialNumber >=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThan(String value) {
            addCriterion("serialNumber <", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLessThanOrEqualTo(String value) {
            addCriterion("serialNumber <=", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberLike(String value) {
            addCriterion("serialNumber like", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotLike(String value) {
            addCriterion("serialNumber not like", value, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberIn(List<String> values) {
            addCriterion("serialNumber in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotIn(List<String> values) {
            addCriterion("serialNumber not in", values, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberBetween(String value1, String value2) {
            addCriterion("serialNumber between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andSerialnumberNotBetween(String value1, String value2) {
            addCriterion("serialNumber not between", value1, value2, "serialnumber");
            return (Criteria) this;
        }

        public Criteria andUdidIsNull() {
            addCriterion("udid is null");
            return (Criteria) this;
        }

        public Criteria andUdidIsNotNull() {
            addCriterion("udid is not null");
            return (Criteria) this;
        }

        public Criteria andUdidEqualTo(String value) {
            addCriterion("udid =", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotEqualTo(String value) {
            addCriterion("udid <>", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidGreaterThan(String value) {
            addCriterion("udid >", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidGreaterThanOrEqualTo(String value) {
            addCriterion("udid >=", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLessThan(String value) {
            addCriterion("udid <", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLessThanOrEqualTo(String value) {
            addCriterion("udid <=", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLike(String value) {
            addCriterion("udid like", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotLike(String value) {
            addCriterion("udid not like", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidIn(List<String> values) {
            addCriterion("udid in", values, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotIn(List<String> values) {
            addCriterion("udid not in", values, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidBetween(String value1, String value2) {
            addCriterion("udid between", value1, value2, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotBetween(String value1, String value2) {
            addCriterion("udid not between", value1, value2, "udid");
            return (Criteria) this;
        }

        public Criteria andRootIsNull() {
            addCriterion("root is null");
            return (Criteria) this;
        }

        public Criteria andRootIsNotNull() {
            addCriterion("root is not null");
            return (Criteria) this;
        }

        public Criteria andRootEqualTo(Boolean value) {
            addCriterion("root =", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotEqualTo(Boolean value) {
            addCriterion("root <>", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootGreaterThan(Boolean value) {
            addCriterion("root >", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootGreaterThanOrEqualTo(Boolean value) {
            addCriterion("root >=", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLessThan(Boolean value) {
            addCriterion("root <", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLessThanOrEqualTo(Boolean value) {
            addCriterion("root <=", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootIn(List<Boolean> values) {
            addCriterion("root in", values, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotIn(List<Boolean> values) {
            addCriterion("root not in", values, "root");
            return (Criteria) this;
        }

        public Criteria andRootBetween(Boolean value1, Boolean value2) {
            addCriterion("root between", value1, value2, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotBetween(Boolean value1, Boolean value2) {
            addCriterion("root not between", value1, value2, "root");
            return (Criteria) this;
        }

        public Criteria andTouchscreenIsNull() {
            addCriterion("touchScreen is null");
            return (Criteria) this;
        }

        public Criteria andTouchscreenIsNotNull() {
            addCriterion("touchScreen is not null");
            return (Criteria) this;
        }

        public Criteria andTouchscreenEqualTo(Boolean value) {
            addCriterion("touchScreen =", value, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenNotEqualTo(Boolean value) {
            addCriterion("touchScreen <>", value, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenGreaterThan(Boolean value) {
            addCriterion("touchScreen >", value, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("touchScreen >=", value, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenLessThan(Boolean value) {
            addCriterion("touchScreen <", value, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenLessThanOrEqualTo(Boolean value) {
            addCriterion("touchScreen <=", value, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenIn(List<Boolean> values) {
            addCriterion("touchScreen in", values, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenNotIn(List<Boolean> values) {
            addCriterion("touchScreen not in", values, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenBetween(Boolean value1, Boolean value2) {
            addCriterion("touchScreen between", value1, value2, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andTouchscreenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("touchScreen not between", value1, value2, "touchscreen");
            return (Criteria) this;
        }

        public Criteria andScreensizeIsNull() {
            addCriterion("screenSize is null");
            return (Criteria) this;
        }

        public Criteria andScreensizeIsNotNull() {
            addCriterion("screenSize is not null");
            return (Criteria) this;
        }

        public Criteria andScreensizeEqualTo(String value) {
            addCriterion("screenSize =", value, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeNotEqualTo(String value) {
            addCriterion("screenSize <>", value, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeGreaterThan(String value) {
            addCriterion("screenSize >", value, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeGreaterThanOrEqualTo(String value) {
            addCriterion("screenSize >=", value, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeLessThan(String value) {
            addCriterion("screenSize <", value, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeLessThanOrEqualTo(String value) {
            addCriterion("screenSize <=", value, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeLike(String value) {
            addCriterion("screenSize like", value, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeNotLike(String value) {
            addCriterion("screenSize not like", value, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeIn(List<String> values) {
            addCriterion("screenSize in", values, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeNotIn(List<String> values) {
            addCriterion("screenSize not in", values, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeBetween(String value1, String value2) {
            addCriterion("screenSize between", value1, value2, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreensizeNotBetween(String value1, String value2) {
            addCriterion("screenSize not between", value1, value2, "screensize");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionIsNull() {
            addCriterion("screenResolution is null");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionIsNotNull() {
            addCriterion("screenResolution is not null");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionEqualTo(String value) {
            addCriterion("screenResolution =", value, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionNotEqualTo(String value) {
            addCriterion("screenResolution <>", value, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionGreaterThan(String value) {
            addCriterion("screenResolution >", value, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionGreaterThanOrEqualTo(String value) {
            addCriterion("screenResolution >=", value, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionLessThan(String value) {
            addCriterion("screenResolution <", value, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionLessThanOrEqualTo(String value) {
            addCriterion("screenResolution <=", value, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionLike(String value) {
            addCriterion("screenResolution like", value, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionNotLike(String value) {
            addCriterion("screenResolution not like", value, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionIn(List<String> values) {
            addCriterion("screenResolution in", values, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionNotIn(List<String> values) {
            addCriterion("screenResolution not in", values, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionBetween(String value1, String value2) {
            addCriterion("screenResolution between", value1, value2, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andScreenresolutionNotBetween(String value1, String value2) {
            addCriterion("screenResolution not between", value1, value2, "screenresolution");
            return (Criteria) this;
        }

        public Criteria andDeviceversionIsNull() {
            addCriterion("deviceVersion is null");
            return (Criteria) this;
        }

        public Criteria andDeviceversionIsNotNull() {
            addCriterion("deviceVersion is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceversionEqualTo(String value) {
            addCriterion("deviceVersion =", value, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionNotEqualTo(String value) {
            addCriterion("deviceVersion <>", value, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionGreaterThan(String value) {
            addCriterion("deviceVersion >", value, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionGreaterThanOrEqualTo(String value) {
            addCriterion("deviceVersion >=", value, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionLessThan(String value) {
            addCriterion("deviceVersion <", value, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionLessThanOrEqualTo(String value) {
            addCriterion("deviceVersion <=", value, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionLike(String value) {
            addCriterion("deviceVersion like", value, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionNotLike(String value) {
            addCriterion("deviceVersion not like", value, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionIn(List<String> values) {
            addCriterion("deviceVersion in", values, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionNotIn(List<String> values) {
            addCriterion("deviceVersion not in", values, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionBetween(String value1, String value2) {
            addCriterion("deviceVersion between", value1, value2, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDeviceversionNotBetween(String value1, String value2) {
            addCriterion("deviceVersion not between", value1, value2, "deviceversion");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNull() {
            addCriterion("deviceName is null");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNotNull() {
            addCriterion("deviceName is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenameEqualTo(String value) {
            addCriterion("deviceName =", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotEqualTo(String value) {
            addCriterion("deviceName <>", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThan(String value) {
            addCriterion("deviceName >", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("deviceName >=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThan(String value) {
            addCriterion("deviceName <", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThanOrEqualTo(String value) {
            addCriterion("deviceName <=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLike(String value) {
            addCriterion("deviceName like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotLike(String value) {
            addCriterion("deviceName not like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameIn(List<String> values) {
            addCriterion("deviceName in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotIn(List<String> values) {
            addCriterion("deviceName not in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameBetween(String value1, String value2) {
            addCriterion("deviceName between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotBetween(String value1, String value2) {
            addCriterion("deviceName not between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNull() {
            addCriterion("osType is null");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNotNull() {
            addCriterion("osType is not null");
            return (Criteria) this;
        }

        public Criteria andOstypeEqualTo(String value) {
            addCriterion("osType =", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotEqualTo(String value) {
            addCriterion("osType <>", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThan(String value) {
            addCriterion("osType >", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThanOrEqualTo(String value) {
            addCriterion("osType >=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThan(String value) {
            addCriterion("osType <", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThanOrEqualTo(String value) {
            addCriterion("osType <=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLike(String value) {
            addCriterion("osType like", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotLike(String value) {
            addCriterion("osType not like", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeIn(List<String> values) {
            addCriterion("osType in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotIn(List<String> values) {
            addCriterion("osType not in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeBetween(String value1, String value2) {
            addCriterion("osType between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotBetween(String value1, String value2) {
            addCriterion("osType not between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andOsversionIsNull() {
            addCriterion("osVersion is null");
            return (Criteria) this;
        }

        public Criteria andOsversionIsNotNull() {
            addCriterion("osVersion is not null");
            return (Criteria) this;
        }

        public Criteria andOsversionEqualTo(String value) {
            addCriterion("osVersion =", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotEqualTo(String value) {
            addCriterion("osVersion <>", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionGreaterThan(String value) {
            addCriterion("osVersion >", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionGreaterThanOrEqualTo(String value) {
            addCriterion("osVersion >=", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLessThan(String value) {
            addCriterion("osVersion <", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLessThanOrEqualTo(String value) {
            addCriterion("osVersion <=", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionLike(String value) {
            addCriterion("osVersion like", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotLike(String value) {
            addCriterion("osVersion not like", value, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionIn(List<String> values) {
            addCriterion("osVersion in", values, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotIn(List<String> values) {
            addCriterion("osVersion not in", values, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionBetween(String value1, String value2) {
            addCriterion("osVersion between", value1, value2, "osversion");
            return (Criteria) this;
        }

        public Criteria andOsversionNotBetween(String value1, String value2) {
            addCriterion("osVersion not between", value1, value2, "osversion");
            return (Criteria) this;
        }

        public Criteria andOslanguageIsNull() {
            addCriterion("osLanguage is null");
            return (Criteria) this;
        }

        public Criteria andOslanguageIsNotNull() {
            addCriterion("osLanguage is not null");
            return (Criteria) this;
        }

        public Criteria andOslanguageEqualTo(String value) {
            addCriterion("osLanguage =", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageNotEqualTo(String value) {
            addCriterion("osLanguage <>", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageGreaterThan(String value) {
            addCriterion("osLanguage >", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageGreaterThanOrEqualTo(String value) {
            addCriterion("osLanguage >=", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageLessThan(String value) {
            addCriterion("osLanguage <", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageLessThanOrEqualTo(String value) {
            addCriterion("osLanguage <=", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageLike(String value) {
            addCriterion("osLanguage like", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageNotLike(String value) {
            addCriterion("osLanguage not like", value, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageIn(List<String> values) {
            addCriterion("osLanguage in", values, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageNotIn(List<String> values) {
            addCriterion("osLanguage not in", values, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageBetween(String value1, String value2) {
            addCriterion("osLanguage between", value1, value2, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andOslanguageNotBetween(String value1, String value2) {
            addCriterion("osLanguage not between", value1, value2, "oslanguage");
            return (Criteria) this;
        }

        public Criteria andAppnumberIsNull() {
            addCriterion("appNumber is null");
            return (Criteria) this;
        }

        public Criteria andAppnumberIsNotNull() {
            addCriterion("appNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAppnumberEqualTo(String value) {
            addCriterion("appNumber =", value, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberNotEqualTo(String value) {
            addCriterion("appNumber <>", value, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberGreaterThan(String value) {
            addCriterion("appNumber >", value, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberGreaterThanOrEqualTo(String value) {
            addCriterion("appNumber >=", value, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberLessThan(String value) {
            addCriterion("appNumber <", value, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberLessThanOrEqualTo(String value) {
            addCriterion("appNumber <=", value, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberLike(String value) {
            addCriterion("appNumber like", value, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberNotLike(String value) {
            addCriterion("appNumber not like", value, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberIn(List<String> values) {
            addCriterion("appNumber in", values, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberNotIn(List<String> values) {
            addCriterion("appNumber not in", values, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberBetween(String value1, String value2) {
            addCriterion("appNumber between", value1, value2, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppnumberNotBetween(String value1, String value2) {
            addCriterion("appNumber not between", value1, value2, "appnumber");
            return (Criteria) this;
        }

        public Criteria andAppvversionIsNull() {
            addCriterion("appVversion is null");
            return (Criteria) this;
        }

        public Criteria andAppvversionIsNotNull() {
            addCriterion("appVversion is not null");
            return (Criteria) this;
        }

        public Criteria andAppvversionEqualTo(String value) {
            addCriterion("appVversion =", value, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionNotEqualTo(String value) {
            addCriterion("appVversion <>", value, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionGreaterThan(String value) {
            addCriterion("appVversion >", value, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionGreaterThanOrEqualTo(String value) {
            addCriterion("appVversion >=", value, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionLessThan(String value) {
            addCriterion("appVversion <", value, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionLessThanOrEqualTo(String value) {
            addCriterion("appVversion <=", value, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionLike(String value) {
            addCriterion("appVversion like", value, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionNotLike(String value) {
            addCriterion("appVversion not like", value, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionIn(List<String> values) {
            addCriterion("appVversion in", values, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionNotIn(List<String> values) {
            addCriterion("appVversion not in", values, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionBetween(String value1, String value2) {
            addCriterion("appVversion between", value1, value2, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppvversionNotBetween(String value1, String value2) {
            addCriterion("appVversion not between", value1, value2, "appvversion");
            return (Criteria) this;
        }

        public Criteria andAppchannelIsNull() {
            addCriterion("appChannel is null");
            return (Criteria) this;
        }

        public Criteria andAppchannelIsNotNull() {
            addCriterion("appChannel is not null");
            return (Criteria) this;
        }

        public Criteria andAppchannelEqualTo(String value) {
            addCriterion("appChannel =", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelNotEqualTo(String value) {
            addCriterion("appChannel <>", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelGreaterThan(String value) {
            addCriterion("appChannel >", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelGreaterThanOrEqualTo(String value) {
            addCriterion("appChannel >=", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelLessThan(String value) {
            addCriterion("appChannel <", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelLessThanOrEqualTo(String value) {
            addCriterion("appChannel <=", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelLike(String value) {
            addCriterion("appChannel like", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelNotLike(String value) {
            addCriterion("appChannel not like", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelIn(List<String> values) {
            addCriterion("appChannel in", values, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelNotIn(List<String> values) {
            addCriterion("appChannel not in", values, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelBetween(String value1, String value2) {
            addCriterion("appChannel between", value1, value2, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelNotBetween(String value1, String value2) {
            addCriterion("appChannel not between", value1, value2, "appchannel");
            return (Criteria) this;
        }

        public Criteria andSdkversionIsNull() {
            addCriterion("sdkVersion is null");
            return (Criteria) this;
        }

        public Criteria andSdkversionIsNotNull() {
            addCriterion("sdkVersion is not null");
            return (Criteria) this;
        }

        public Criteria andSdkversionEqualTo(String value) {
            addCriterion("sdkVersion =", value, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionNotEqualTo(String value) {
            addCriterion("sdkVersion <>", value, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionGreaterThan(String value) {
            addCriterion("sdkVersion >", value, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionGreaterThanOrEqualTo(String value) {
            addCriterion("sdkVersion >=", value, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionLessThan(String value) {
            addCriterion("sdkVersion <", value, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionLessThanOrEqualTo(String value) {
            addCriterion("sdkVersion <=", value, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionLike(String value) {
            addCriterion("sdkVersion like", value, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionNotLike(String value) {
            addCriterion("sdkVersion not like", value, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionIn(List<String> values) {
            addCriterion("sdkVersion in", values, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionNotIn(List<String> values) {
            addCriterion("sdkVersion not in", values, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionBetween(String value1, String value2) {
            addCriterion("sdkVersion between", value1, value2, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andSdkversionNotBetween(String value1, String value2) {
            addCriterion("sdkVersion not between", value1, value2, "sdkversion");
            return (Criteria) this;
        }

        public Criteria andUsedstorageIsNull() {
            addCriterion("usedStorage is null");
            return (Criteria) this;
        }

        public Criteria andUsedstorageIsNotNull() {
            addCriterion("usedStorage is not null");
            return (Criteria) this;
        }

        public Criteria andUsedstorageEqualTo(String value) {
            addCriterion("usedStorage =", value, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageNotEqualTo(String value) {
            addCriterion("usedStorage <>", value, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageGreaterThan(String value) {
            addCriterion("usedStorage >", value, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageGreaterThanOrEqualTo(String value) {
            addCriterion("usedStorage >=", value, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageLessThan(String value) {
            addCriterion("usedStorage <", value, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageLessThanOrEqualTo(String value) {
            addCriterion("usedStorage <=", value, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageLike(String value) {
            addCriterion("usedStorage like", value, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageNotLike(String value) {
            addCriterion("usedStorage not like", value, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageIn(List<String> values) {
            addCriterion("usedStorage in", values, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageNotIn(List<String> values) {
            addCriterion("usedStorage not in", values, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageBetween(String value1, String value2) {
            addCriterion("usedStorage between", value1, value2, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andUsedstorageNotBetween(String value1, String value2) {
            addCriterion("usedStorage not between", value1, value2, "usedstorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageIsNull() {
            addCriterion("availableStorage is null");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageIsNotNull() {
            addCriterion("availableStorage is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageEqualTo(String value) {
            addCriterion("availableStorage =", value, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageNotEqualTo(String value) {
            addCriterion("availableStorage <>", value, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageGreaterThan(String value) {
            addCriterion("availableStorage >", value, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageGreaterThanOrEqualTo(String value) {
            addCriterion("availableStorage >=", value, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageLessThan(String value) {
            addCriterion("availableStorage <", value, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageLessThanOrEqualTo(String value) {
            addCriterion("availableStorage <=", value, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageLike(String value) {
            addCriterion("availableStorage like", value, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageNotLike(String value) {
            addCriterion("availableStorage not like", value, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageIn(List<String> values) {
            addCriterion("availableStorage in", values, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageNotIn(List<String> values) {
            addCriterion("availableStorage not in", values, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageBetween(String value1, String value2) {
            addCriterion("availableStorage between", value1, value2, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andAvailablestorageNotBetween(String value1, String value2) {
            addCriterion("availableStorage not between", value1, value2, "availablestorage");
            return (Criteria) this;
        }

        public Criteria andBatterylevelIsNull() {
            addCriterion("batteryLevel is null");
            return (Criteria) this;
        }

        public Criteria andBatterylevelIsNotNull() {
            addCriterion("batteryLevel is not null");
            return (Criteria) this;
        }

        public Criteria andBatterylevelEqualTo(String value) {
            addCriterion("batteryLevel =", value, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelNotEqualTo(String value) {
            addCriterion("batteryLevel <>", value, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelGreaterThan(String value) {
            addCriterion("batteryLevel >", value, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelGreaterThanOrEqualTo(String value) {
            addCriterion("batteryLevel >=", value, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelLessThan(String value) {
            addCriterion("batteryLevel <", value, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelLessThanOrEqualTo(String value) {
            addCriterion("batteryLevel <=", value, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelLike(String value) {
            addCriterion("batteryLevel like", value, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelNotLike(String value) {
            addCriterion("batteryLevel not like", value, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelIn(List<String> values) {
            addCriterion("batteryLevel in", values, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelNotIn(List<String> values) {
            addCriterion("batteryLevel not in", values, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelBetween(String value1, String value2) {
            addCriterion("batteryLevel between", value1, value2, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBatterylevelNotBetween(String value1, String value2) {
            addCriterion("batteryLevel not between", value1, value2, "batterylevel");
            return (Criteria) this;
        }

        public Criteria andBasebandversionIsNull() {
            addCriterion("basebandVersion is null");
            return (Criteria) this;
        }

        public Criteria andBasebandversionIsNotNull() {
            addCriterion("basebandVersion is not null");
            return (Criteria) this;
        }

        public Criteria andBasebandversionEqualTo(String value) {
            addCriterion("basebandVersion =", value, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionNotEqualTo(String value) {
            addCriterion("basebandVersion <>", value, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionGreaterThan(String value) {
            addCriterion("basebandVersion >", value, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionGreaterThanOrEqualTo(String value) {
            addCriterion("basebandVersion >=", value, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionLessThan(String value) {
            addCriterion("basebandVersion <", value, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionLessThanOrEqualTo(String value) {
            addCriterion("basebandVersion <=", value, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionLike(String value) {
            addCriterion("basebandVersion like", value, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionNotLike(String value) {
            addCriterion("basebandVersion not like", value, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionIn(List<String> values) {
            addCriterion("basebandVersion in", values, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionNotIn(List<String> values) {
            addCriterion("basebandVersion not in", values, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionBetween(String value1, String value2) {
            addCriterion("basebandVersion between", value1, value2, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andBasebandversionNotBetween(String value1, String value2) {
            addCriterion("basebandVersion not between", value1, value2, "basebandversion");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNull() {
            addCriterion("timeZone is null");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNotNull() {
            addCriterion("timeZone is not null");
            return (Criteria) this;
        }

        public Criteria andTimezoneEqualTo(String value) {
            addCriterion("timeZone =", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotEqualTo(String value) {
            addCriterion("timeZone <>", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThan(String value) {
            addCriterion("timeZone >", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("timeZone >=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThan(String value) {
            addCriterion("timeZone <", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThanOrEqualTo(String value) {
            addCriterion("timeZone <=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLike(String value) {
            addCriterion("timeZone like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotLike(String value) {
            addCriterion("timeZone not like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneIn(List<String> values) {
            addCriterion("timeZone in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotIn(List<String> values) {
            addCriterion("timeZone not in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneBetween(String value1, String value2) {
            addCriterion("timeZone between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotBetween(String value1, String value2) {
            addCriterion("timeZone not between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierIsNull() {
            addCriterion("mobileSupplier is null");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierIsNotNull() {
            addCriterion("mobileSupplier is not null");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierEqualTo(String value) {
            addCriterion("mobileSupplier =", value, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierNotEqualTo(String value) {
            addCriterion("mobileSupplier <>", value, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierGreaterThan(String value) {
            addCriterion("mobileSupplier >", value, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierGreaterThanOrEqualTo(String value) {
            addCriterion("mobileSupplier >=", value, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierLessThan(String value) {
            addCriterion("mobileSupplier <", value, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierLessThanOrEqualTo(String value) {
            addCriterion("mobileSupplier <=", value, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierLike(String value) {
            addCriterion("mobileSupplier like", value, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierNotLike(String value) {
            addCriterion("mobileSupplier not like", value, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierIn(List<String> values) {
            addCriterion("mobileSupplier in", values, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierNotIn(List<String> values) {
            addCriterion("mobileSupplier not in", values, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierBetween(String value1, String value2) {
            addCriterion("mobileSupplier between", value1, value2, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMobilesupplierNotBetween(String value1, String value2) {
            addCriterion("mobileSupplier not between", value1, value2, "mobilesupplier");
            return (Criteria) this;
        }

        public Criteria andMccIsNull() {
            addCriterion("mcc is null");
            return (Criteria) this;
        }

        public Criteria andMccIsNotNull() {
            addCriterion("mcc is not null");
            return (Criteria) this;
        }

        public Criteria andMccEqualTo(String value) {
            addCriterion("mcc =", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotEqualTo(String value) {
            addCriterion("mcc <>", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThan(String value) {
            addCriterion("mcc >", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccGreaterThanOrEqualTo(String value) {
            addCriterion("mcc >=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThan(String value) {
            addCriterion("mcc <", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLessThanOrEqualTo(String value) {
            addCriterion("mcc <=", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccLike(String value) {
            addCriterion("mcc like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotLike(String value) {
            addCriterion("mcc not like", value, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccIn(List<String> values) {
            addCriterion("mcc in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotIn(List<String> values) {
            addCriterion("mcc not in", values, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccBetween(String value1, String value2) {
            addCriterion("mcc between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMccNotBetween(String value1, String value2) {
            addCriterion("mcc not between", value1, value2, "mcc");
            return (Criteria) this;
        }

        public Criteria andMncIsNull() {
            addCriterion("mnc is null");
            return (Criteria) this;
        }

        public Criteria andMncIsNotNull() {
            addCriterion("mnc is not null");
            return (Criteria) this;
        }

        public Criteria andMncEqualTo(String value) {
            addCriterion("mnc =", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotEqualTo(String value) {
            addCriterion("mnc <>", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncGreaterThan(String value) {
            addCriterion("mnc >", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncGreaterThanOrEqualTo(String value) {
            addCriterion("mnc >=", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLessThan(String value) {
            addCriterion("mnc <", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLessThanOrEqualTo(String value) {
            addCriterion("mnc <=", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncLike(String value) {
            addCriterion("mnc like", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotLike(String value) {
            addCriterion("mnc not like", value, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncIn(List<String> values) {
            addCriterion("mnc in", values, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotIn(List<String> values) {
            addCriterion("mnc not in", values, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncBetween(String value1, String value2) {
            addCriterion("mnc between", value1, value2, "mnc");
            return (Criteria) this;
        }

        public Criteria andMncNotBetween(String value1, String value2) {
            addCriterion("mnc not between", value1, value2, "mnc");
            return (Criteria) this;
        }

        public Criteria andBbsjdIsNull() {
            addCriterion("bbsjd is null");
            return (Criteria) this;
        }

        public Criteria andBbsjdIsNotNull() {
            addCriterion("bbsjd is not null");
            return (Criteria) this;
        }

        public Criteria andBbsjdEqualTo(String value) {
            addCriterion("bbsjd =", value, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdNotEqualTo(String value) {
            addCriterion("bbsjd <>", value, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdGreaterThan(String value) {
            addCriterion("bbsjd >", value, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdGreaterThanOrEqualTo(String value) {
            addCriterion("bbsjd >=", value, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdLessThan(String value) {
            addCriterion("bbsjd <", value, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdLessThanOrEqualTo(String value) {
            addCriterion("bbsjd <=", value, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdLike(String value) {
            addCriterion("bbsjd like", value, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdNotLike(String value) {
            addCriterion("bbsjd not like", value, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdIn(List<String> values) {
            addCriterion("bbsjd in", values, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdNotIn(List<String> values) {
            addCriterion("bbsjd not in", values, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdBetween(String value1, String value2) {
            addCriterion("bbsjd between", value1, value2, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andBbsjdNotBetween(String value1, String value2) {
            addCriterion("bbsjd not between", value1, value2, "bbsjd");
            return (Criteria) this;
        }

        public Criteria andSsidIsNull() {
            addCriterion("ssid is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("ssid is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(String value) {
            addCriterion("ssid =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(String value) {
            addCriterion("ssid <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(String value) {
            addCriterion("ssid >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(String value) {
            addCriterion("ssid >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(String value) {
            addCriterion("ssid <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(String value) {
            addCriterion("ssid <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLike(String value) {
            addCriterion("ssid like", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotLike(String value) {
            addCriterion("ssid not like", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<String> values) {
            addCriterion("ssid in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<String> values) {
            addCriterion("ssid not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(String value1, String value2) {
            addCriterion("ssid between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(String value1, String value2) {
            addCriterion("ssid not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSimulatorIsNull() {
            addCriterion("simulator is null");
            return (Criteria) this;
        }

        public Criteria andSimulatorIsNotNull() {
            addCriterion("simulator is not null");
            return (Criteria) this;
        }

        public Criteria andSimulatorEqualTo(Boolean value) {
            addCriterion("simulator =", value, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorNotEqualTo(Boolean value) {
            addCriterion("simulator <>", value, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorGreaterThan(Boolean value) {
            addCriterion("simulator >", value, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("simulator >=", value, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorLessThan(Boolean value) {
            addCriterion("simulator <", value, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorLessThanOrEqualTo(Boolean value) {
            addCriterion("simulator <=", value, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorIn(List<Boolean> values) {
            addCriterion("simulator in", values, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorNotIn(List<Boolean> values) {
            addCriterion("simulator not in", values, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorBetween(Boolean value1, Boolean value2) {
            addCriterion("simulator between", value1, value2, "simulator");
            return (Criteria) this;
        }

        public Criteria andSimulatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("simulator not between", value1, value2, "simulator");
            return (Criteria) this;
        }

        public Criteria andPksignatureldIsNull() {
            addCriterion("pkSignatureld is null");
            return (Criteria) this;
        }

        public Criteria andPksignatureldIsNotNull() {
            addCriterion("pkSignatureld is not null");
            return (Criteria) this;
        }

        public Criteria andPksignatureldEqualTo(String value) {
            addCriterion("pkSignatureld =", value, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldNotEqualTo(String value) {
            addCriterion("pkSignatureld <>", value, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldGreaterThan(String value) {
            addCriterion("pkSignatureld >", value, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldGreaterThanOrEqualTo(String value) {
            addCriterion("pkSignatureld >=", value, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldLessThan(String value) {
            addCriterion("pkSignatureld <", value, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldLessThanOrEqualTo(String value) {
            addCriterion("pkSignatureld <=", value, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldLike(String value) {
            addCriterion("pkSignatureld like", value, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldNotLike(String value) {
            addCriterion("pkSignatureld not like", value, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldIn(List<String> values) {
            addCriterion("pkSignatureld in", values, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldNotIn(List<String> values) {
            addCriterion("pkSignatureld not in", values, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldBetween(String value1, String value2) {
            addCriterion("pkSignatureld between", value1, value2, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldNotBetween(String value1, String value2) {
            addCriterion("pkSignatureld not between", value1, value2, "pksignatureld");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashIsNull() {
            addCriterion("pkSignatureldHash is null");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashIsNotNull() {
            addCriterion("pkSignatureldHash is not null");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashEqualTo(String value) {
            addCriterion("pkSignatureldHash =", value, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashNotEqualTo(String value) {
            addCriterion("pkSignatureldHash <>", value, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashGreaterThan(String value) {
            addCriterion("pkSignatureldHash >", value, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashGreaterThanOrEqualTo(String value) {
            addCriterion("pkSignatureldHash >=", value, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashLessThan(String value) {
            addCriterion("pkSignatureldHash <", value, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashLessThanOrEqualTo(String value) {
            addCriterion("pkSignatureldHash <=", value, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashLike(String value) {
            addCriterion("pkSignatureldHash like", value, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashNotLike(String value) {
            addCriterion("pkSignatureldHash not like", value, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashIn(List<String> values) {
            addCriterion("pkSignatureldHash in", values, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashNotIn(List<String> values) {
            addCriterion("pkSignatureldHash not in", values, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashBetween(String value1, String value2) {
            addCriterion("pkSignatureldHash between", value1, value2, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andPksignatureldhashNotBetween(String value1, String value2) {
            addCriterion("pkSignatureldHash not between", value1, value2, "pksignatureldhash");
            return (Criteria) this;
        }

        public Criteria andCollecttimeIsNull() {
            addCriterion("collectTime is null");
            return (Criteria) this;
        }

        public Criteria andCollecttimeIsNotNull() {
            addCriterion("collectTime is not null");
            return (Criteria) this;
        }

        public Criteria andCollecttimeEqualTo(Date value) {
            addCriterion("collectTime =", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeNotEqualTo(Date value) {
            addCriterion("collectTime <>", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeGreaterThan(Date value) {
            addCriterion("collectTime >", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collectTime >=", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeLessThan(Date value) {
            addCriterion("collectTime <", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeLessThanOrEqualTo(Date value) {
            addCriterion("collectTime <=", value, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeIn(List<Date> values) {
            addCriterion("collectTime in", values, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeNotIn(List<Date> values) {
            addCriterion("collectTime not in", values, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeBetween(Date value1, Date value2) {
            addCriterion("collectTime between", value1, value2, "collecttime");
            return (Criteria) this;
        }

        public Criteria andCollecttimeNotBetween(Date value1, Date value2) {
            addCriterion("collectTime not between", value1, value2, "collecttime");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionIsNull() {
            addCriterion("dfpSdkVersion is null");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionIsNotNull() {
            addCriterion("dfpSdkVersion is not null");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionEqualTo(String value) {
            addCriterion("dfpSdkVersion =", value, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionNotEqualTo(String value) {
            addCriterion("dfpSdkVersion <>", value, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionGreaterThan(String value) {
            addCriterion("dfpSdkVersion >", value, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionGreaterThanOrEqualTo(String value) {
            addCriterion("dfpSdkVersion >=", value, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionLessThan(String value) {
            addCriterion("dfpSdkVersion <", value, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionLessThanOrEqualTo(String value) {
            addCriterion("dfpSdkVersion <=", value, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionLike(String value) {
            addCriterion("dfpSdkVersion like", value, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionNotLike(String value) {
            addCriterion("dfpSdkVersion not like", value, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionIn(List<String> values) {
            addCriterion("dfpSdkVersion in", values, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionNotIn(List<String> values) {
            addCriterion("dfpSdkVersion not in", values, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionBetween(String value1, String value2) {
            addCriterion("dfpSdkVersion between", value1, value2, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andDfpsdkversionNotBetween(String value1, String value2) {
            addCriterion("dfpSdkVersion not between", value1, value2, "dfpsdkversion");
            return (Criteria) this;
        }

        public Criteria andGpslnfoIsNull() {
            addCriterion("gpslnfo is null");
            return (Criteria) this;
        }

        public Criteria andGpslnfoIsNotNull() {
            addCriterion("gpslnfo is not null");
            return (Criteria) this;
        }

        public Criteria andGpslnfoEqualTo(String value) {
            addCriterion("gpslnfo =", value, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoNotEqualTo(String value) {
            addCriterion("gpslnfo <>", value, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoGreaterThan(String value) {
            addCriterion("gpslnfo >", value, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoGreaterThanOrEqualTo(String value) {
            addCriterion("gpslnfo >=", value, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoLessThan(String value) {
            addCriterion("gpslnfo <", value, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoLessThanOrEqualTo(String value) {
            addCriterion("gpslnfo <=", value, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoLike(String value) {
            addCriterion("gpslnfo like", value, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoNotLike(String value) {
            addCriterion("gpslnfo not like", value, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoIn(List<String> values) {
            addCriterion("gpslnfo in", values, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoNotIn(List<String> values) {
            addCriterion("gpslnfo not in", values, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoBetween(String value1, String value2) {
            addCriterion("gpslnfo between", value1, value2, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andGpslnfoNotBetween(String value1, String value2) {
            addCriterion("gpslnfo not between", value1, value2, "gpslnfo");
            return (Criteria) this;
        }

        public Criteria andTelnoIsNull() {
            addCriterion("telNo is null");
            return (Criteria) this;
        }

        public Criteria andTelnoIsNotNull() {
            addCriterion("telNo is not null");
            return (Criteria) this;
        }

        public Criteria andTelnoEqualTo(String value) {
            addCriterion("telNo =", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotEqualTo(String value) {
            addCriterion("telNo <>", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoGreaterThan(String value) {
            addCriterion("telNo >", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoGreaterThanOrEqualTo(String value) {
            addCriterion("telNo >=", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLessThan(String value) {
            addCriterion("telNo <", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLessThanOrEqualTo(String value) {
            addCriterion("telNo <=", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLike(String value) {
            addCriterion("telNo like", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotLike(String value) {
            addCriterion("telNo not like", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoIn(List<String> values) {
            addCriterion("telNo in", values, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotIn(List<String> values) {
            addCriterion("telNo not in", values, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoBetween(String value1, String value2) {
            addCriterion("telNo between", value1, value2, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotBetween(String value1, String value2) {
            addCriterion("telNo not between", value1, value2, "telno");
            return (Criteria) this;
        }

        public Criteria andNetwktypeIsNull() {
            addCriterion("netwkType is null");
            return (Criteria) this;
        }

        public Criteria andNetwktypeIsNotNull() {
            addCriterion("netwkType is not null");
            return (Criteria) this;
        }

        public Criteria andNetwktypeEqualTo(String value) {
            addCriterion("netwkType =", value, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeNotEqualTo(String value) {
            addCriterion("netwkType <>", value, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeGreaterThan(String value) {
            addCriterion("netwkType >", value, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeGreaterThanOrEqualTo(String value) {
            addCriterion("netwkType >=", value, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeLessThan(String value) {
            addCriterion("netwkType <", value, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeLessThanOrEqualTo(String value) {
            addCriterion("netwkType <=", value, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeLike(String value) {
            addCriterion("netwkType like", value, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeNotLike(String value) {
            addCriterion("netwkType not like", value, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeIn(List<String> values) {
            addCriterion("netwkType in", values, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeNotIn(List<String> values) {
            addCriterion("netwkType not in", values, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeBetween(String value1, String value2) {
            addCriterion("netwkType between", value1, value2, "netwktype");
            return (Criteria) this;
        }

        public Criteria andNetwktypeNotBetween(String value1, String value2) {
            addCriterion("netwkType not between", value1, value2, "netwktype");
            return (Criteria) this;
        }

        public Criteria andDnsaddressIsNull() {
            addCriterion("dnsAddress is null");
            return (Criteria) this;
        }

        public Criteria andDnsaddressIsNotNull() {
            addCriterion("dnsAddress is not null");
            return (Criteria) this;
        }

        public Criteria andDnsaddressEqualTo(String value) {
            addCriterion("dnsAddress =", value, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressNotEqualTo(String value) {
            addCriterion("dnsAddress <>", value, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressGreaterThan(String value) {
            addCriterion("dnsAddress >", value, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressGreaterThanOrEqualTo(String value) {
            addCriterion("dnsAddress >=", value, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressLessThan(String value) {
            addCriterion("dnsAddress <", value, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressLessThanOrEqualTo(String value) {
            addCriterion("dnsAddress <=", value, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressLike(String value) {
            addCriterion("dnsAddress like", value, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressNotLike(String value) {
            addCriterion("dnsAddress not like", value, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressIn(List<String> values) {
            addCriterion("dnsAddress in", values, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressNotIn(List<String> values) {
            addCriterion("dnsAddress not in", values, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressBetween(String value1, String value2) {
            addCriterion("dnsAddress between", value1, value2, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andDnsaddressNotBetween(String value1, String value2) {
            addCriterion("dnsAddress not between", value1, value2, "dnsaddress");
            return (Criteria) this;
        }

        public Criteria andKernelversionIsNull() {
            addCriterion("kernelVersion is null");
            return (Criteria) this;
        }

        public Criteria andKernelversionIsNotNull() {
            addCriterion("kernelVersion is not null");
            return (Criteria) this;
        }

        public Criteria andKernelversionEqualTo(String value) {
            addCriterion("kernelVersion =", value, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionNotEqualTo(String value) {
            addCriterion("kernelVersion <>", value, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionGreaterThan(String value) {
            addCriterion("kernelVersion >", value, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionGreaterThanOrEqualTo(String value) {
            addCriterion("kernelVersion >=", value, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionLessThan(String value) {
            addCriterion("kernelVersion <", value, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionLessThanOrEqualTo(String value) {
            addCriterion("kernelVersion <=", value, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionLike(String value) {
            addCriterion("kernelVersion like", value, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionNotLike(String value) {
            addCriterion("kernelVersion not like", value, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionIn(List<String> values) {
            addCriterion("kernelVersion in", values, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionNotIn(List<String> values) {
            addCriterion("kernelVersion not in", values, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionBetween(String value1, String value2) {
            addCriterion("kernelVersion between", value1, value2, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andKernelversionNotBetween(String value1, String value2) {
            addCriterion("kernelVersion not between", value1, value2, "kernelversion");
            return (Criteria) this;
        }

        public Criteria andCpumodeIsNull() {
            addCriterion("cpuMode is null");
            return (Criteria) this;
        }

        public Criteria andCpumodeIsNotNull() {
            addCriterion("cpuMode is not null");
            return (Criteria) this;
        }

        public Criteria andCpumodeEqualTo(String value) {
            addCriterion("cpuMode =", value, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeNotEqualTo(String value) {
            addCriterion("cpuMode <>", value, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeGreaterThan(String value) {
            addCriterion("cpuMode >", value, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeGreaterThanOrEqualTo(String value) {
            addCriterion("cpuMode >=", value, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeLessThan(String value) {
            addCriterion("cpuMode <", value, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeLessThanOrEqualTo(String value) {
            addCriterion("cpuMode <=", value, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeLike(String value) {
            addCriterion("cpuMode like", value, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeNotLike(String value) {
            addCriterion("cpuMode not like", value, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeIn(List<String> values) {
            addCriterion("cpuMode in", values, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeNotIn(List<String> values) {
            addCriterion("cpuMode not in", values, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeBetween(String value1, String value2) {
            addCriterion("cpuMode between", value1, value2, "cpumode");
            return (Criteria) this;
        }

        public Criteria andCpumodeNotBetween(String value1, String value2) {
            addCriterion("cpuMode not between", value1, value2, "cpumode");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeIsNull() {
            addCriterion("terminalType is null");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeIsNotNull() {
            addCriterion("terminalType is not null");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeEqualTo(String value) {
            addCriterion("terminalType =", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeNotEqualTo(String value) {
            addCriterion("terminalType <>", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeGreaterThan(String value) {
            addCriterion("terminalType >", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeGreaterThanOrEqualTo(String value) {
            addCriterion("terminalType >=", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeLessThan(String value) {
            addCriterion("terminalType <", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeLessThanOrEqualTo(String value) {
            addCriterion("terminalType <=", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeLike(String value) {
            addCriterion("terminalType like", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeNotLike(String value) {
            addCriterion("terminalType not like", value, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeIn(List<String> values) {
            addCriterion("terminalType in", values, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeNotIn(List<String> values) {
            addCriterion("terminalType not in", values, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeBetween(String value1, String value2) {
            addCriterion("terminalType between", value1, value2, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andTerminaltypeNotBetween(String value1, String value2) {
            addCriterion("terminalType not between", value1, value2, "terminaltype");
            return (Criteria) this;
        }

        public Criteria andClientipIsNull() {
            addCriterion("clientip is null");
            return (Criteria) this;
        }

        public Criteria andClientipIsNotNull() {
            addCriterion("clientip is not null");
            return (Criteria) this;
        }

        public Criteria andClientipEqualTo(String value) {
            addCriterion("clientip =", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipNotEqualTo(String value) {
            addCriterion("clientip <>", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipGreaterThan(String value) {
            addCriterion("clientip >", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipGreaterThanOrEqualTo(String value) {
            addCriterion("clientip >=", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipLessThan(String value) {
            addCriterion("clientip <", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipLessThanOrEqualTo(String value) {
            addCriterion("clientip <=", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipLike(String value) {
            addCriterion("clientip like", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipNotLike(String value) {
            addCriterion("clientip not like", value, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipIn(List<String> values) {
            addCriterion("clientip in", values, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipNotIn(List<String> values) {
            addCriterion("clientip not in", values, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipBetween(String value1, String value2) {
            addCriterion("clientip between", value1, value2, "clientip");
            return (Criteria) this;
        }

        public Criteria andClientipNotBetween(String value1, String value2) {
            addCriterion("clientip not between", value1, value2, "clientip");
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