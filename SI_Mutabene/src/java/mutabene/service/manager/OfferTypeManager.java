/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.OfferType;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("offerTypeManager")
public class OfferTypeManager extends GenericDataManager<OfferType> {

    @Override
    public boolean add(OfferType object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(OfferType object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(OfferType object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OfferType findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<OfferType> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<OfferType> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<OfferType> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
