package Service.impl;

import dao.RegisterMapper;
import org.springframework.stereotype.Service;
import Service.RegisterService;
import javax.annotation.Resource;

/**
 * Created by demo on 2017/1/21.
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private RegisterMapper registerMapper;
    public String registJudge(String userName, String password) {
        String judgeResult=registerMapper.selectByUserName(userName);
        if(judgeResult!=null)
        return judgeResult;
        return null;
    }
}
