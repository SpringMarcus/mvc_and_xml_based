package com.marcus.chiu.database;

/**
 * Created by marcus.chiu on 9/29/16.
 */
public class User {
    private Integer id;
    private Integer age;
    private String name;
    private String username;
    private String dateRegistered;


    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User [id = '" + id + "',name='" + name;
    }
}
