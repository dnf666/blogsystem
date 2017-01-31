package Controller;

import Service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by demo on 2017/1/21.
 */
@Controller
public class RegistController {
    @Resource
    private RegisterService registerService;
    @RequestMapping("/registJudge")
    public String registJudge(@RequestParam String userName, @RequestParam String password, HttpSession session)
    {
        if(userName!=null&&password!=null)
    {
        String pwd=registerService.registJudge(userName,password);
        if (pwd.equals(password)) {
            session.setAttribute("userName", userName);
            return "index";
        }
    }
    return "404";
    }
}
