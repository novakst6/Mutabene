/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.RoleIT;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("roleITManager")
public class RoleITManager extends GenericDataManager<RoleIT> {

    @Override
    public boolean add(RoleIT object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(RoleIT object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(RoleIT object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public RoleIT findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<RoleIT> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<RoleIT> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<RoleIT> findAll() {
        return hibTempl.loadAll(RoleIT.class);
    }
    
}
