package Controller;

import Service.BlogService;
import model.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;


@Controller
public class BlogController {
        @Resource
    private BlogService blogService;
        @RequestMapping("/showAllBlogPerson")
    public String showAllBlogPerson(@RequestParam String userName, HttpSession session){
            try {
                String name = new String(userName.getBytes("iso-8859-1"), "UTF-8");
                List<Blog> allBlogPerson = blogService.showAllBlogPerson(name);
                session.setAttribute("blog", allBlogPerson);
                return "blogShowPerson";
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "404";
            }

        }
        @RequestMapping("/showAllBlog")
    public String showAllBlog(HttpSession session){
        List<Blog> allBlog=blogService.showAllBlog();
        session.setAttribute("allBlog",allBlog);
        return "index";
        }
        @RequestMapping("/createBlog")
    public String createBlog(@RequestParam String title,@RequestParam String describe,@RequestParam String writer,@RequestParam String context)
        {
            //一般都是这样创建并保存对象的吗
            Blog blog=new Blog();
            blog.setTitle(title);
            blog.setDescrible(describe);
            blog.setWriter(writer);
            blog.setContext(context);
            blogService.createBlog(blog);
            return "redirect:showAllBlog.do";
        }
        @RequestMapping("/updateBlog")
    public String updateBlog(Blog blog)
        {
//            System.out.println(title);
//            Blog blog=new Blog();
//            blog.setTitle(title);
//            blog.setDescrible(describe);
//            blog.setWriter(writer);
//            blog.setContext(context);
            blogService.updateBlog(blog);
            return "redirect:/showAllBlog.do";
        }
        @RequestMapping("/deleteBlog")
    public String deleteBlog(@RequestParam String title)
        {
            System.out.println(title);
            blogService.deleteBlog(title);
            return "index";
        }
        @RequestMapping("/selectBlog")
        public String selectBlog(@RequestParam String title, HttpSession session)
        {
            try {
                String tit = new String(title.getBytes("iso-8859-1"), "UTF-8");

            Blog blog=blogService.selectBlog(tit);
            session.setAttribute("aBlog",blog);
            return "blogShow";
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "404";
            }
        }

}
