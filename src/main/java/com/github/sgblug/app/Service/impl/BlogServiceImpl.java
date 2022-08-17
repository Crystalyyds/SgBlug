package com.github.sgblug.app.Service.impl;

/**
 * @author 20312
 * @author 2022/8/17 12:11
 */
import com.github.sgblug.app.model.entity.Blog;
import com.github.sgblug.app.repository.BlogRepository;
import com.github.sgblug.app.Service.BlogService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;

    @Inject
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Blog newBlog(String title, String description, String content) {
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setDescription(description);
        blog.setContent(content);
        return blogRepository.save(blog);
    }

    @Override
    public Blog getBlog(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> getBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog modifyBlog(Long id, String title, String description, String content) {
        Blog blog = blogRepository.findById(id).orElse(null);
        if (blog == null) {
            return null;
        }
        blog.setTitle(title);
        blog.setDescription(description);
        blog.setContent(content);
        return blogRepository.save(blog);
    }
}
