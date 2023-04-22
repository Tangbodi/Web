package com.example.demo.Repository;

import com.example.demo.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PostRepository extends JpaRepository<Post, String> {
    @Query(value = "SELECT * FROM posts WHERE categoryId =:categoryId",nativeQuery = true)
    List<Map<String, Object>> findPostsByCategoryId(@Param("categoryId") Integer categoryId);

//    @Query(value = "SELECT * FROM master.post where categoryId =:categoryId and postId =:postId",nativeQuery = true)
//    Post findPostByPostIdAndCategoryId(@Param("categoryId")Integer categoryId,@Param("postId")Long postId);

}
