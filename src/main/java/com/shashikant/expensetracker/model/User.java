package com.shashikant.expensetracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @Column(name = "userId", nullable = false)
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {

    }

    /**
     * created a user where user have different entities
     * @param userId users specific id
     * @param firstName users specific name
     * @param lastName  users specific lastname
     * @param email users specific emailId
     * @param password users specific password
     */
    public User(Integer userId, String firstName, String lastName, String email, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
    // getter setter used here
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
