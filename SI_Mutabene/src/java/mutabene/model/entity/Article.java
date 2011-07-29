/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author stenlik
 */
@Entity
@Table(name = "ARTICLES")
public class Article implements Serializable {
    private Long id;
    private String tittle;
    private String text;
    private Date dateOfArticle;
    private ArticleCategory category;
    private User autor;

    public Article() {
    }
    
    @ManyToOne @PrimaryKeyJoinColumn
    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }
    
    @ManyToOne @PrimaryKeyJoinColumn
    public ArticleCategory getCategory() {
        return category;
    }

    public void setCategory(ArticleCategory category) {
        this.category = category;
    }
    @Column(name = "ARTICLE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateOfArticle() {
        return dateOfArticle;
    }

    public void setDateOfArticle(Date dateOfArticle) {
        this.dateOfArticle = dateOfArticle;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ARTICLE_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "ARTICLE_TEXT")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Column(name = "ARTICLE_TITTLE")
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    
    
    
    
    
    
    
    
}
