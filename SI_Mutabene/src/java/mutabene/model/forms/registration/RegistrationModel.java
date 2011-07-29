/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.model.forms.registration;



import mutabene.model.entity.Center;
import mutabene.model.entity.RoleIT;
import mutabene.model.entity.User;
import mutabene.model.entity.Address;
import mutabene.model.entity.Region;


/**
 *
 * @author stenlik
 */
public class RegistrationModel {
    
    private User user;
    private Address address;
    private Region region;
    private Center center;
    private RoleIT role;   
    
    private String confirmPassword;
    private String centerId;
    private String regionId;
    private String gender; 
    
    private String errors;
    
    public RegistrationModel() {
    user = new User();
    address = new Address();
    region = new Region();
    center = new Center();
    role = new RoleIT();
    }

 
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public String getCenterId() {
        return centerId;
    }

    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public RoleIT getRole() {
        return role;
    }

    public void setRole(RoleIT role) {
        this.role = role;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
    
    
}
