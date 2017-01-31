package dao;

import model.Register;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Register record);

    int insertSelective(Register record);

    Register selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
    String selectByUserName(String userName);
}