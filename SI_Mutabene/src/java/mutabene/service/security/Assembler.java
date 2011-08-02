/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.service.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import mutabene.model.entity.RoleITEntity;
import mutabene.model.entity.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stenlik
 */
@Service("assembler")
public class Assembler {
    
    @Transactional(readOnly = true)
    User buildUserFromUserEntity(UserEntity userEntity){
        System.out.println("buildUserFromUserEntity");
    String username = userEntity.getLogin();
    String password = userEntity.getPassword();
    boolean enabled = true;
    boolean accountNonExpired = true;
    boolean accoountNonLocked = true;
    
    Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
    Set<RoleITEntity> roles = userEntity.getRoleIT();
    try{
        System.out.println(roles);
    }catch(Exception e){
        System.out.println("No roles!!");
    }
    for(RoleITEntity role: roles){
        authorities.add(new GrantedAuthorityImpl(role.getName()));
        System.out.println(userEntity.getLogin()+" "+role.getName());
    }
    
    User user = new User(username, password, enabled, accountNonExpired, accountNonExpired, accoountNonLocked, authorities);
    return user;
    }
}
