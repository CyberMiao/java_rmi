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
    /**
     * 用户注册
     *
     * @param username 用户名
     * @param password 密码
     * @return 创建成功返回true，否则返回false
     */
    boolean registerUser(String username, String password);

    /**
     * 删除用户的某个id为meetingId的会议
     *
     * @param meetingId 要删除会议的Id
     * @return 删除成功返回true，否则返回false
     */
    boolean deleteMeeting(int meetingId);

    /**
     * 为用户添加会议
     *
     * @param username  参加会议人的名称（除创建者外）
     * @param startTime 会议开始时间
     * @param endTime   会议结束时间
     * @return 创建成功返回true，否则返回false
     */
    boolean addMeeting(String username, Date startTime, Date endTime);

    /**
     * 删除用户创建的所有会议
     *
     * @return 删除成功返回true，否则返回false
     */
    boolean clear();

    /**
     * 查询用户在某阶段的所有会议
     *
     * @param startTime 会议的开始时间
     * @param endTime   会议的结束时间
     * @return 用户在会议开始和结束时间内的所有会议
     */
    List<IMeeting> queryMeeting(Date startTime, Date endTime);

    /**
     * 输出系统帮助菜单
     */
    void help();

    /**
     * 退出系统
     */
    void quit();

}
