package top.imissqin.uicontroller.oss;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import top.imissqin.core.util.FileUtils;
import top.imissqin.core.util.OSSUtil;
import top.imissqin.core.vo.ResultVo;

@RestController
public class OssController {
    @Autowired
    private OSSUtil ossUtil;
    //文件上传
    @PostMapping("/fileup")
    public ResultVo ileup(CommonsMultipartFile file){
        String fn=FileUtils.createFileName(file.getOriginalFilename());
        String url=ossUtil.fileUp(fn,file.getBytes());
        return new ResultVo(0,fn+"@"+url,null);
    }
}
