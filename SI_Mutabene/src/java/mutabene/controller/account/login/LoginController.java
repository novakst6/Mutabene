/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.controller.account.login;




import java.util.ArrayList;
import java.util.Collection;
import javax.resource.spi.work.SecurityContext;
import mutabene.model.forms.login.LoginFormModel;
import mutabene.model.forms.login.LoginFormValidator;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author Anysek
 */
@Controller
public class LoginController {
    private LoginFormValidator loginFormValidator;


    public @Autowired void setValidator(LoginFormValidator loginFormValidator) {
        this.loginFormValidator = loginFormValidator;
    }

    @RequestMapping(value="/login.htm", method= RequestMethod.GET)
    public String login(LoginFormModel loginFormModel, ModelMap map){
        map.addAttribute("loginFormModel", loginFormModel);
        return "Account/login";
    }

//    @RequestMapping(value="/submitLogin.htm",method= RequestMethod.POST)
//    public String submitLogin(LoginFormModel loginFormModel, BindingResult result){
//        loginFormValidator.validate(loginFormModel, result);
//        if(result.hasErrors()){
//            return "Account/login";
//        }
//        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        authorities.add(new GrantedAuthorityImpl("ROLE_USER"));
//        User user = new User(loginFormModel.getUsername(), loginFormModel.getPassword(), true, true, true, true, authorities);
//        return "Home/index";
//    }
//    
//   
  
}
