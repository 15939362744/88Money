package top.imissqin.domain.user;

import java.util.Date;

public class OpLog {
    private Integer oplogId;

    private Date oplogCreatetime;

    private Integer oplogType;

    private String oplogMsg;

    public Integer getOplogId() {
        return oplogId;
    }

    public void setOplogId(Integer oplogId) {
        this.oplogId = oplogId;
    }

    public Date getOplogCreatetime() {
        return oplogCreatetime;
    }

    public void setOplogCreatetime(Date oplogCreatetime) {
        this.oplogCreatetime = oplogCreatetime;
    }

    public Integer getOplogType() {
        return oplogType;
    }

    public void setOplogType(Integer oplogType) {
        this.oplogType = oplogType;
    }

    public String getOplogMsg() {
        return oplogMsg;
    }

    public void setOplogMsg(String oplogMsg) {
        this.oplogMsg = oplogMsg == null ? null : oplogMsg.trim();
    }
}