/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.Message;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("messageManager")
public class MessageManager extends GenericDataManager<Message> {

    @Override
    public boolean add(Message object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Message object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(Message object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Message findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Message> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Message> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Message> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
