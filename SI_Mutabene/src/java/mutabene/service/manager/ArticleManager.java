/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.Article;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("articleManager")
public class ArticleManager extends GenericDataManager<Article> {

    @Override
    public boolean add(Article object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Article object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Article object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Article findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Article> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Article> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Article> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
