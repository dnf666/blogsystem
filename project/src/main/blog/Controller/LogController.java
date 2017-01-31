package Controller;

import Service.LoggerService;
import model.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;


@Controller
public class LogController {
    @Resource
    private LoggerService loggerService;

    @RequestMapping(value = "/log", produces = "text/plain;charset=UTF-8")
    public String logUser(@ModelAttribute("userName") String name, @ModelAttribute("password") String password, @ModelAttribute("sex") String sex) {
        Logger logger = new Logger();
        logger.setUsername(name);
        logger.setPassword(password);
        logger.setSex(sex);
        loggerService.insertLogUser(logger);
        return "index";

    }

    @RequestMapping("/judge")
    public String judgeLogger(@RequestParam String userName, @RequestParam String password, @RequestParam String sex, RedirectAttributes redirectAttributes) {
        String name = userName;
        String s = sex;
        if (name != null && password != null && s != null) {
            if (loggerService.judgeLogger(name) == 1) {
                redirectAttributes.addFlashAttribute("userName", name);
                redirectAttributes.addFlashAttribute("password", password);
                redirectAttributes.addFlashAttribute("sex", s);
                return "redirect:/log.do";
            }
        }
        return "404";
    }
}