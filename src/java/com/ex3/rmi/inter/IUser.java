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

    List<Integer> getMeetings();

    List<Integer> getCreatedMeeting();

    void setId(int id);

    void setUsername(String username);

    void setPassword(String password);

    void setMeetings(List<Integer> meetings);

    void setCreatedMeeting(List<Integer> createdMeeting);
}
