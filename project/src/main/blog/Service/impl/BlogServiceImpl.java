package Service.impl;

import Service.BlogService;
import dao.BlogMapper;
import model.Blog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by demo on 2017/1/21.
 */
@Service
public class BlogServiceImpl implements BlogService {
@Resource
private BlogMapper blogMapper;


    public List<Blog> showAllBlogPerson(String writer) {
        List<Blog> blogList=blogMapper.selectByWriter(writer);
        return blogList;
    }

    public int createBlog(Blog blog) {
        if(blogMapper.insert(blog)==1)
                return 1;
        return 0;
    }

    public int deleteBlog(String title) {
        if(blogMapper.deleteByTitle(title)==1)
            return 1;
        return 0;
    }

    public int updateBlog(Blog blog) {
        if(blogMapper.updateByWriter(blog)==1)
            return 1;
        return 0;
    }

    public Blog selectBlog(String title) {
       return blogMapper.selectBlog(title);
    }

    public List<Blog> showAllBlog() {
        return blogMapper.selectAllBlog();
    }
}
