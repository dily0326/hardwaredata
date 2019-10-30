package com.ytrj.hardwaredata.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DianyuanInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DianyuanInfoExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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
            addCriterion("ytrj_app_dianyuan_info.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ytrj_app_dianyuan_info.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ytrj_app_dianyuan_info.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ytrj_app_dianyuan_info.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ytrj_app_dianyuan_info.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ytrj_app_dianyuan_info.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ytrj_app_dianyuan_info.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ytrj_app_dianyuan_info.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ytrj_app_dianyuan_info.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ytrj_app_dianyuan_info.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ytrj_app_dianyuan_info.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("ytrj_app_dianyuan_info.imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("ytrj_app_dianyuan_info.imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("ytrj_app_dianyuan_info.imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("ytrj_app_dianyuan_info.imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("ytrj_app_dianyuan_info.imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("ytrj_app_dianyuan_info.imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("ytrj_app_dianyuan_info.imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("ytrj_app_dianyuan_info.imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("ytrj_app_dianyuan_info.imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("ytrj_app_dianyuan_info.imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("ytrj_app_dianyuan_info.imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("ytrj_app_dianyuan_info.imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("ytrj_app_dianyuan_info.imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andVoltageAIsNull() {
            addCriterion("ytrj_app_dianyuan_info.voltage_a is null");
            return (Criteria) this;
        }

        public Criteria andVoltageAIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.voltage_a is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageAEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a =", value, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageANotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a <>", value, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageAGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a >", value, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageAGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a >=", value, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageALessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a <", value, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageALessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a <=", value, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageAIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a in", values, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageANotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a not in", values, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageABetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a between", value1, value2, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageANotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.voltage_a not between", value1, value2, "voltageA");
            return (Criteria) this;
        }

        public Criteria andVoltageBIsNull() {
            addCriterion("ytrj_app_dianyuan_info.voltage_b is null");
            return (Criteria) this;
        }

        public Criteria andVoltageBIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.voltage_b is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageBEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b =", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBNotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b <>", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b >", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b >=", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBLessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b <", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b <=", value, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b in", values, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBNotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b not in", values, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b between", value1, value2, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageBNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.voltage_b not between", value1, value2, "voltageB");
            return (Criteria) this;
        }

        public Criteria andVoltageCIsNull() {
            addCriterion("ytrj_app_dianyuan_info.voltage_c is null");
            return (Criteria) this;
        }

        public Criteria andVoltageCIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.voltage_c is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageCEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c =", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCNotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c <>", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c >", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c >=", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCLessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c <", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c <=", value, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c in", values, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCNotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c not in", values, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c between", value1, value2, "voltageC");
            return (Criteria) this;
        }

        public Criteria andVoltageCNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.voltage_c not between", value1, value2, "voltageC");
            return (Criteria) this;
        }

        public Criteria andElectricityAIsNull() {
            addCriterion("ytrj_app_dianyuan_info.electricity_a is null");
            return (Criteria) this;
        }

        public Criteria andElectricityAIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.electricity_a is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityAEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a =", value, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityANotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a <>", value, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityAGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a >", value, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityAGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a >=", value, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityALessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a <", value, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityALessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a <=", value, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityAIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a in", values, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityANotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a not in", values, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityABetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a between", value1, value2, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityANotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electricity_a not between", value1, value2, "electricityA");
            return (Criteria) this;
        }

        public Criteria andElectricityBIsNull() {
            addCriterion("ytrj_app_dianyuan_info.electricity_b is null");
            return (Criteria) this;
        }

        public Criteria andElectricityBIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.electricity_b is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityBEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b =", value, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBNotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b <>", value, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b >", value, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b >=", value, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBLessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b <", value, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b <=", value, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b in", values, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBNotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b not in", values, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b between", value1, value2, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityBNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electricity_b not between", value1, value2, "electricityB");
            return (Criteria) this;
        }

        public Criteria andElectricityCIsNull() {
            addCriterion("ytrj_app_dianyuan_info.electricity_c is null");
            return (Criteria) this;
        }

        public Criteria andElectricityCIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.electricity_c is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityCEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c =", value, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCNotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c <>", value, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c >", value, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c >=", value, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCLessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c <", value, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c <=", value, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c in", values, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCNotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c not in", values, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c between", value1, value2, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricityCNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electricity_c not between", value1, value2, "electricityC");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1IsNull() {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 is null");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1IsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 is not null");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1EqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 =", value, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1NotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 <>", value, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1GreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 >", value, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 >=", value, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1LessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 <", value, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1LessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 <=", value, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1In(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 in", values, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1NotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 not in", values, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1Between(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 between", value1, value2, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage1NotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_1 not between", value1, value2, "electricLeakage1");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2IsNull() {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 is null");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2IsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 is not null");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2EqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 =", value, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2NotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 <>", value, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2GreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 >", value, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 >=", value, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2LessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 <", value, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2LessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 <=", value, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2In(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 in", values, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2NotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 not in", values, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2Between(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 between", value1, value2, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage2NotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_2 not between", value1, value2, "electricLeakage2");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3IsNull() {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 is null");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3IsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 is not null");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3EqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 =", value, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3NotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 <>", value, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3GreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 >", value, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 >=", value, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3LessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 <", value, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3LessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 <=", value, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3In(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 in", values, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3NotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 not in", values, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3Between(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 between", value1, value2, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage3NotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_3 not between", value1, value2, "electricLeakage3");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4IsNull() {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 is null");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4IsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 is not null");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4EqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 =", value, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4NotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 <>", value, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4GreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 >", value, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 >=", value, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4LessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 <", value, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4LessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 <=", value, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4In(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 in", values, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4NotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 not in", values, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4Between(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 between", value1, value2, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andElectricLeakage4NotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.electric_leakage_4 not between", value1, value2, "electricLeakage4");
            return (Criteria) this;
        }

        public Criteria andTemperature1IsNull() {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 is null");
            return (Criteria) this;
        }

        public Criteria andTemperature1IsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 is not null");
            return (Criteria) this;
        }

        public Criteria andTemperature1EqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 =", value, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1NotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 <>", value, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1GreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 >", value, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 >=", value, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1LessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 <", value, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1LessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 <=", value, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1In(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 in", values, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1NotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 not in", values, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1Between(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 between", value1, value2, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature1NotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.temperature_1 not between", value1, value2, "temperature1");
            return (Criteria) this;
        }

        public Criteria andTemperature2IsNull() {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 is null");
            return (Criteria) this;
        }

        public Criteria andTemperature2IsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 is not null");
            return (Criteria) this;
        }

        public Criteria andTemperature2EqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 =", value, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2NotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 <>", value, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2GreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 >", value, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 >=", value, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2LessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 <", value, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2LessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 <=", value, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2In(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 in", values, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2NotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 not in", values, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2Between(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 between", value1, value2, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature2NotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.temperature_2 not between", value1, value2, "temperature2");
            return (Criteria) this;
        }

        public Criteria andTemperature3IsNull() {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 is null");
            return (Criteria) this;
        }

        public Criteria andTemperature3IsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 is not null");
            return (Criteria) this;
        }

        public Criteria andTemperature3EqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 =", value, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3NotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 <>", value, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3GreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 >", value, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 >=", value, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3LessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 <", value, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3LessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 <=", value, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3In(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 in", values, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3NotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 not in", values, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3Between(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 between", value1, value2, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature3NotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.temperature_3 not between", value1, value2, "temperature3");
            return (Criteria) this;
        }

        public Criteria andTemperature4IsNull() {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 is null");
            return (Criteria) this;
        }

        public Criteria andTemperature4IsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 is not null");
            return (Criteria) this;
        }

        public Criteria andTemperature4EqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 =", value, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4NotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 <>", value, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4GreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 >", value, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 >=", value, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4LessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 <", value, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4LessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 <=", value, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4In(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 in", values, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4NotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 not in", values, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4Between(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 between", value1, value2, "temperature4");
            return (Criteria) this;
        }

        public Criteria andTemperature4NotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.temperature_4 not between", value1, value2, "temperature4");
            return (Criteria) this;
        }

        public Criteria andArcFaultIsNull() {
            addCriterion("ytrj_app_dianyuan_info.arc_fault is null");
            return (Criteria) this;
        }

        public Criteria andArcFaultIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.arc_fault is not null");
            return (Criteria) this;
        }

        public Criteria andArcFaultEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault =", value, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultNotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault <>", value, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault >", value, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault >=", value, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultLessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault <", value, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault <=", value, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault in", values, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultNotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault not in", values, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault between", value1, value2, "arcFault");
            return (Criteria) this;
        }

        public Criteria andArcFaultNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.arc_fault not between", value1, value2, "arcFault");
            return (Criteria) this;
        }

        public Criteria andResistanceIsNull() {
            addCriterion("ytrj_app_dianyuan_info.resistance is null");
            return (Criteria) this;
        }

        public Criteria andResistanceIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.resistance is not null");
            return (Criteria) this;
        }

        public Criteria andResistanceEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.resistance =", value, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceNotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.resistance <>", value, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.resistance >", value, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.resistance >=", value, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceLessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.resistance <", value, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.resistance <=", value, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.resistance in", values, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceNotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.resistance not in", values, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.resistance between", value1, value2, "resistance");
            return (Criteria) this;
        }

        public Criteria andResistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.resistance not between", value1, value2, "resistance");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("ytrj_app_dianyuan_info.`online` is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.`online` is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.`online` =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.`online` <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.`online` >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.`online` >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.`online` <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_dianyuan_info.`online` <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.`online` in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Integer> values) {
            addCriterion("ytrj_app_dianyuan_info.`online` not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.`online` between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_dianyuan_info.`online` not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNull() {
            addCriterion("ytrj_app_dianyuan_info.data_time is null");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.data_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimeEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.data_time =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.data_time <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(Date value) {
            addCriterion("ytrj_app_dianyuan_info.data_time >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.data_time >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(Date value) {
            addCriterion("ytrj_app_dianyuan_info.data_time <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.data_time <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<Date> values) {
            addCriterion("ytrj_app_dianyuan_info.data_time in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<Date> values) {
            addCriterion("ytrj_app_dianyuan_info.data_time not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_dianyuan_info.data_time between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_dianyuan_info.data_time not between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("ytrj_app_dianyuan_info.create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("ytrj_app_dianyuan_info.create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("ytrj_app_dianyuan_info.create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("ytrj_app_dianyuan_info.create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("ytrj_app_dianyuan_info.create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("ytrj_app_dianyuan_info.create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("ytrj_app_dianyuan_info.create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("ytrj_app_dianyuan_info.create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("ytrj_app_dianyuan_info.create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("ytrj_app_dianyuan_info.create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("ytrj_app_dianyuan_info.create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("ytrj_app_dianyuan_info.create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("ytrj_app_dianyuan_info.create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("ytrj_app_dianyuan_info.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("ytrj_app_dianyuan_info.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("ytrj_app_dianyuan_info.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("ytrj_app_dianyuan_info.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("ytrj_app_dianyuan_info.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_dianyuan_info.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_dianyuan_info.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("ytrj_app_dianyuan_info.update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Date> values) {
            addCriterion("ytrj_app_dianyuan_info.update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Date> values) {
            addCriterion("ytrj_app_dianyuan_info.update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_dianyuan_info.update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_dianyuan_info.update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("ytrj_app_dianyuan_info.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("ytrj_app_dianyuan_info.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_dianyuan_info.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("ytrj_app_dianyuan_info.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("ytrj_app_dianyuan_info.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_dianyuan_info.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_dianyuan_info.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
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