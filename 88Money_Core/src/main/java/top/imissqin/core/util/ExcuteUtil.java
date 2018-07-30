package top.imissqin.core.util;

import top.imissqin.core.vo.ResultVo;

public class ExcuteUtil {

    public static ResultVo getResultVo(int num, String msg) {
        if (num > 0) {
            return ResultVo.setOK(msg + "成功！");
        } else {
            return ResultVo.setError(msg + "失败！");
        }
    }

}
