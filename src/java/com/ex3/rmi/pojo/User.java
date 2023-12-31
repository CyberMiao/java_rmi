package com.ex3.rmi.pojo;

import com.ex3.rmi.inter.IUser;

import java.util.List;

/**
 * 用户类
 *
 * @author spj
 * @version 1.0
 */
public class User implements IUser {
    private int id;
    private String username;
    private String password;
    private List<Integer> meetings;
    private List<Integer> createdMeeting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Integer> meetings) {
        this.meetings = meetings;
    }

    public List<Integer> getCreatedMeeting() {
        return createdMeeting;
    }

    public void setCreatedMeeting(List<Integer> createdMeeting) {
        this.createdMeeting = createdMeeting;
    }
}
