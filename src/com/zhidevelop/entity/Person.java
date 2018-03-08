package com.zhidevelop.entity;

import javax.persistence.*;

/**
 * description
 * author enzoluo
 * time 2017-11-30 9:27
 * version v1.0
 **/
@Entity
@Table(name = "person")
public class Person {
    private Integer id;
    private String name;
    private String loginName;
    private String password;
    private String englishName;
    private String dept;
    private String email;
    private String sex;
    private String post;
    private String defaultLanuage;

    @Id
    @GeneratedValue
    @Column(name = "id",unique = true,nullable = false,length = 10)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "name",length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "login_name",length = 30)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Column(name = "password",length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "english_name",length = 30)
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
    @Column(name = "dept",length = 30)
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Column(name = "email",length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "sex",length = 10)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name = "post",length = 100)
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Column(name = "default_language",length = 30)
    public String getDefaultLanuage() {
        return defaultLanuage;
    }

    public void setDefaultLanuage(String defaultLanuage) {
        this.defaultLanuage = defaultLanuage;
    }
}
