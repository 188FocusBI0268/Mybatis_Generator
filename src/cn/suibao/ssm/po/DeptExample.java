package cn.suibao.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andFdeptidIsNull() {
            addCriterion("fDeptId is null");
            return (Criteria) this;
        }

        public Criteria andFdeptidIsNotNull() {
            addCriterion("fDeptId is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptidEqualTo(Integer value) {
            addCriterion("fDeptId =", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotEqualTo(Integer value) {
            addCriterion("fDeptId <>", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidGreaterThan(Integer value) {
            addCriterion("fDeptId >", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fDeptId >=", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidLessThan(Integer value) {
            addCriterion("fDeptId <", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("fDeptId <=", value, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidIn(List<Integer> values) {
            addCriterion("fDeptId in", values, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotIn(List<Integer> values) {
            addCriterion("fDeptId not in", values, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidBetween(Integer value1, Integer value2) {
            addCriterion("fDeptId between", value1, value2, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("fDeptId not between", value1, value2, "fdeptid");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeIsNull() {
            addCriterion("fDeptCode is null");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeIsNotNull() {
            addCriterion("fDeptCode is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeEqualTo(String value) {
            addCriterion("fDeptCode =", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeNotEqualTo(String value) {
            addCriterion("fDeptCode <>", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeGreaterThan(String value) {
            addCriterion("fDeptCode >", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fDeptCode >=", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeLessThan(String value) {
            addCriterion("fDeptCode <", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeLessThanOrEqualTo(String value) {
            addCriterion("fDeptCode <=", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeLike(String value) {
            addCriterion("fDeptCode like", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeNotLike(String value) {
            addCriterion("fDeptCode not like", value, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeIn(List<String> values) {
            addCriterion("fDeptCode in", values, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeNotIn(List<String> values) {
            addCriterion("fDeptCode not in", values, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeBetween(String value1, String value2) {
            addCriterion("fDeptCode between", value1, value2, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptcodeNotBetween(String value1, String value2) {
            addCriterion("fDeptCode not between", value1, value2, "fdeptcode");
            return (Criteria) this;
        }

        public Criteria andFdeptnameIsNull() {
            addCriterion("fDeptName is null");
            return (Criteria) this;
        }

        public Criteria andFdeptnameIsNotNull() {
            addCriterion("fDeptName is not null");
            return (Criteria) this;
        }

        public Criteria andFdeptnameEqualTo(String value) {
            addCriterion("fDeptName =", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameNotEqualTo(String value) {
            addCriterion("fDeptName <>", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameGreaterThan(String value) {
            addCriterion("fDeptName >", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("fDeptName >=", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameLessThan(String value) {
            addCriterion("fDeptName <", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameLessThanOrEqualTo(String value) {
            addCriterion("fDeptName <=", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameLike(String value) {
            addCriterion("fDeptName like", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameNotLike(String value) {
            addCriterion("fDeptName not like", value, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameIn(List<String> values) {
            addCriterion("fDeptName in", values, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameNotIn(List<String> values) {
            addCriterion("fDeptName not in", values, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameBetween(String value1, String value2) {
            addCriterion("fDeptName between", value1, value2, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdeptnameNotBetween(String value1, String value2) {
            addCriterion("fDeptName not between", value1, value2, "fdeptname");
            return (Criteria) this;
        }

        public Criteria andFdepttypeIsNull() {
            addCriterion("fDeptType is null");
            return (Criteria) this;
        }

        public Criteria andFdepttypeIsNotNull() {
            addCriterion("fDeptType is not null");
            return (Criteria) this;
        }

        public Criteria andFdepttypeEqualTo(String value) {
            addCriterion("fDeptType =", value, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeNotEqualTo(String value) {
            addCriterion("fDeptType <>", value, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeGreaterThan(String value) {
            addCriterion("fDeptType >", value, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeGreaterThanOrEqualTo(String value) {
            addCriterion("fDeptType >=", value, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeLessThan(String value) {
            addCriterion("fDeptType <", value, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeLessThanOrEqualTo(String value) {
            addCriterion("fDeptType <=", value, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeLike(String value) {
            addCriterion("fDeptType like", value, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeNotLike(String value) {
            addCriterion("fDeptType not like", value, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeIn(List<String> values) {
            addCriterion("fDeptType in", values, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeNotIn(List<String> values) {
            addCriterion("fDeptType not in", values, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeBetween(String value1, String value2) {
            addCriterion("fDeptType between", value1, value2, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFdepttypeNotBetween(String value1, String value2) {
            addCriterion("fDeptType not between", value1, value2, "fdepttype");
            return (Criteria) this;
        }

        public Criteria andFmkcodeIsNull() {
            addCriterion("fMkCode is null");
            return (Criteria) this;
        }

        public Criteria andFmkcodeIsNotNull() {
            addCriterion("fMkCode is not null");
            return (Criteria) this;
        }

        public Criteria andFmkcodeEqualTo(String value) {
            addCriterion("fMkCode =", value, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeNotEqualTo(String value) {
            addCriterion("fMkCode <>", value, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeGreaterThan(String value) {
            addCriterion("fMkCode >", value, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fMkCode >=", value, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeLessThan(String value) {
            addCriterion("fMkCode <", value, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeLessThanOrEqualTo(String value) {
            addCriterion("fMkCode <=", value, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeLike(String value) {
            addCriterion("fMkCode like", value, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeNotLike(String value) {
            addCriterion("fMkCode not like", value, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeIn(List<String> values) {
            addCriterion("fMkCode in", values, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeNotIn(List<String> values) {
            addCriterion("fMkCode not in", values, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeBetween(String value1, String value2) {
            addCriterion("fMkCode between", value1, value2, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFmkcodeNotBetween(String value1, String value2) {
            addCriterion("fMkCode not between", value1, value2, "fmkcode");
            return (Criteria) this;
        }

        public Criteria andFpdeptidIsNull() {
            addCriterion("fPDeptID is null");
            return (Criteria) this;
        }

        public Criteria andFpdeptidIsNotNull() {
            addCriterion("fPDeptID is not null");
            return (Criteria) this;
        }

        public Criteria andFpdeptidEqualTo(Integer value) {
            addCriterion("fPDeptID =", value, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidNotEqualTo(Integer value) {
            addCriterion("fPDeptID <>", value, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidGreaterThan(Integer value) {
            addCriterion("fPDeptID >", value, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fPDeptID >=", value, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidLessThan(Integer value) {
            addCriterion("fPDeptID <", value, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("fPDeptID <=", value, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidIn(List<Integer> values) {
            addCriterion("fPDeptID in", values, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidNotIn(List<Integer> values) {
            addCriterion("fPDeptID not in", values, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidBetween(Integer value1, Integer value2) {
            addCriterion("fPDeptID between", value1, value2, "fpdeptid");
            return (Criteria) this;
        }

        public Criteria andFpdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("fPDeptID not between", value1, value2, "fpdeptid");
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