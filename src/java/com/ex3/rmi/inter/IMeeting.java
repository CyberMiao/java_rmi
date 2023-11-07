package com.ex3.rmi.inter;

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

    Integer getCreatorId();

    List<Integer> getMembersId();

    void setId(int id);

    void setStartTime(Date startTime);

    void setEndTime(Date endTime);

    void setTitle(String title);

    void setCreator(Integer creatorId);

    void setMembers(List<Integer> members);
}
