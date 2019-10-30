package com.ytrj.hardwaredata.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YanganInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public YanganInfoExample() {
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
            addCriterion("ytrj_app_yangan_info.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ytrj_app_yangan_info.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ytrj_app_yangan_info.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("ytrj_app_yangan_info.deviceId =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ytrj_app_yangan_info.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ytrj_app_yangan_info.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ytrj_app_yangan_info.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ytrj_app_yangan_info.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ytrj_app_yangan_info.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ytrj_app_yangan_info.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ytrj_app_yangan_info.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ytrj_app_yangan_info.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ytrj_app_yangan_info.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSignalQualityIsNull() {
            addCriterion("ytrj_app_yangan_info.signal_quality is null");
            return (Criteria) this;
        }

        public Criteria andSignalQualityIsNotNull() {
            addCriterion("ytrj_app_yangan_info.signal_quality is not null");
            return (Criteria) this;
        }

        public Criteria andSignalQualityEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.signal_quality =", value, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityNotEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.signal_quality <>", value, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityGreaterThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.signal_quality >", value, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.signal_quality >=", value, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityLessThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.signal_quality <", value, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.signal_quality <=", value, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.signal_quality in", values, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityNotIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.signal_quality not in", values, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.signal_quality between", value1, value2, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andSignalQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.signal_quality not between", value1, value2, "signalQuality");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityIsNull() {
            addCriterion("ytrj_app_yangan_info.electric_quantity is null");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityIsNotNull() {
            addCriterion("ytrj_app_yangan_info.electric_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.electric_quantity =", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityNotEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.electric_quantity <>", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityGreaterThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.electric_quantity >", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.electric_quantity >=", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityLessThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.electric_quantity <", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.electric_quantity <=", value, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.electric_quantity in", values, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityNotIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.electric_quantity not in", values, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.electric_quantity between", value1, value2, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andElectricQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.electric_quantity not between", value1, value2, "electricQuantity");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIsNull() {
            addCriterion("ytrj_app_yangan_info.device_state is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIsNotNull() {
            addCriterion("ytrj_app_yangan_info.device_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_state =", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_state <>", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGreaterThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_state >", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_state >=", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateLessThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_state <", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_state <=", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.device_state in", values, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.device_state not in", values, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.device_state between", value1, value2, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.device_state not between", value1, value2, "deviceState");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("ytrj_app_yangan_info.message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("ytrj_app_yangan_info.message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("ytrj_app_yangan_info.message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("ytrj_app_yangan_info.message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("ytrj_app_yangan_info.message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("ytrj_app_yangan_info.message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("ytrj_app_yangan_info.message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("ytrj_app_yangan_info.message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("ytrj_app_yangan_info.message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("ytrj_app_yangan_info.message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("ytrj_app_yangan_info.message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("ytrj_app_yangan_info.message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("ytrj_app_yangan_info.message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("ytrj_app_yangan_info.message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIsNull() {
            addCriterion("ytrj_app_yangan_info.data_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIsNotNull() {
            addCriterion("ytrj_app_yangan_info.data_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeEqualTo(Date value) {
            addCriterion("ytrj_app_yangan_info.data_update_time =", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotEqualTo(Date value) {
            addCriterion("ytrj_app_yangan_info.data_update_time <>", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeGreaterThan(Date value) {
            addCriterion("ytrj_app_yangan_info.data_update_time >", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_yangan_info.data_update_time >=", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeLessThan(Date value) {
            addCriterion("ytrj_app_yangan_info.data_update_time <", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_yangan_info.data_update_time <=", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIn(List<Date> values) {
            addCriterion("ytrj_app_yangan_info.data_update_time in", values, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotIn(List<Date> values) {
            addCriterion("ytrj_app_yangan_info.data_update_time not in", values, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_yangan_info.data_update_time between", value1, value2, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_yangan_info.data_update_time not between", value1, value2, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataTimestampIsNull() {
            addCriterion("ytrj_app_yangan_info.data_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andDataTimestampIsNotNull() {
            addCriterion("ytrj_app_yangan_info.data_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimestampEqualTo(Date value) {
            addCriterion("ytrj_app_yangan_info.data_timestamp =", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampNotEqualTo(Date value) {
            addCriterion("ytrj_app_yangan_info.data_timestamp <>", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampGreaterThan(Date value) {
            addCriterion("ytrj_app_yangan_info.data_timestamp >", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_yangan_info.data_timestamp >=", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampLessThan(Date value) {
            addCriterion("ytrj_app_yangan_info.data_timestamp <", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampLessThanOrEqualTo(Date value) {
            addCriterion("ytrj_app_yangan_info.data_timestamp <=", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampIn(List<Date> values) {
            addCriterion("ytrj_app_yangan_info.data_timestamp in", values, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampNotIn(List<Date> values) {
            addCriterion("ytrj_app_yangan_info.data_timestamp not in", values, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_yangan_info.data_timestamp between", value1, value2, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampNotBetween(Date value1, Date value2) {
            addCriterion("ytrj_app_yangan_info.data_timestamp not between", value1, value2, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataStreamIsNull() {
            addCriterion("ytrj_app_yangan_info.data_stream is null");
            return (Criteria) this;
        }

        public Criteria andDataStreamIsNotNull() {
            addCriterion("ytrj_app_yangan_info.data_stream is not null");
            return (Criteria) this;
        }

        public Criteria andDataStreamEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.data_stream =", value, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamNotEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.data_stream <>", value, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamGreaterThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.data_stream >", value, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.data_stream >=", value, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamLessThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.data_stream <", value, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.data_stream <=", value, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.data_stream in", values, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamNotIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.data_stream not in", values, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.data_stream between", value1, value2, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDataStreamNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.data_stream not between", value1, value2, "dataStream");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineIsNull() {
            addCriterion("ytrj_app_yangan_info.device_online is null");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineIsNotNull() {
            addCriterion("ytrj_app_yangan_info.device_online is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_online =", value, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineNotEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_online <>", value, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineGreaterThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_online >", value, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_online >=", value, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineLessThan(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_online <", value, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("ytrj_app_yangan_info.device_online <=", value, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.device_online in", values, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineNotIn(List<Integer> values) {
            addCriterion("ytrj_app_yangan_info.device_online not in", values, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.device_online between", value1, value2, "deviceOnline");
            return (Criteria) this;
        }

        public Criteria andDeviceOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("ytrj_app_yangan_info.device_online not between", value1, value2, "deviceOnline");
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