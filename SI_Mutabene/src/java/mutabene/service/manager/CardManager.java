/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.CardEntity;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("cardManager")
public class CardManager extends GenericDataManager<CardEntity> {

    @Override
    public boolean add(CardEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(CardEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(CardEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CardEntity findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<CardEntity> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<CardEntity> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<CardEntity> findAll() {
        return hibTempl.loadAll(CardEntity.class);
    }
    
}
