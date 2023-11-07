package com.ex3.rmi.pojo;

import com.ex3.rmi.inter.IMeeting;

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
    private Integer creatorId;
    private List<Integer> membersId;

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

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreator(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public List<Integer> getMembersId() {
        return membersId;
    }

    public void setMembers(List<Integer> membersId) {
        this.membersId = membersId;
    }
}
