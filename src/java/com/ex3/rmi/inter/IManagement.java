package com.ex3.rmi.inter;

import java.rmi.Remote;
import java.util.Date;
import java.util.List;

/**
 * Management接口，定义管理器操作
 *
 * @author spj
 * @version 1.0
 */
public interface IManagement extends Remote {

    boolean login(String username, String password);

    boolean registerUser(String username, String password);

    boolean deleteMeeting(int meetingId);

    boolean addMeeting(String username, Date startTime, Date endTime);

    boolean clear();

    List<IMeeting> queryMeeting(Date startTime, Date endTime);

    void help();

    void quit();

}
