/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.ArticleComment;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("articleCommentManager")
public class ArticleCommentManager extends GenericDataManager<ArticleComment> {

    @Override
    public boolean add(ArticleComment object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(ArticleComment object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(ArticleComment object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArticleComment findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<ArticleComment> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<ArticleComment> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<ArticleComment> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
