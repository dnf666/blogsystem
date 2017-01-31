package dao;

import model.Logger;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Logger record);
    String selectByUserName(String userName);

    int insertSelective(Logger record);

    Logger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Logger record);

    int updateByPrimaryKey(Logger record);
}