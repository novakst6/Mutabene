/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.controller.account.registration;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import mutabene.model.entity.Address;
import mutabene.model.entity.Center;
import mutabene.model.entity.Gender;
import mutabene.model.entity.Region;
import mutabene.model.entity.RoleIT;
import mutabene.model.entity.User;
import mutabene.model.forms.registration.RegistrationModel;
import mutabene.model.forms.registration.RegistrationValidator;
import mutabene.service.manager.AddressManager;
import org.springframework.ui.ModelMap;
import mutabene.service.manager.CenterManager;
import mutabene.service.manager.RegionManager;
import mutabene.service.manager.RoleITManager;
import mutabene.service.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author stenlik
 */
@Controller
public class RegistrationController {
   
    UserManager userManager;
    AddressManager addressManager;
    CenterManager centerManager;
    RoleITManager roleItManager;
    RegionManager regionManager;

    RegistrationValidator registrationValidator;
    
    @ModelAttribute(value="centersList")
    public Map<String,String> centers(){
       Collection<Center> centers = centerManager.findAll();
       Map<String,String> centersList = new LinkedHashMap<String, String>();
       for(Center c: centers){
           centersList.put(c.getId().toString(), c.getName());
       }
       return centersList;
    }
    
    @ModelAttribute(value="regionsList")
    public Map<String,String> addRegions(){
       Collection<Region> regions = regionManager.findAll();
       Map<String,String> regionsList = new LinkedHashMap<String, String>();       
       for(Region r: regions){
            if(r.getId() == r.getRegion().getId()){
                regionsList.put(r.getId().toString(), r.getName());
                for(Region r2: regions){
                    if(r.getId() == r2.getRegion().getId() && r2.getRegion().getId() != r2.getId()){
                      regionsList.put(r2.getId().toString(), "   - "+r2.getName()+" -");
                    }
                }
            }
        }
       return regionsList;
    }
    

    @RequestMapping(value="/register.htm", method= RequestMethod.GET)
    public String register(RegistrationModel regModelForm, ModelMap model){     
        model.addAttribute("regModelForm", regModelForm);
        return "Account/registration";
    }
    
    @RequestMapping(value="/addUser.htm", method= RequestMethod.POST)
    public String addUser(@ModelAttribute("regModelForm") RegistrationModel regModel, BindingResult result){   
        registrationValidator.validate(regModel, result);
        if(result.hasErrors()){                
            return "Account/registration";
        }
        Address address = regModel.getAddress();
        User user = regModel.getUser();
        Center center = centerManager.findById(Long.parseLong(regModel.getCenterId()));
        Region region = regionManager.findById(Long.parseLong(regModel.getRegionId()));
        address.setRegion(region);
        addressManager.add(address);
        user.setAddress(address);
        user.setCenter(center);
        user.setLogin(user.getLogin().toLowerCase());
        if("MALE".equals(regModel.getGender())){
            user.setGender(Gender.MALE);
        } else {
            user.setGender(Gender.FEMALE);
        }
        Collection<RoleIT> roles = roleItManager.findAll();
        for(RoleIT role: roles){
            if(role.getName().equals("USER")){
                user.setRoleIT(role);
            }
        }
        userManager.add(user);
        System.out.println("FINISH");
        return "Home/index";
    }
        

    public @Autowired void setAddressManager(AddressManager addressManager) {
        this.addressManager = addressManager;
    }

    public @Autowired void setCenterManager(CenterManager centerManager) {
        this.centerManager = centerManager;
    }

    public @Autowired void setRegionManager(RegionManager regionManager) {
        this.regionManager = regionManager;
    }

    public @Autowired void setRoleItManager(RoleITManager roleItManager) {
        this.roleItManager = roleItManager;
    }

    public @Autowired void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }
      public @Autowired void setValidator(RegistrationValidator validator) {
        this.registrationValidator = validator;
      }
    
}
