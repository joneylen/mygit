package com.unionpay.boot.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OriginTravelDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OriginTravelDataExample() {
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

        public Criteria andRequestTimeIsNull() {
            addCriterion("request_time is null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNotNull() {
            addCriterion("request_time is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeEqualTo(Date value) {
            addCriterion("request_time =", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotEqualTo(Date value) {
            addCriterion("request_time <>", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThan(Date value) {
            addCriterion("request_time >", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("request_time >=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThan(Date value) {
            addCriterion("request_time <", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("request_time <=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIn(List<Date> values) {
            addCriterion("request_time in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotIn(List<Date> values) {
            addCriterion("request_time not in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeBetween(Date value1, Date value2) {
            addCriterion("request_time between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("request_time not between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeIsNull() {
            addCriterion("original_time is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeIsNotNull() {
            addCriterion("original_time is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeEqualTo(Date value) {
            addCriterion("original_time =", value, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeNotEqualTo(Date value) {
            addCriterion("original_time <>", value, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeGreaterThan(Date value) {
            addCriterion("original_time >", value, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("original_time >=", value, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeLessThan(Date value) {
            addCriterion("original_time <", value, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeLessThanOrEqualTo(Date value) {
            addCriterion("original_time <=", value, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeIn(List<Date> values) {
            addCriterion("original_time in", values, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeNotIn(List<Date> values) {
            addCriterion("original_time not in", values, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeBetween(Date value1, Date value2) {
            addCriterion("original_time between", value1, value2, "originalTime");
            return (Criteria) this;
        }

        public Criteria andOriginalTimeNotBetween(Date value1, Date value2) {
            addCriterion("original_time not between", value1, value2, "originalTime");
            return (Criteria) this;
        }

        public Criteria andAccXIsNull() {
            addCriterion("acc_x is null");
            return (Criteria) this;
        }

        public Criteria andAccXIsNotNull() {
            addCriterion("acc_x is not null");
            return (Criteria) this;
        }

        public Criteria andAccXEqualTo(Float value) {
            addCriterion("acc_x =", value, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXNotEqualTo(Float value) {
            addCriterion("acc_x <>", value, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXGreaterThan(Float value) {
            addCriterion("acc_x >", value, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXGreaterThanOrEqualTo(Float value) {
            addCriterion("acc_x >=", value, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXLessThan(Float value) {
            addCriterion("acc_x <", value, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXLessThanOrEqualTo(Float value) {
            addCriterion("acc_x <=", value, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXIn(List<Float> values) {
            addCriterion("acc_x in", values, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXNotIn(List<Float> values) {
            addCriterion("acc_x not in", values, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXBetween(Float value1, Float value2) {
            addCriterion("acc_x between", value1, value2, "accX");
            return (Criteria) this;
        }

        public Criteria andAccXNotBetween(Float value1, Float value2) {
            addCriterion("acc_x not between", value1, value2, "accX");
            return (Criteria) this;
        }

        public Criteria andAccYIsNull() {
            addCriterion("acc_y is null");
            return (Criteria) this;
        }

        public Criteria andAccYIsNotNull() {
            addCriterion("acc_y is not null");
            return (Criteria) this;
        }

        public Criteria andAccYEqualTo(Float value) {
            addCriterion("acc_y =", value, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYNotEqualTo(Float value) {
            addCriterion("acc_y <>", value, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYGreaterThan(Float value) {
            addCriterion("acc_y >", value, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYGreaterThanOrEqualTo(Float value) {
            addCriterion("acc_y >=", value, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYLessThan(Float value) {
            addCriterion("acc_y <", value, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYLessThanOrEqualTo(Float value) {
            addCriterion("acc_y <=", value, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYIn(List<Float> values) {
            addCriterion("acc_y in", values, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYNotIn(List<Float> values) {
            addCriterion("acc_y not in", values, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYBetween(Float value1, Float value2) {
            addCriterion("acc_y between", value1, value2, "accY");
            return (Criteria) this;
        }

        public Criteria andAccYNotBetween(Float value1, Float value2) {
            addCriterion("acc_y not between", value1, value2, "accY");
            return (Criteria) this;
        }

        public Criteria andAccZIsNull() {
            addCriterion("acc_z is null");
            return (Criteria) this;
        }

        public Criteria andAccZIsNotNull() {
            addCriterion("acc_z is not null");
            return (Criteria) this;
        }

        public Criteria andAccZEqualTo(Float value) {
            addCriterion("acc_z =", value, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZNotEqualTo(Float value) {
            addCriterion("acc_z <>", value, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZGreaterThan(Float value) {
            addCriterion("acc_z >", value, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZGreaterThanOrEqualTo(Float value) {
            addCriterion("acc_z >=", value, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZLessThan(Float value) {
            addCriterion("acc_z <", value, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZLessThanOrEqualTo(Float value) {
            addCriterion("acc_z <=", value, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZIn(List<Float> values) {
            addCriterion("acc_z in", values, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZNotIn(List<Float> values) {
            addCriterion("acc_z not in", values, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZBetween(Float value1, Float value2) {
            addCriterion("acc_z between", value1, value2, "accZ");
            return (Criteria) this;
        }

        public Criteria andAccZNotBetween(Float value1, Float value2) {
            addCriterion("acc_z not between", value1, value2, "accZ");
            return (Criteria) this;
        }

        public Criteria andGyroXIsNull() {
            addCriterion("gyro_x is null");
            return (Criteria) this;
        }

        public Criteria andGyroXIsNotNull() {
            addCriterion("gyro_x is not null");
            return (Criteria) this;
        }

        public Criteria andGyroXEqualTo(Float value) {
            addCriterion("gyro_x =", value, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXNotEqualTo(Float value) {
            addCriterion("gyro_x <>", value, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXGreaterThan(Float value) {
            addCriterion("gyro_x >", value, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXGreaterThanOrEqualTo(Float value) {
            addCriterion("gyro_x >=", value, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXLessThan(Float value) {
            addCriterion("gyro_x <", value, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXLessThanOrEqualTo(Float value) {
            addCriterion("gyro_x <=", value, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXIn(List<Float> values) {
            addCriterion("gyro_x in", values, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXNotIn(List<Float> values) {
            addCriterion("gyro_x not in", values, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXBetween(Float value1, Float value2) {
            addCriterion("gyro_x between", value1, value2, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroXNotBetween(Float value1, Float value2) {
            addCriterion("gyro_x not between", value1, value2, "gyroX");
            return (Criteria) this;
        }

        public Criteria andGyroYIsNull() {
            addCriterion("gyro_y is null");
            return (Criteria) this;
        }

        public Criteria andGyroYIsNotNull() {
            addCriterion("gyro_y is not null");
            return (Criteria) this;
        }

        public Criteria andGyroYEqualTo(Float value) {
            addCriterion("gyro_y =", value, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYNotEqualTo(Float value) {
            addCriterion("gyro_y <>", value, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYGreaterThan(Float value) {
            addCriterion("gyro_y >", value, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYGreaterThanOrEqualTo(Float value) {
            addCriterion("gyro_y >=", value, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYLessThan(Float value) {
            addCriterion("gyro_y <", value, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYLessThanOrEqualTo(Float value) {
            addCriterion("gyro_y <=", value, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYIn(List<Float> values) {
            addCriterion("gyro_y in", values, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYNotIn(List<Float> values) {
            addCriterion("gyro_y not in", values, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYBetween(Float value1, Float value2) {
            addCriterion("gyro_y between", value1, value2, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroYNotBetween(Float value1, Float value2) {
            addCriterion("gyro_y not between", value1, value2, "gyroY");
            return (Criteria) this;
        }

        public Criteria andGyroZIsNull() {
            addCriterion("gyro_z is null");
            return (Criteria) this;
        }

        public Criteria andGyroZIsNotNull() {
            addCriterion("gyro_z is not null");
            return (Criteria) this;
        }

        public Criteria andGyroZEqualTo(Float value) {
            addCriterion("gyro_z =", value, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZNotEqualTo(Float value) {
            addCriterion("gyro_z <>", value, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZGreaterThan(Float value) {
            addCriterion("gyro_z >", value, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZGreaterThanOrEqualTo(Float value) {
            addCriterion("gyro_z >=", value, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZLessThan(Float value) {
            addCriterion("gyro_z <", value, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZLessThanOrEqualTo(Float value) {
            addCriterion("gyro_z <=", value, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZIn(List<Float> values) {
            addCriterion("gyro_z in", values, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZNotIn(List<Float> values) {
            addCriterion("gyro_z not in", values, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZBetween(Float value1, Float value2) {
            addCriterion("gyro_z between", value1, value2, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andGyroZNotBetween(Float value1, Float value2) {
            addCriterion("gyro_z not between", value1, value2, "gyroZ");
            return (Criteria) this;
        }

        public Criteria andMagXIsNull() {
            addCriterion("mag_x is null");
            return (Criteria) this;
        }

        public Criteria andMagXIsNotNull() {
            addCriterion("mag_x is not null");
            return (Criteria) this;
        }

        public Criteria andMagXEqualTo(Float value) {
            addCriterion("mag_x =", value, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXNotEqualTo(Float value) {
            addCriterion("mag_x <>", value, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXGreaterThan(Float value) {
            addCriterion("mag_x >", value, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXGreaterThanOrEqualTo(Float value) {
            addCriterion("mag_x >=", value, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXLessThan(Float value) {
            addCriterion("mag_x <", value, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXLessThanOrEqualTo(Float value) {
            addCriterion("mag_x <=", value, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXIn(List<Float> values) {
            addCriterion("mag_x in", values, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXNotIn(List<Float> values) {
            addCriterion("mag_x not in", values, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXBetween(Float value1, Float value2) {
            addCriterion("mag_x between", value1, value2, "magX");
            return (Criteria) this;
        }

        public Criteria andMagXNotBetween(Float value1, Float value2) {
            addCriterion("mag_x not between", value1, value2, "magX");
            return (Criteria) this;
        }

        public Criteria andMagYIsNull() {
            addCriterion("mag_y is null");
            return (Criteria) this;
        }

        public Criteria andMagYIsNotNull() {
            addCriterion("mag_y is not null");
            return (Criteria) this;
        }

        public Criteria andMagYEqualTo(Float value) {
            addCriterion("mag_y =", value, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYNotEqualTo(Float value) {
            addCriterion("mag_y <>", value, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYGreaterThan(Float value) {
            addCriterion("mag_y >", value, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYGreaterThanOrEqualTo(Float value) {
            addCriterion("mag_y >=", value, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYLessThan(Float value) {
            addCriterion("mag_y <", value, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYLessThanOrEqualTo(Float value) {
            addCriterion("mag_y <=", value, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYIn(List<Float> values) {
            addCriterion("mag_y in", values, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYNotIn(List<Float> values) {
            addCriterion("mag_y not in", values, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYBetween(Float value1, Float value2) {
            addCriterion("mag_y between", value1, value2, "magY");
            return (Criteria) this;
        }

        public Criteria andMagYNotBetween(Float value1, Float value2) {
            addCriterion("mag_y not between", value1, value2, "magY");
            return (Criteria) this;
        }

        public Criteria andMagZIsNull() {
            addCriterion("mag_z is null");
            return (Criteria) this;
        }

        public Criteria andMagZIsNotNull() {
            addCriterion("mag_z is not null");
            return (Criteria) this;
        }

        public Criteria andMagZEqualTo(Float value) {
            addCriterion("mag_z =", value, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZNotEqualTo(Float value) {
            addCriterion("mag_z <>", value, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZGreaterThan(Float value) {
            addCriterion("mag_z >", value, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZGreaterThanOrEqualTo(Float value) {
            addCriterion("mag_z >=", value, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZLessThan(Float value) {
            addCriterion("mag_z <", value, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZLessThanOrEqualTo(Float value) {
            addCriterion("mag_z <=", value, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZIn(List<Float> values) {
            addCriterion("mag_z in", values, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZNotIn(List<Float> values) {
            addCriterion("mag_z not in", values, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZBetween(Float value1, Float value2) {
            addCriterion("mag_z between", value1, value2, "magZ");
            return (Criteria) this;
        }

        public Criteria andMagZNotBetween(Float value1, Float value2) {
            addCriterion("mag_z not between", value1, value2, "magZ");
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