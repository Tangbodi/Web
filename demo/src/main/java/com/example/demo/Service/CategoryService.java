package com.example.demo.Service;

import com.example.demo.DAO.CategoryDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class CategoryService {
        private static final Logger logger = LoggerFactory.getLogger(CategoryService.class);
        @PersistenceContext
        private EntityManager entityManager;
        @Autowired
        private CategoryDAO categoryDAO;
        public List<Object[]> getAllTopFivePostsUnderEveryCategory(){
            return categoryDAO.getAllTopFivePostsUnderEveryCategory();
        }
}
