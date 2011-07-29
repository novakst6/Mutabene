/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.manager;

import mutabene.model.entity.MessageStatus;
import java.util.Collection;
import org.springframework.stereotype.Service;

/**
 *
 * @author stenlik
 */
@Service("messageStatusManager")
public class MessageStatusManager extends GenericDataManager<MessageStatus> {

    @Override
    public boolean add(MessageStatus object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(MessageStatus object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(MessageStatus object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public MessageStatus findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<MessageStatus> find(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<MessageStatus> findInterval(Integer from, Integer count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<MessageStatus> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
