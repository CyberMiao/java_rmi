package com.ex3.rmi.inter;

import java.rmi.Remote;
import java.util.List;

/**
 * User接口，定义User操作
 *
 * @author spj
 * @version 1.0
 */
public interface IUser extends Remote {
    String getUsername();

    String getPassword();

    List<IMeeting> getMeetings();

    List<IMeeting> getCreatedMeeting();

    void setId(int id);

    void setUsername(String username);

    void setPassword(String password);

    void setMeetings(List<IMeeting> meetings);

    void setCreatedMeeting(List<IMeeting> createdMeeting);
}
