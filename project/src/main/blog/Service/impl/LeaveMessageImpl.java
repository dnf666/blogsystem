package Service.impl;

import Service.LeaveMessageService;
import dao.LeaveMessageMapper;
import model.LeaveMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by demo on 2017/1/25.
 */
@Service
public class LeaveMessageImpl implements LeaveMessageService {
    @Resource
    private LeaveMessageMapper leaveMessageMapper;
    public int insertLeaveMessage(LeaveMessage leaveMessage) {
        leaveMessageMapper.saveLeaveMessage(leaveMessage);
        return 1;
    }
}
