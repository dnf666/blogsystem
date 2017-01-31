package Service;

import model.Blog;

import java.util.List;

/**
 * Created by demo on 2017/1/21.
 */
public interface BlogService {
    List<Blog> showAllBlogPerson(String writer);
    int createBlog(Blog blog);
    int deleteBlog(String title);
    int updateBlog(Blog blog);
    Blog selectBlog(String title);
    List<Blog> showAllBlog();
}
