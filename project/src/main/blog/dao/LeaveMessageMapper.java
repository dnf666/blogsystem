package dao;

import model.LeaveMessage;
import org.springframework.stereotype.Repository;

/**
 * Created by demo on 2017/1/25.
 */
@Repository
public interface LeaveMessageMapper {
    int saveLeaveMessage(LeaveMessage leaveMessage);
}
