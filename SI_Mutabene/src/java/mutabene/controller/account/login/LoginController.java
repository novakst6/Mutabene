/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.controller.account.login;



import java.security.Principal;
import java.util.LinkedList;
import mutabene.model.forms.login.LoginFormModel;
import mutabene.model.forms.login.LoginFormValidator;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.RememberMeAuthenticationToken;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.jaas.JaasAuthenticationToken;
import org.springframework.security.authentication.jaas.JaasGrantedAuthority;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.security.acl.PrincipalImpl;


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

    @RequestMapping(value="/submitLogin.htm",method= RequestMethod.POST)
    public String submitLogin(LoginFormModel loginFormModel, BindingResult result){
        loginFormValidator.validate(loginFormModel, result);
        if(result.hasErrors()){
            return "Account/login";
        }
        //SecurityContext sc = SecurityContextHolder.getContext();
        //Authentication a = sc.getAuthentication();
        //LinkedList<GrantedAuthority> autorities = new LinkedList<GrantedAuthority>();
        //GrantedAuthority ga = new GrantedAuthorityImpl("admin");
        //autorities.add(ga);
        //a = new RememberMeAuthenticationToken("SSS", loginFormModel.getUserName(), autorities);
        //sc.setAuthentication(a);
        //sc.getAuthentication().setAuthenticated(true);
        return "Home/index";
    }
    
    @RequestMapping(value="/logout.htm", method= RequestMethod.GET)
    public String logout(){
        //SecurityContext sc = SecurityContextHolder.getContext();
        //sc.getAuthentication().setAuthenticated(false);  
        return "Home/index";
    }
  
}
