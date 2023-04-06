package com.example.demo.Entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Instant;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @Column(name = "commentId", nullable = false)
    private Long id;

    @Size(max = 30)
    @Column(name = "articleType", length = 30)
    private String articleType;

    @Lob
    @Column(name = "content")
    private String content;

    @Column(name = "fromId")
    private Long fromId;

    @Column(name = "toId")
    private Long toId;

    @Column(name = "publishAt")
    private Instant publishAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "articleId")
    private Article article;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorId", referencedColumnName = "userId")
    private Article author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public Instant getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(Instant publishAt) {
        this.publishAt = publishAt;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Article getAuthor() {
        return author;
    }

    public void setAuthor(Article author) {
        this.author = author;
    }

}