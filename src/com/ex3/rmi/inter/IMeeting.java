package com.ex3.rmi.inter;

import com.ex3.rmi.pojo.User;

import java.rmi.Remote;
import java.util.Date;
import java.util.List;

/**
 * Meeting接口，定义meeting操作
 *
 * @author spj
 * @version 1.0
 */
public interface IMeeting extends Remote {
    int getId();

    Date getStartTime();

    Date getEndTime();

    String getTitle();

    IUser getCreator();

    List<IUser> getMembers();

    void setId(int id);

    void setStartTime(Date startTime);

    void setEndTime(Date endTime);

    void setTitle(String title);

    void setCreator(User creator);

    void setMembers(List<IUser> members);
}
