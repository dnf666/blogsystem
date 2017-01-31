package Service.impl;

import Service.BlogService;
import Service.LeaveMessageService;
import Service.LoggerService;
import Service.RegisterService;
import model.Blog;
import model.LeaveMessage;
import model.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by demo on 2017/1/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LoggerServiceImplTest {
    @Resource
   private LoggerService loggerService;
    @Resource
    private RegisterService registerService;
    @Resource
    private BlogService blogService;
    @Resource
    private LeaveMessageService leaveMessageService;
    @Test
    public void insert() throws Exception {
        Logger l=new Logger();
        l.setUsername("213");
        l.setPassword("12");
        l.setSex("男");
            loggerService.insertLogUser(l);
    }
    @Test
    public void selectbyusername()throws Exception{
        registerService.registJudge("12","231");
    }
    @Test
    public void showpersonblog()throws Exception{
        List<Blog> b=blogService.showAllBlogPerson("1");
        for (Blog c:b
                ) {
            System.out.println(c.getId());
            System.out.println(c.getContext());
            System.out.println(c.getDescrible());
            System.out.println(c.getTitle());
            System.out.println(c.getWriter());
        }

    }
    @Test
    public void showblog()throws Exception{
        List<Blog> b=blogService.showAllBlog();
        for (Blog c:b
                ) {
            System.out.println(c.getId());
            System.out.println(c.getContext());
            System.out.println(c.getDescrible());
            System.out.println(c.getTitle());
            System.out.println(c.getWriter());
        }
    }
    @Test
    public void create() throws Exception {
      Blog l=new Blog();
        l.setWriter("发到");
        l.setContext("风口浪尖积分代课老师撒打发点撒欢是非法的世纪东方数据开放的数据开放接口");
        l.setTitle("地方撒");
        l.setDescrible("的撒范德萨范德萨");
        blogService.createBlog(l);
    }
    @Test
    public void create1() throws Exception {
        LeaveMessage l=new LeaveMessage();
        l.setMessage("发到dsfdssdsddsas");
        l.setPhoneNumber("dafs");
        l.setQq("地方撒");
        l.setUserName("的撒范德");
        leaveMessageService.insertLeaveMessage(l);
    }
}