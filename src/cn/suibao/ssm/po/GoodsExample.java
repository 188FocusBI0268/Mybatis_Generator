package cn.suibao.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andFgoodsidIsNull() {
            addCriterion("fGoodsID is null");
            return (Criteria) this;
        }

        public Criteria andFgoodsidIsNotNull() {
            addCriterion("fGoodsID is not null");
            return (Criteria) this;
        }

        public Criteria andFgoodsidEqualTo(Integer value) {
            addCriterion("fGoodsID =", value, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidNotEqualTo(Integer value) {
            addCriterion("fGoodsID <>", value, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidGreaterThan(Integer value) {
            addCriterion("fGoodsID >", value, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fGoodsID >=", value, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidLessThan(Integer value) {
            addCriterion("fGoodsID <", value, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("fGoodsID <=", value, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidIn(List<Integer> values) {
            addCriterion("fGoodsID in", values, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidNotIn(List<Integer> values) {
            addCriterion("fGoodsID not in", values, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidBetween(Integer value1, Integer value2) {
            addCriterion("fGoodsID between", value1, value2, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("fGoodsID not between", value1, value2, "fgoodsid");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeIsNull() {
            addCriterion("fGoodsCode is null");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeIsNotNull() {
            addCriterion("fGoodsCode is not null");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeEqualTo(String value) {
            addCriterion("fGoodsCode =", value, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeNotEqualTo(String value) {
            addCriterion("fGoodsCode <>", value, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeGreaterThan(String value) {
            addCriterion("fGoodsCode >", value, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeGreaterThanOrEqualTo(String value) {
            addCriterion("fGoodsCode >=", value, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeLessThan(String value) {
            addCriterion("fGoodsCode <", value, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeLessThanOrEqualTo(String value) {
            addCriterion("fGoodsCode <=", value, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeLike(String value) {
            addCriterion("fGoodsCode like", value, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeNotLike(String value) {
            addCriterion("fGoodsCode not like", value, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeIn(List<String> values) {
            addCriterion("fGoodsCode in", values, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeNotIn(List<String> values) {
            addCriterion("fGoodsCode not in", values, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeBetween(String value1, String value2) {
            addCriterion("fGoodsCode between", value1, value2, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodscodeNotBetween(String value1, String value2) {
            addCriterion("fGoodsCode not between", value1, value2, "fgoodscode");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameIsNull() {
            addCriterion("fGoodsName is null");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameIsNotNull() {
            addCriterion("fGoodsName is not null");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameEqualTo(String value) {
            addCriterion("fGoodsName =", value, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameNotEqualTo(String value) {
            addCriterion("fGoodsName <>", value, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameGreaterThan(String value) {
            addCriterion("fGoodsName >", value, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("fGoodsName >=", value, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameLessThan(String value) {
            addCriterion("fGoodsName <", value, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameLessThanOrEqualTo(String value) {
            addCriterion("fGoodsName <=", value, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameLike(String value) {
            addCriterion("fGoodsName like", value, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameNotLike(String value) {
            addCriterion("fGoodsName not like", value, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameIn(List<String> values) {
            addCriterion("fGoodsName in", values, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameNotIn(List<String> values) {
            addCriterion("fGoodsName not in", values, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameBetween(String value1, String value2) {
            addCriterion("fGoodsName between", value1, value2, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodsnameNotBetween(String value1, String value2) {
            addCriterion("fGoodsName not between", value1, value2, "fgoodsname");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidIsNull() {
            addCriterion("fGoodsTypeID is null");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidIsNotNull() {
            addCriterion("fGoodsTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidEqualTo(String value) {
            addCriterion("fGoodsTypeID =", value, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidNotEqualTo(String value) {
            addCriterion("fGoodsTypeID <>", value, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidGreaterThan(String value) {
            addCriterion("fGoodsTypeID >", value, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidGreaterThanOrEqualTo(String value) {
            addCriterion("fGoodsTypeID >=", value, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidLessThan(String value) {
            addCriterion("fGoodsTypeID <", value, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidLessThanOrEqualTo(String value) {
            addCriterion("fGoodsTypeID <=", value, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidLike(String value) {
            addCriterion("fGoodsTypeID like", value, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidNotLike(String value) {
            addCriterion("fGoodsTypeID not like", value, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidIn(List<String> values) {
            addCriterion("fGoodsTypeID in", values, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidNotIn(List<String> values) {
            addCriterion("fGoodsTypeID not in", values, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidBetween(String value1, String value2) {
            addCriterion("fGoodsTypeID between", value1, value2, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeidNotBetween(String value1, String value2) {
            addCriterion("fGoodsTypeID not between", value1, value2, "fgoodstypeid");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeIsNull() {
            addCriterion("fGoodsType is null");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeIsNotNull() {
            addCriterion("fGoodsType is not null");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeEqualTo(String value) {
            addCriterion("fGoodsType =", value, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeNotEqualTo(String value) {
            addCriterion("fGoodsType <>", value, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeGreaterThan(String value) {
            addCriterion("fGoodsType >", value, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeGreaterThanOrEqualTo(String value) {
            addCriterion("fGoodsType >=", value, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeLessThan(String value) {
            addCriterion("fGoodsType <", value, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeLessThanOrEqualTo(String value) {
            addCriterion("fGoodsType <=", value, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeLike(String value) {
            addCriterion("fGoodsType like", value, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeNotLike(String value) {
            addCriterion("fGoodsType not like", value, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeIn(List<String> values) {
            addCriterion("fGoodsType in", values, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeNotIn(List<String> values) {
            addCriterion("fGoodsType not in", values, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeBetween(String value1, String value2) {
            addCriterion("fGoodsType between", value1, value2, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFgoodstypeNotBetween(String value1, String value2) {
            addCriterion("fGoodsType not between", value1, value2, "fgoodstype");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeIsNull() {
            addCriterion("fBrandCode is null");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeIsNotNull() {
            addCriterion("fBrandCode is not null");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeEqualTo(String value) {
            addCriterion("fBrandCode =", value, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeNotEqualTo(String value) {
            addCriterion("fBrandCode <>", value, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeGreaterThan(String value) {
            addCriterion("fBrandCode >", value, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fBrandCode >=", value, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeLessThan(String value) {
            addCriterion("fBrandCode <", value, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeLessThanOrEqualTo(String value) {
            addCriterion("fBrandCode <=", value, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeLike(String value) {
            addCriterion("fBrandCode like", value, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeNotLike(String value) {
            addCriterion("fBrandCode not like", value, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeIn(List<String> values) {
            addCriterion("fBrandCode in", values, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeNotIn(List<String> values) {
            addCriterion("fBrandCode not in", values, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeBetween(String value1, String value2) {
            addCriterion("fBrandCode between", value1, value2, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandcodeNotBetween(String value1, String value2) {
            addCriterion("fBrandCode not between", value1, value2, "fbrandcode");
            return (Criteria) this;
        }

        public Criteria andFbrandnameIsNull() {
            addCriterion("fBrandName is null");
            return (Criteria) this;
        }

        public Criteria andFbrandnameIsNotNull() {
            addCriterion("fBrandName is not null");
            return (Criteria) this;
        }

        public Criteria andFbrandnameEqualTo(String value) {
            addCriterion("fBrandName =", value, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameNotEqualTo(String value) {
            addCriterion("fBrandName <>", value, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameGreaterThan(String value) {
            addCriterion("fBrandName >", value, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("fBrandName >=", value, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameLessThan(String value) {
            addCriterion("fBrandName <", value, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameLessThanOrEqualTo(String value) {
            addCriterion("fBrandName <=", value, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameLike(String value) {
            addCriterion("fBrandName like", value, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameNotLike(String value) {
            addCriterion("fBrandName not like", value, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameIn(List<String> values) {
            addCriterion("fBrandName in", values, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameNotIn(List<String> values) {
            addCriterion("fBrandName not in", values, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameBetween(String value1, String value2) {
            addCriterion("fBrandName between", value1, value2, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFbrandnameNotBetween(String value1, String value2) {
            addCriterion("fBrandName not between", value1, value2, "fbrandname");
            return (Criteria) this;
        }

        public Criteria andFsortcodeIsNull() {
            addCriterion("fSortCode is null");
            return (Criteria) this;
        }

        public Criteria andFsortcodeIsNotNull() {
            addCriterion("fSortCode is not null");
            return (Criteria) this;
        }

        public Criteria andFsortcodeEqualTo(String value) {
            addCriterion("fSortCode =", value, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeNotEqualTo(String value) {
            addCriterion("fSortCode <>", value, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeGreaterThan(String value) {
            addCriterion("fSortCode >", value, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fSortCode >=", value, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeLessThan(String value) {
            addCriterion("fSortCode <", value, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeLessThanOrEqualTo(String value) {
            addCriterion("fSortCode <=", value, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeLike(String value) {
            addCriterion("fSortCode like", value, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeNotLike(String value) {
            addCriterion("fSortCode not like", value, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeIn(List<String> values) {
            addCriterion("fSortCode in", values, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeNotIn(List<String> values) {
            addCriterion("fSortCode not in", values, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeBetween(String value1, String value2) {
            addCriterion("fSortCode between", value1, value2, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortcodeNotBetween(String value1, String value2) {
            addCriterion("fSortCode not between", value1, value2, "fsortcode");
            return (Criteria) this;
        }

        public Criteria andFsortnameIsNull() {
            addCriterion("fSortName is null");
            return (Criteria) this;
        }

        public Criteria andFsortnameIsNotNull() {
            addCriterion("fSortName is not null");
            return (Criteria) this;
        }

        public Criteria andFsortnameEqualTo(String value) {
            addCriterion("fSortName =", value, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameNotEqualTo(String value) {
            addCriterion("fSortName <>", value, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameGreaterThan(String value) {
            addCriterion("fSortName >", value, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameGreaterThanOrEqualTo(String value) {
            addCriterion("fSortName >=", value, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameLessThan(String value) {
            addCriterion("fSortName <", value, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameLessThanOrEqualTo(String value) {
            addCriterion("fSortName <=", value, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameLike(String value) {
            addCriterion("fSortName like", value, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameNotLike(String value) {
            addCriterion("fSortName not like", value, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameIn(List<String> values) {
            addCriterion("fSortName in", values, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameNotIn(List<String> values) {
            addCriterion("fSortName not in", values, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameBetween(String value1, String value2) {
            addCriterion("fSortName between", value1, value2, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFsortnameNotBetween(String value1, String value2) {
            addCriterion("fSortName not between", value1, value2, "fsortname");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeIsNull() {
            addCriterion("fGrpCode is null");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeIsNotNull() {
            addCriterion("fGrpCode is not null");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeEqualTo(String value) {
            addCriterion("fGrpCode =", value, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeNotEqualTo(String value) {
            addCriterion("fGrpCode <>", value, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeGreaterThan(String value) {
            addCriterion("fGrpCode >", value, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fGrpCode >=", value, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeLessThan(String value) {
            addCriterion("fGrpCode <", value, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeLessThanOrEqualTo(String value) {
            addCriterion("fGrpCode <=", value, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeLike(String value) {
            addCriterion("fGrpCode like", value, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeNotLike(String value) {
            addCriterion("fGrpCode not like", value, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeIn(List<String> values) {
            addCriterion("fGrpCode in", values, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeNotIn(List<String> values) {
            addCriterion("fGrpCode not in", values, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeBetween(String value1, String value2) {
            addCriterion("fGrpCode between", value1, value2, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpcodeNotBetween(String value1, String value2) {
            addCriterion("fGrpCode not between", value1, value2, "fgrpcode");
            return (Criteria) this;
        }

        public Criteria andFgrpnameIsNull() {
            addCriterion("fGrpName is null");
            return (Criteria) this;
        }

        public Criteria andFgrpnameIsNotNull() {
            addCriterion("fGrpName is not null");
            return (Criteria) this;
        }

        public Criteria andFgrpnameEqualTo(String value) {
            addCriterion("fGrpName =", value, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameNotEqualTo(String value) {
            addCriterion("fGrpName <>", value, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameGreaterThan(String value) {
            addCriterion("fGrpName >", value, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameGreaterThanOrEqualTo(String value) {
            addCriterion("fGrpName >=", value, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameLessThan(String value) {
            addCriterion("fGrpName <", value, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameLessThanOrEqualTo(String value) {
            addCriterion("fGrpName <=", value, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameLike(String value) {
            addCriterion("fGrpName like", value, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameNotLike(String value) {
            addCriterion("fGrpName not like", value, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameIn(List<String> values) {
            addCriterion("fGrpName in", values, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameNotIn(List<String> values) {
            addCriterion("fGrpName not in", values, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameBetween(String value1, String value2) {
            addCriterion("fGrpName between", value1, value2, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFgrpnameNotBetween(String value1, String value2) {
            addCriterion("fGrpName not between", value1, value2, "fgrpname");
            return (Criteria) this;
        }

        public Criteria andFkitcodeIsNull() {
            addCriterion("fKitCode is null");
            return (Criteria) this;
        }

        public Criteria andFkitcodeIsNotNull() {
            addCriterion("fKitCode is not null");
            return (Criteria) this;
        }

        public Criteria andFkitcodeEqualTo(String value) {
            addCriterion("fKitCode =", value, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeNotEqualTo(String value) {
            addCriterion("fKitCode <>", value, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeGreaterThan(String value) {
            addCriterion("fKitCode >", value, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fKitCode >=", value, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeLessThan(String value) {
            addCriterion("fKitCode <", value, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeLessThanOrEqualTo(String value) {
            addCriterion("fKitCode <=", value, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeLike(String value) {
            addCriterion("fKitCode like", value, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeNotLike(String value) {
            addCriterion("fKitCode not like", value, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeIn(List<String> values) {
            addCriterion("fKitCode in", values, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeNotIn(List<String> values) {
            addCriterion("fKitCode not in", values, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeBetween(String value1, String value2) {
            addCriterion("fKitCode between", value1, value2, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitcodeNotBetween(String value1, String value2) {
            addCriterion("fKitCode not between", value1, value2, "fkitcode");
            return (Criteria) this;
        }

        public Criteria andFkitnameIsNull() {
            addCriterion("fKitName is null");
            return (Criteria) this;
        }

        public Criteria andFkitnameIsNotNull() {
            addCriterion("fKitName is not null");
            return (Criteria) this;
        }

        public Criteria andFkitnameEqualTo(String value) {
            addCriterion("fKitName =", value, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameNotEqualTo(String value) {
            addCriterion("fKitName <>", value, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameGreaterThan(String value) {
            addCriterion("fKitName >", value, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameGreaterThanOrEqualTo(String value) {
            addCriterion("fKitName >=", value, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameLessThan(String value) {
            addCriterion("fKitName <", value, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameLessThanOrEqualTo(String value) {
            addCriterion("fKitName <=", value, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameLike(String value) {
            addCriterion("fKitName like", value, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameNotLike(String value) {
            addCriterion("fKitName not like", value, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameIn(List<String> values) {
            addCriterion("fKitName in", values, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameNotIn(List<String> values) {
            addCriterion("fKitName not in", values, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameBetween(String value1, String value2) {
            addCriterion("fKitName between", value1, value2, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFkitnameNotBetween(String value1, String value2) {
            addCriterion("fKitName not between", value1, value2, "fkitname");
            return (Criteria) this;
        }

        public Criteria andFstylecodeIsNull() {
            addCriterion("fStyleCode is null");
            return (Criteria) this;
        }

        public Criteria andFstylecodeIsNotNull() {
            addCriterion("fStyleCode is not null");
            return (Criteria) this;
        }

        public Criteria andFstylecodeEqualTo(String value) {
            addCriterion("fStyleCode =", value, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeNotEqualTo(String value) {
            addCriterion("fStyleCode <>", value, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeGreaterThan(String value) {
            addCriterion("fStyleCode >", value, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeGreaterThanOrEqualTo(String value) {
            addCriterion("fStyleCode >=", value, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeLessThan(String value) {
            addCriterion("fStyleCode <", value, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeLessThanOrEqualTo(String value) {
            addCriterion("fStyleCode <=", value, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeLike(String value) {
            addCriterion("fStyleCode like", value, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeNotLike(String value) {
            addCriterion("fStyleCode not like", value, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeIn(List<String> values) {
            addCriterion("fStyleCode in", values, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeNotIn(List<String> values) {
            addCriterion("fStyleCode not in", values, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeBetween(String value1, String value2) {
            addCriterion("fStyleCode between", value1, value2, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylecodeNotBetween(String value1, String value2) {
            addCriterion("fStyleCode not between", value1, value2, "fstylecode");
            return (Criteria) this;
        }

        public Criteria andFstylenameIsNull() {
            addCriterion("fStyleName is null");
            return (Criteria) this;
        }

        public Criteria andFstylenameIsNotNull() {
            addCriterion("fStyleName is not null");
            return (Criteria) this;
        }

        public Criteria andFstylenameEqualTo(String value) {
            addCriterion("fStyleName =", value, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameNotEqualTo(String value) {
            addCriterion("fStyleName <>", value, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameGreaterThan(String value) {
            addCriterion("fStyleName >", value, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameGreaterThanOrEqualTo(String value) {
            addCriterion("fStyleName >=", value, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameLessThan(String value) {
            addCriterion("fStyleName <", value, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameLessThanOrEqualTo(String value) {
            addCriterion("fStyleName <=", value, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameLike(String value) {
            addCriterion("fStyleName like", value, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameNotLike(String value) {
            addCriterion("fStyleName not like", value, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameIn(List<String> values) {
            addCriterion("fStyleName in", values, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameNotIn(List<String> values) {
            addCriterion("fStyleName not in", values, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameBetween(String value1, String value2) {
            addCriterion("fStyleName between", value1, value2, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFstylenameNotBetween(String value1, String value2) {
            addCriterion("fStyleName not between", value1, value2, "fstylename");
            return (Criteria) this;
        }

        public Criteria andFclrcodeIsNull() {
            addCriterion("fClrCode is null");
            return (Criteria) this;
        }

        public Criteria andFclrcodeIsNotNull() {
            addCriterion("fClrCode is not null");
            return (Criteria) this;
        }

        public Criteria andFclrcodeEqualTo(String value) {
            addCriterion("fClrCode =", value, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeNotEqualTo(String value) {
            addCriterion("fClrCode <>", value, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeGreaterThan(String value) {
            addCriterion("fClrCode >", value, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fClrCode >=", value, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeLessThan(String value) {
            addCriterion("fClrCode <", value, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeLessThanOrEqualTo(String value) {
            addCriterion("fClrCode <=", value, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeLike(String value) {
            addCriterion("fClrCode like", value, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeNotLike(String value) {
            addCriterion("fClrCode not like", value, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeIn(List<String> values) {
            addCriterion("fClrCode in", values, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeNotIn(List<String> values) {
            addCriterion("fClrCode not in", values, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeBetween(String value1, String value2) {
            addCriterion("fClrCode between", value1, value2, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrcodeNotBetween(String value1, String value2) {
            addCriterion("fClrCode not between", value1, value2, "fclrcode");
            return (Criteria) this;
        }

        public Criteria andFclrnameIsNull() {
            addCriterion("fClrName is null");
            return (Criteria) this;
        }

        public Criteria andFclrnameIsNotNull() {
            addCriterion("fClrName is not null");
            return (Criteria) this;
        }

        public Criteria andFclrnameEqualTo(String value) {
            addCriterion("fClrName =", value, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameNotEqualTo(String value) {
            addCriterion("fClrName <>", value, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameGreaterThan(String value) {
            addCriterion("fClrName >", value, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameGreaterThanOrEqualTo(String value) {
            addCriterion("fClrName >=", value, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameLessThan(String value) {
            addCriterion("fClrName <", value, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameLessThanOrEqualTo(String value) {
            addCriterion("fClrName <=", value, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameLike(String value) {
            addCriterion("fClrName like", value, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameNotLike(String value) {
            addCriterion("fClrName not like", value, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameIn(List<String> values) {
            addCriterion("fClrName in", values, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameNotIn(List<String> values) {
            addCriterion("fClrName not in", values, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameBetween(String value1, String value2) {
            addCriterion("fClrName between", value1, value2, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFclrnameNotBetween(String value1, String value2) {
            addCriterion("fClrName not between", value1, value2, "fclrname");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeIsNull() {
            addCriterion("fRmQltCode is null");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeIsNotNull() {
            addCriterion("fRmQltCode is not null");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeEqualTo(String value) {
            addCriterion("fRmQltCode =", value, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeNotEqualTo(String value) {
            addCriterion("fRmQltCode <>", value, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeGreaterThan(String value) {
            addCriterion("fRmQltCode >", value, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeGreaterThanOrEqualTo(String value) {
            addCriterion("fRmQltCode >=", value, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeLessThan(String value) {
            addCriterion("fRmQltCode <", value, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeLessThanOrEqualTo(String value) {
            addCriterion("fRmQltCode <=", value, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeLike(String value) {
            addCriterion("fRmQltCode like", value, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeNotLike(String value) {
            addCriterion("fRmQltCode not like", value, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeIn(List<String> values) {
            addCriterion("fRmQltCode in", values, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeNotIn(List<String> values) {
            addCriterion("fRmQltCode not in", values, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeBetween(String value1, String value2) {
            addCriterion("fRmQltCode between", value1, value2, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltcodeNotBetween(String value1, String value2) {
            addCriterion("fRmQltCode not between", value1, value2, "frmqltcode");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameIsNull() {
            addCriterion("fRmQltName is null");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameIsNotNull() {
            addCriterion("fRmQltName is not null");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameEqualTo(String value) {
            addCriterion("fRmQltName =", value, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameNotEqualTo(String value) {
            addCriterion("fRmQltName <>", value, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameGreaterThan(String value) {
            addCriterion("fRmQltName >", value, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameGreaterThanOrEqualTo(String value) {
            addCriterion("fRmQltName >=", value, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameLessThan(String value) {
            addCriterion("fRmQltName <", value, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameLessThanOrEqualTo(String value) {
            addCriterion("fRmQltName <=", value, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameLike(String value) {
            addCriterion("fRmQltName like", value, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameNotLike(String value) {
            addCriterion("fRmQltName not like", value, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameIn(List<String> values) {
            addCriterion("fRmQltName in", values, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameNotIn(List<String> values) {
            addCriterion("fRmQltName not in", values, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameBetween(String value1, String value2) {
            addCriterion("fRmQltName between", value1, value2, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFrmqltnameNotBetween(String value1, String value2) {
            addCriterion("fRmQltName not between", value1, value2, "frmqltname");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeIsNull() {
            addCriterion("fDesignCode is null");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeIsNotNull() {
            addCriterion("fDesignCode is not null");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeEqualTo(String value) {
            addCriterion("fDesignCode =", value, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeNotEqualTo(String value) {
            addCriterion("fDesignCode <>", value, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeGreaterThan(String value) {
            addCriterion("fDesignCode >", value, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeGreaterThanOrEqualTo(String value) {
            addCriterion("fDesignCode >=", value, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeLessThan(String value) {
            addCriterion("fDesignCode <", value, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeLessThanOrEqualTo(String value) {
            addCriterion("fDesignCode <=", value, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeLike(String value) {
            addCriterion("fDesignCode like", value, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeNotLike(String value) {
            addCriterion("fDesignCode not like", value, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeIn(List<String> values) {
            addCriterion("fDesignCode in", values, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeNotIn(List<String> values) {
            addCriterion("fDesignCode not in", values, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeBetween(String value1, String value2) {
            addCriterion("fDesignCode between", value1, value2, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesigncodeNotBetween(String value1, String value2) {
            addCriterion("fDesignCode not between", value1, value2, "fdesigncode");
            return (Criteria) this;
        }

        public Criteria andFdesignnameIsNull() {
            addCriterion("fDesignName is null");
            return (Criteria) this;
        }

        public Criteria andFdesignnameIsNotNull() {
            addCriterion("fDesignName is not null");
            return (Criteria) this;
        }

        public Criteria andFdesignnameEqualTo(String value) {
            addCriterion("fDesignName =", value, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameNotEqualTo(String value) {
            addCriterion("fDesignName <>", value, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameGreaterThan(String value) {
            addCriterion("fDesignName >", value, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameGreaterThanOrEqualTo(String value) {
            addCriterion("fDesignName >=", value, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameLessThan(String value) {
            addCriterion("fDesignName <", value, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameLessThanOrEqualTo(String value) {
            addCriterion("fDesignName <=", value, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameLike(String value) {
            addCriterion("fDesignName like", value, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameNotLike(String value) {
            addCriterion("fDesignName not like", value, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameIn(List<String> values) {
            addCriterion("fDesignName in", values, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameNotIn(List<String> values) {
            addCriterion("fDesignName not in", values, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameBetween(String value1, String value2) {
            addCriterion("fDesignName between", value1, value2, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdesignnameNotBetween(String value1, String value2) {
            addCriterion("fDesignName not between", value1, value2, "fdesignname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeIsNull() {
            addCriterion("fDevPropertyCode is null");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeIsNotNull() {
            addCriterion("fDevPropertyCode is not null");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeEqualTo(String value) {
            addCriterion("fDevPropertyCode =", value, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeNotEqualTo(String value) {
            addCriterion("fDevPropertyCode <>", value, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeGreaterThan(String value) {
            addCriterion("fDevPropertyCode >", value, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeGreaterThanOrEqualTo(String value) {
            addCriterion("fDevPropertyCode >=", value, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeLessThan(String value) {
            addCriterion("fDevPropertyCode <", value, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeLessThanOrEqualTo(String value) {
            addCriterion("fDevPropertyCode <=", value, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeLike(String value) {
            addCriterion("fDevPropertyCode like", value, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeNotLike(String value) {
            addCriterion("fDevPropertyCode not like", value, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeIn(List<String> values) {
            addCriterion("fDevPropertyCode in", values, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeNotIn(List<String> values) {
            addCriterion("fDevPropertyCode not in", values, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeBetween(String value1, String value2) {
            addCriterion("fDevPropertyCode between", value1, value2, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertycodeNotBetween(String value1, String value2) {
            addCriterion("fDevPropertyCode not between", value1, value2, "fdevpropertycode");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameIsNull() {
            addCriterion("fDevPropertyName is null");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameIsNotNull() {
            addCriterion("fDevPropertyName is not null");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameEqualTo(String value) {
            addCriterion("fDevPropertyName =", value, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameNotEqualTo(String value) {
            addCriterion("fDevPropertyName <>", value, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameGreaterThan(String value) {
            addCriterion("fDevPropertyName >", value, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameGreaterThanOrEqualTo(String value) {
            addCriterion("fDevPropertyName >=", value, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameLessThan(String value) {
            addCriterion("fDevPropertyName <", value, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameLessThanOrEqualTo(String value) {
            addCriterion("fDevPropertyName <=", value, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameLike(String value) {
            addCriterion("fDevPropertyName like", value, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameNotLike(String value) {
            addCriterion("fDevPropertyName not like", value, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameIn(List<String> values) {
            addCriterion("fDevPropertyName in", values, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameNotIn(List<String> values) {
            addCriterion("fDevPropertyName not in", values, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameBetween(String value1, String value2) {
            addCriterion("fDevPropertyName between", value1, value2, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFdevpropertynameNotBetween(String value1, String value2) {
            addCriterion("fDevPropertyName not between", value1, value2, "fdevpropertyname");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeIsNull() {
            addCriterion("fFgTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeIsNotNull() {
            addCriterion("fFgTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeEqualTo(String value) {
            addCriterion("fFgTypeCode =", value, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeNotEqualTo(String value) {
            addCriterion("fFgTypeCode <>", value, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeGreaterThan(String value) {
            addCriterion("fFgTypeCode >", value, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("fFgTypeCode >=", value, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeLessThan(String value) {
            addCriterion("fFgTypeCode <", value, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeLessThanOrEqualTo(String value) {
            addCriterion("fFgTypeCode <=", value, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeLike(String value) {
            addCriterion("fFgTypeCode like", value, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeNotLike(String value) {
            addCriterion("fFgTypeCode not like", value, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeIn(List<String> values) {
            addCriterion("fFgTypeCode in", values, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeNotIn(List<String> values) {
            addCriterion("fFgTypeCode not in", values, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeBetween(String value1, String value2) {
            addCriterion("fFgTypeCode between", value1, value2, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypecodeNotBetween(String value1, String value2) {
            addCriterion("fFgTypeCode not between", value1, value2, "ffgtypecode");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameIsNull() {
            addCriterion("fFgTypeName is null");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameIsNotNull() {
            addCriterion("fFgTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameEqualTo(String value) {
            addCriterion("fFgTypeName =", value, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameNotEqualTo(String value) {
            addCriterion("fFgTypeName <>", value, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameGreaterThan(String value) {
            addCriterion("fFgTypeName >", value, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("fFgTypeName >=", value, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameLessThan(String value) {
            addCriterion("fFgTypeName <", value, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameLessThanOrEqualTo(String value) {
            addCriterion("fFgTypeName <=", value, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameLike(String value) {
            addCriterion("fFgTypeName like", value, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameNotLike(String value) {
            addCriterion("fFgTypeName not like", value, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameIn(List<String> values) {
            addCriterion("fFgTypeName in", values, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameNotIn(List<String> values) {
            addCriterion("fFgTypeName not in", values, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameBetween(String value1, String value2) {
            addCriterion("fFgTypeName between", value1, value2, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFfgtypenameNotBetween(String value1, String value2) {
            addCriterion("fFgTypeName not between", value1, value2, "ffgtypename");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeIsNull() {
            addCriterion("fSellFrequencyCode is null");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeIsNotNull() {
            addCriterion("fSellFrequencyCode is not null");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeEqualTo(String value) {
            addCriterion("fSellFrequencyCode =", value, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeNotEqualTo(String value) {
            addCriterion("fSellFrequencyCode <>", value, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeGreaterThan(String value) {
            addCriterion("fSellFrequencyCode >", value, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeGreaterThanOrEqualTo(String value) {
            addCriterion("fSellFrequencyCode >=", value, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeLessThan(String value) {
            addCriterion("fSellFrequencyCode <", value, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeLessThanOrEqualTo(String value) {
            addCriterion("fSellFrequencyCode <=", value, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeLike(String value) {
            addCriterion("fSellFrequencyCode like", value, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeNotLike(String value) {
            addCriterion("fSellFrequencyCode not like", value, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeIn(List<String> values) {
            addCriterion("fSellFrequencyCode in", values, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeNotIn(List<String> values) {
            addCriterion("fSellFrequencyCode not in", values, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeBetween(String value1, String value2) {
            addCriterion("fSellFrequencyCode between", value1, value2, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencycodeNotBetween(String value1, String value2) {
            addCriterion("fSellFrequencyCode not between", value1, value2, "fsellfrequencycode");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameIsNull() {
            addCriterion("fSellFrequencyName is null");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameIsNotNull() {
            addCriterion("fSellFrequencyName is not null");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameEqualTo(String value) {
            addCriterion("fSellFrequencyName =", value, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameNotEqualTo(String value) {
            addCriterion("fSellFrequencyName <>", value, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameGreaterThan(String value) {
            addCriterion("fSellFrequencyName >", value, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameGreaterThanOrEqualTo(String value) {
            addCriterion("fSellFrequencyName >=", value, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameLessThan(String value) {
            addCriterion("fSellFrequencyName <", value, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameLessThanOrEqualTo(String value) {
            addCriterion("fSellFrequencyName <=", value, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameLike(String value) {
            addCriterion("fSellFrequencyName like", value, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameNotLike(String value) {
            addCriterion("fSellFrequencyName not like", value, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameIn(List<String> values) {
            addCriterion("fSellFrequencyName in", values, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameNotIn(List<String> values) {
            addCriterion("fSellFrequencyName not in", values, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameBetween(String value1, String value2) {
            addCriterion("fSellFrequencyName between", value1, value2, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsellfrequencynameNotBetween(String value1, String value2) {
            addCriterion("fSellFrequencyName not between", value1, value2, "fsellfrequencyname");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeIsNull() {
            addCriterion("fSaleTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeIsNotNull() {
            addCriterion("fSaleTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeEqualTo(String value) {
            addCriterion("fSaleTypeCode =", value, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeNotEqualTo(String value) {
            addCriterion("fSaleTypeCode <>", value, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeGreaterThan(String value) {
            addCriterion("fSaleTypeCode >", value, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("fSaleTypeCode >=", value, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeLessThan(String value) {
            addCriterion("fSaleTypeCode <", value, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeLessThanOrEqualTo(String value) {
            addCriterion("fSaleTypeCode <=", value, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeLike(String value) {
            addCriterion("fSaleTypeCode like", value, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeNotLike(String value) {
            addCriterion("fSaleTypeCode not like", value, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeIn(List<String> values) {
            addCriterion("fSaleTypeCode in", values, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeNotIn(List<String> values) {
            addCriterion("fSaleTypeCode not in", values, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeBetween(String value1, String value2) {
            addCriterion("fSaleTypeCode between", value1, value2, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypecodeNotBetween(String value1, String value2) {
            addCriterion("fSaleTypeCode not between", value1, value2, "fsaletypecode");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameIsNull() {
            addCriterion("fSaleTypeName is null");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameIsNotNull() {
            addCriterion("fSaleTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameEqualTo(String value) {
            addCriterion("fSaleTypeName =", value, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameNotEqualTo(String value) {
            addCriterion("fSaleTypeName <>", value, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameGreaterThan(String value) {
            addCriterion("fSaleTypeName >", value, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameGreaterThanOrEqualTo(String value) {
            addCriterion("fSaleTypeName >=", value, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameLessThan(String value) {
            addCriterion("fSaleTypeName <", value, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameLessThanOrEqualTo(String value) {
            addCriterion("fSaleTypeName <=", value, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameLike(String value) {
            addCriterion("fSaleTypeName like", value, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameNotLike(String value) {
            addCriterion("fSaleTypeName not like", value, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameIn(List<String> values) {
            addCriterion("fSaleTypeName in", values, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameNotIn(List<String> values) {
            addCriterion("fSaleTypeName not in", values, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameBetween(String value1, String value2) {
            addCriterion("fSaleTypeName between", value1, value2, "fsaletypename");
            return (Criteria) this;
        }

        public Criteria andFsaletypenameNotBetween(String value1, String value2) {
            addCriterion("fSaleTypeName not between", value1, value2, "fsaletypename");
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

        public Criteria andClothcodeIsNull() {
            addCriterion("ClothCode is null");
            return (Criteria) this;
        }

        public Criteria andClothcodeIsNotNull() {
            addCriterion("ClothCode is not null");
            return (Criteria) this;
        }

        public Criteria andClothcodeEqualTo(String value) {
            addCriterion("ClothCode =", value, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeNotEqualTo(String value) {
            addCriterion("ClothCode <>", value, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeGreaterThan(String value) {
            addCriterion("ClothCode >", value, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ClothCode >=", value, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeLessThan(String value) {
            addCriterion("ClothCode <", value, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeLessThanOrEqualTo(String value) {
            addCriterion("ClothCode <=", value, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeLike(String value) {
            addCriterion("ClothCode like", value, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeNotLike(String value) {
            addCriterion("ClothCode not like", value, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeIn(List<String> values) {
            addCriterion("ClothCode in", values, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeNotIn(List<String> values) {
            addCriterion("ClothCode not in", values, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeBetween(String value1, String value2) {
            addCriterion("ClothCode between", value1, value2, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothcodeNotBetween(String value1, String value2) {
            addCriterion("ClothCode not between", value1, value2, "clothcode");
            return (Criteria) this;
        }

        public Criteria andClothnameIsNull() {
            addCriterion("ClothName is null");
            return (Criteria) this;
        }

        public Criteria andClothnameIsNotNull() {
            addCriterion("ClothName is not null");
            return (Criteria) this;
        }

        public Criteria andClothnameEqualTo(String value) {
            addCriterion("ClothName =", value, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameNotEqualTo(String value) {
            addCriterion("ClothName <>", value, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameGreaterThan(String value) {
            addCriterion("ClothName >", value, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClothName >=", value, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameLessThan(String value) {
            addCriterion("ClothName <", value, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameLessThanOrEqualTo(String value) {
            addCriterion("ClothName <=", value, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameLike(String value) {
            addCriterion("ClothName like", value, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameNotLike(String value) {
            addCriterion("ClothName not like", value, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameIn(List<String> values) {
            addCriterion("ClothName in", values, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameNotIn(List<String> values) {
            addCriterion("ClothName not in", values, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameBetween(String value1, String value2) {
            addCriterion("ClothName between", value1, value2, "clothname");
            return (Criteria) this;
        }

        public Criteria andClothnameNotBetween(String value1, String value2) {
            addCriterion("ClothName not between", value1, value2, "clothname");
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