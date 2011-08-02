/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.RoleITEntity;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("roleITManager")
public class RoleITManager extends GenericDataManager<RoleITEntity> {

    @Override
    public boolean add(RoleITEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(RoleITEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(RoleITEntity object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public RoleITEntity findById(Long id) {
        return hibTempl.load(RoleITEntity.class, id);
    }

    @Override
    public Collection<RoleITEntity> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<RoleITEntity> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<RoleITEntity> findAll() {
        return hibTempl.loadAll(RoleITEntity.class);
    }
    
}
