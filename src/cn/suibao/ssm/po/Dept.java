package cn.suibao.ssm.po;

public class Dept {
    private Integer fdeptid;

    private String fdeptcode;

    private String fdeptname;

    private String fdepttype;

    private String fmkcode;

    private Integer fpdeptid;

    public Integer getFdeptid() {
        return fdeptid;
    }

    public void setFdeptid(Integer fdeptid) {
        this.fdeptid = fdeptid;
    }

    public String getFdeptcode() {
        return fdeptcode;
    }

    public void setFdeptcode(String fdeptcode) {
        this.fdeptcode = fdeptcode == null ? null : fdeptcode.trim();
    }

    public String getFdeptname() {
        return fdeptname;
    }

    public void setFdeptname(String fdeptname) {
        this.fdeptname = fdeptname == null ? null : fdeptname.trim();
    }

    public String getFdepttype() {
        return fdepttype;
    }

    public void setFdepttype(String fdepttype) {
        this.fdepttype = fdepttype == null ? null : fdepttype.trim();
    }

    public String getFmkcode() {
        return fmkcode;
    }

    public void setFmkcode(String fmkcode) {
        this.fmkcode = fmkcode == null ? null : fmkcode.trim();
    }

    public Integer getFpdeptid() {
        return fpdeptid;
    }

    public void setFpdeptid(Integer fpdeptid) {
        this.fpdeptid = fpdeptid;
    }
}