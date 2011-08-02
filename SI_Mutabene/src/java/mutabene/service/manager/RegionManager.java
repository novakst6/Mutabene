/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.RegionEntity;
import java.util.Collection;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */

@Service("regionManager")
public class RegionManager extends GenericDataManager<RegionEntity> {

    @Override
    public boolean add(RegionEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(RegionEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(RegionEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public RegionEntity findById(Long id) {
        return hibTempl.load(RegionEntity.class, id);
    }

    @Override
    public Collection<RegionEntity> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<RegionEntity> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<RegionEntity> findAll() {
       return hibTempl.loadAll(RegionEntity.class);
    }
    
}
