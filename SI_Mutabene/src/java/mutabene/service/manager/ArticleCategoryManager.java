/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.ArticleCategory;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("articleCategoryManager")
public class ArticleCategoryManager extends GenericDataManager<ArticleCategory> {

    @Override
    public boolean add(ArticleCategory object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(ArticleCategory object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(ArticleCategory object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArticleCategory findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<ArticleCategory> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<ArticleCategory> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<ArticleCategory> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
