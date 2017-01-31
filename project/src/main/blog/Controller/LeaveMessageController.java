package Controller;

import Service.LeaveMessageService;
import dao.LeaveMessageMapper;
import model.LeaveMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by demo on 2017/1/25.
 */
@Controller
public class LeaveMessageController {
    @Resource
    private LeaveMessageService leaveMessageService;
    @RequestMapping("insertLeaveMessage")
    public String insertLeaveMessage(@RequestParam String userName,@RequestParam String phoneNumber,@RequestParam String qq,@RequestParam String message){
        LeaveMessage leaveMessage=new LeaveMessage();
        leaveMessage.setUserName(userName);
        leaveMessage.setQq(qq);
        leaveMessage.setPhoneNumber(phoneNumber);
        leaveMessage.setMessage(message);
        leaveMessageService.insertLeaveMessage(leaveMessage);
        return "success";
    }
}
