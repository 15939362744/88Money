package top.imissqin.domain.user;

import java.util.Date;

public class LoginLog {
    private Integer lologId;

    private String lologIp;

    private Date lologCreatetime;

    private Integer uid;

    private String lologMsg;

    public Integer getLologId() {
        return lologId;
    }

    public void setLologId(Integer lologId) {
        this.lologId = lologId;
    }

    public String getLologIp() {
        return lologIp;
    }

    public void setLologIp(String lologIp) {
        this.lologIp = lologIp == null ? null : lologIp.trim();
    }

    public Date getLologCreatetime() {
        return lologCreatetime;
    }

    public void setLologCreatetime(Date lologCreatetime) {
        this.lologCreatetime = lologCreatetime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLologMsg() {
        return lologMsg;
    }

    public void setLologMsg(String lologMsg) {
        this.lologMsg = lologMsg == null ? null : lologMsg.trim();
    }
}