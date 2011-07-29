/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.Region;
import java.util.Collection;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */

@Service("regionManager")
public class RegionManager extends GenericDataManager<Region> {

    @Override
    public boolean add(Region object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Region object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Region object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Region findById(Long id) {
        return hibTempl.load(Region.class, id);
    }

    @Override
    public Collection<Region> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Region> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Region> findAll() {
       return hibTempl.loadAll(Region.class);
    }
    
}
