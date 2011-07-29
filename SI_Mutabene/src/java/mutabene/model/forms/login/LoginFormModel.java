/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mutabene.model.forms.login;

/**
 *
 * @author Anysek
 */
public class LoginFormModel {
    String userName;
    String pass;
    String errors;
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
    
}
