/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.User;
import java.util.Collection;
import java.util.List;
import javax.management.Query;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("userManager")
public class UserManager extends GenericDataManager<User> {

    @Override
    public boolean add(User object) {
        try{
        hibTempl.save(object);
        return true;
        } catch(Exception e){
        return false;
        }
    }

    @Override
    public boolean update(User object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(User object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<User> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<User> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<User> findAll() {
        return hibTempl.find("From User");
    }
    
    public User findByLogin(String login){
        List<User> users = hibTempl.find("from User as user where user.login like ? ", login);
        if(users.isEmpty()){
            return null;
        }
        return users.get(0);
    }
    
}
