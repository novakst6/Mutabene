/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.Address;
import java.util.Collection;
import org.hibernate.annotations.OnDelete;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


/**
 *
 * @author stenlik
 */


@Service("addressManager")
public class AddressManager extends GenericDataManager<Address> {

    @Override
    public boolean add(Address object) {
        try{
        hibTempl.save(object);
        return true;
        } catch (Exception e) {
        return false;
        }
    }

    @Override
    public boolean update(Address object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Address object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Address findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Address> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Address> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Address> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
