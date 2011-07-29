/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.Offer;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("offerManager")
public class OfferManager extends GenericDataManager<Offer> {

    @Override
    public boolean add(Offer object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Offer object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Offer object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Offer findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Offer> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Offer> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Offer> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
