/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.OfferState;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("offerStateManager")
public class OfferStateManager extends GenericDataManager<OfferState> {

    @Override
    public boolean add(OfferState object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(OfferState object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(OfferState object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OfferState findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<OfferState> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<OfferState> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<OfferState> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
