/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mutabene.model.forms.registration;



import mutabene.model.entity.CenterEntity;
import mutabene.model.entity.RoleITEntity;
import mutabene.model.entity.UserEntity;
import mutabene.model.entity.AddressEntity;
import mutabene.model.entity.RegionEntity;


/**
 *
 * @author stenlik
 */
public class RegistrationModel {
    
    private UserEntity user;
    private AddressEntity address;
    private RegionEntity region;
    private CenterEntity center;
    private RoleITEntity role;   
    
    private String confirmPassword;
    private String centerId;
    private String regionId;
    private String gender; 
    
    private String errors;
    
    public RegistrationModel() {
    user = new UserEntity();
    address = new AddressEntity();
    region = new RegionEntity();
    center = new CenterEntity();
    role = new RoleITEntity();
    }

 
    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public CenterEntity getCenter() {
        return center;
    }

    public void setCenter(CenterEntity center) {
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public RegionEntity getRegion() {
        return region;
    }

    public void setRegion(RegionEntity region) {
        this.region = region;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public RoleITEntity getRole() {
        return role;
    }

    public void setRole(RoleITEntity role) {
        this.role = role;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
    
    
}
