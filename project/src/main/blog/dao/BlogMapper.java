package dao;

import model.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {
    int deleteByTitle(String title);

    int insert(Blog record);

    List<Blog> selectAllBlog();
    Blog selectBlog(String title);

    List<Blog> selectByWriter(String writer);

    int updateByWriter(Blog record);
}