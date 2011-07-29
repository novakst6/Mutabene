/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mutabene.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Anysek
 */

@Entity
@Table(name = "USERS")
public class User implements Serializable {
    private Long id;
    private String firstname;
    private String surname;
    private String login;
    private String password;
    private Gender gender;
    private String email;
    private String telephoneNumber;
    private RoleIT roleIT;
    private Center center;
    private Address address;
    //TODO
    private Boolean mailingList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "U_FIRST_NAME")
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "U_SURNAME")
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "U_PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name= "U_LOGIN")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "U_EMAIL")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name= "U_TELEPHONE_NUMBER")
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Column(name = "U_GENDER")
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Column(name = "U_IN_MAILING_LIST")
    public Boolean getMailingList() {
        return mailingList;
    }
    public void setMailingList(Boolean mailingList) {
        this.mailingList = mailingList;
    }

    //@Column(name = "ROLE_IT_ID")
    @ManyToOne @PrimaryKeyJoinColumn
    public RoleIT getRoleIT() {
        return roleIT;
    }

    public void setRoleIT(RoleIT roleIT) {
        this.roleIT = roleIT;
    }

    //@Column(name = "CENTER_ID")
    @ManyToOne @PrimaryKeyJoinColumn
    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }


    @ManyToOne @PrimaryKeyJoinColumn
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}