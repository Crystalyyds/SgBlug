package com.github.sgblug.app.repository;

/**
 * @author 20312
 * @author 2022/8/16 14:58
 */
import com.github.sgblug.app.model.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
