/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.Card;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("cardManager")
public class CardManager extends GenericDataManager<Card> {

    @Override
    public boolean add(Card object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Card object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Card object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Card findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Card> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Card> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Card> findAll() {
        return hibTempl.loadAll(Card.class);
    }
    
}
