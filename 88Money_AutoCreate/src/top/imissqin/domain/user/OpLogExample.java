package top.imissqin.domain.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpLogExample() {
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

        public Criteria andOplogIdIsNull() {
            addCriterion("oplog_id is null");
            return (Criteria) this;
        }

        public Criteria andOplogIdIsNotNull() {
            addCriterion("oplog_id is not null");
            return (Criteria) this;
        }

        public Criteria andOplogIdEqualTo(Integer value) {
            addCriterion("oplog_id =", value, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdNotEqualTo(Integer value) {
            addCriterion("oplog_id <>", value, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdGreaterThan(Integer value) {
            addCriterion("oplog_id >", value, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oplog_id >=", value, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdLessThan(Integer value) {
            addCriterion("oplog_id <", value, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdLessThanOrEqualTo(Integer value) {
            addCriterion("oplog_id <=", value, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdIn(List<Integer> values) {
            addCriterion("oplog_id in", values, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdNotIn(List<Integer> values) {
            addCriterion("oplog_id not in", values, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdBetween(Integer value1, Integer value2) {
            addCriterion("oplog_id between", value1, value2, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oplog_id not between", value1, value2, "oplogId");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeIsNull() {
            addCriterion("oplog_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeIsNotNull() {
            addCriterion("oplog_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeEqualTo(Date value) {
            addCriterion("oplog_createtime =", value, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeNotEqualTo(Date value) {
            addCriterion("oplog_createtime <>", value, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeGreaterThan(Date value) {
            addCriterion("oplog_createtime >", value, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oplog_createtime >=", value, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeLessThan(Date value) {
            addCriterion("oplog_createtime <", value, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("oplog_createtime <=", value, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeIn(List<Date> values) {
            addCriterion("oplog_createtime in", values, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeNotIn(List<Date> values) {
            addCriterion("oplog_createtime not in", values, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeBetween(Date value1, Date value2) {
            addCriterion("oplog_createtime between", value1, value2, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("oplog_createtime not between", value1, value2, "oplogCreatetime");
            return (Criteria) this;
        }

        public Criteria andOplogTypeIsNull() {
            addCriterion("oplog_type is null");
            return (Criteria) this;
        }

        public Criteria andOplogTypeIsNotNull() {
            addCriterion("oplog_type is not null");
            return (Criteria) this;
        }

        public Criteria andOplogTypeEqualTo(Integer value) {
            addCriterion("oplog_type =", value, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeNotEqualTo(Integer value) {
            addCriterion("oplog_type <>", value, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeGreaterThan(Integer value) {
            addCriterion("oplog_type >", value, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("oplog_type >=", value, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeLessThan(Integer value) {
            addCriterion("oplog_type <", value, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("oplog_type <=", value, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeIn(List<Integer> values) {
            addCriterion("oplog_type in", values, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeNotIn(List<Integer> values) {
            addCriterion("oplog_type not in", values, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeBetween(Integer value1, Integer value2) {
            addCriterion("oplog_type between", value1, value2, "oplogType");
            return (Criteria) this;
        }

        public Criteria andOplogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("oplog_type not between", value1, value2, "oplogType");
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