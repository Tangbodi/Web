package com.example.demo.Service;

import com.example.demo.DAO.AllArticleDAO;
import com.example.demo.Entity.Allarticle;
import com.example.demo.Repository.AllArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllArticleService {
    private static final Logger logger = LoggerFactory.getLogger(AllArticleService.class);

    @Autowired
    private AllArticleDAO allArticleDAO;
    @Autowired
    private AllArticleRepository allArticleRepository;

    public List<Allarticle> getAllArticle(){

        return this.allArticleDAO.findAllArticle();
    }
    public Allarticle updateCommentAndView(Long articleId){
        return this.allArticleDAO.updateCommentAndViewByArticleId(articleId);
    }

}
