package com.elf.sys.security.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysSecBusiRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSecBusiRoleExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andActiveFlagIsNull() {
            addCriterion("active_flag is null");
            return (Criteria) this;
        }

        public Criteria andActiveFlagIsNotNull() {
            addCriterion("active_flag is not null");
            return (Criteria) this;
        }

        public Criteria andActiveFlagEqualTo(String value) {
            addCriterion("active_flag =", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagNotEqualTo(String value) {
            addCriterion("active_flag <>", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagGreaterThan(String value) {
            addCriterion("active_flag >", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("active_flag >=", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagLessThan(String value) {
            addCriterion("active_flag <", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagLessThanOrEqualTo(String value) {
            addCriterion("active_flag <=", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagLike(String value) {
            addCriterion("active_flag like", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagNotLike(String value) {
            addCriterion("active_flag not like", value, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagIn(List<String> values) {
            addCriterion("active_flag in", values, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagNotIn(List<String> values) {
            addCriterion("active_flag not in", values, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagBetween(String value1, String value2) {
            addCriterion("active_flag between", value1, value2, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andActiveFlagNotBetween(String value1, String value2) {
            addCriterion("active_flag not between", value1, value2, "activeFlag");
            return (Criteria) this;
        }

        public Criteria andTimeBeginIsNull() {
            addCriterion("time_begin is null");
            return (Criteria) this;
        }

        public Criteria andTimeBeginIsNotNull() {
            addCriterion("time_begin is not null");
            return (Criteria) this;
        }

        public Criteria andTimeBeginEqualTo(Date value) {
            addCriterion("time_begin =", value, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginNotEqualTo(Date value) {
            addCriterion("time_begin <>", value, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginGreaterThan(Date value) {
            addCriterion("time_begin >", value, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("time_begin >=", value, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginLessThan(Date value) {
            addCriterion("time_begin <", value, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginLessThanOrEqualTo(Date value) {
            addCriterion("time_begin <=", value, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginIn(List<Date> values) {
            addCriterion("time_begin in", values, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginNotIn(List<Date> values) {
            addCriterion("time_begin not in", values, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginBetween(Date value1, Date value2) {
            addCriterion("time_begin between", value1, value2, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeBeginNotBetween(Date value1, Date value2) {
            addCriterion("time_begin not between", value1, value2, "timeBegin");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNull() {
            addCriterion("time_end is null");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNotNull() {
            addCriterion("time_end is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEndEqualTo(Date value) {
            addCriterion("time_end =", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotEqualTo(Date value) {
            addCriterion("time_end <>", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThan(Date value) {
            addCriterion("time_end >", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("time_end >=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThan(Date value) {
            addCriterion("time_end <", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("time_end <=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndIn(List<Date> values) {
            addCriterion("time_end in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotIn(List<Date> values) {
            addCriterion("time_end not in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndBetween(Date value1, Date value2) {
            addCriterion("time_end between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("time_end not between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNull() {
            addCriterion("last_updated_by is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNotNull() {
            addCriterion("last_updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByEqualTo(String value) {
            addCriterion("last_updated_by =", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotEqualTo(String value) {
            addCriterion("last_updated_by <>", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThan(String value) {
            addCriterion("last_updated_by >", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("last_updated_by >=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThan(String value) {
            addCriterion("last_updated_by <", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("last_updated_by <=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLike(String value) {
            addCriterion("last_updated_by like", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotLike(String value) {
            addCriterion("last_updated_by not like", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIn(List<String> values) {
            addCriterion("last_updated_by in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotIn(List<String> values) {
            addCriterion("last_updated_by not in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByBetween(String value1, String value2) {
            addCriterion("last_updated_by between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotBetween(String value1, String value2) {
            addCriterion("last_updated_by not between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
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