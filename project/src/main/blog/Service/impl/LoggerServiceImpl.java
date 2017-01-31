package Service.impl;

import Service.LoggerService;
import dao.LoggerMapper;
import dao.RegisterMapper;
import model.Logger;
import model.Register;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by demo on 2017/1/20.
 */
@Service
public class LoggerServiceImpl implements LoggerService {
    @Resource
    private LoggerMapper loggerMapper;

    public int insertLogUser(Logger logger) {
        loggerMapper.insert(logger);
        return 1;
    }

    public int judgeLogger(String userName) {
            if(loggerMapper.selectByUserName(userName)==null)
            return 1;
            return 0;


    }


}
