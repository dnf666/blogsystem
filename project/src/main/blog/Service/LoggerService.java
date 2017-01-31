package Service;

import model.Logger;

/**
 * Created by demo on 2017/1/20.
 */

public interface LoggerService {
    int insertLogUser(Logger logger);
    int judgeLogger(String userName);
}
