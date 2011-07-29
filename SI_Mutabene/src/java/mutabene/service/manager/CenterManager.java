/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.Center;
import java.util.Collection;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */

@Service("centerManager")
public class CenterManager extends GenericDataManager<Center> {

    @Override
    public boolean add(Center object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Center object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Center object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Center findById(Long id) {
        return hibTempl.load(Center.class, id);
    }

    @Override
    public Collection<Center> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Center> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Center> findAll() {
        return hibTempl.loadAll(Center.class);
    }
    
}
