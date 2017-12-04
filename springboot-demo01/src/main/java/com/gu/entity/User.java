package com.gu.entity;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uer_id;

    private String user_name;

    private String user_age;

    public long getUer_id() {
        return uer_id;
    }

    public void setUer_id(long uer_id) {
        this.uer_id = uer_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }
}
