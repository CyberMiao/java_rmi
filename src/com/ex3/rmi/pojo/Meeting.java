package com.ex3.rmi.pojo;

import com.ex3.rmi.inter.IMeeting;
import com.ex3.rmi.inter.IUser;

import java.util.Date;
import java.util.List;

/**
 * 会议类
 *
 * @author spj
 * @version 1.0
 */
public class Meeting implements IMeeting {
    private int id;
    private Date startTime;
    private Date endTime;
    private String title;
    private IUser creator;
    private List<IUser> members;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IUser getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public List<IUser> getMembers() {
        return members;
    }

    public void setMembers(List<IUser> members) {
        this.members = members;
    }
}
