package com.gu.demo.pojo;

import org.hibernate.annotations.NamedQuery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NamedQuery(name="UserInfo.findByFirstName",query = "select u from UserInfo u where u.firstName = ?")
public class UserInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected UserInfo() { }
    public UserInfo(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "UserInfo[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
