package com.ex3.rmi;

import com.ex3.rmi.inter.IManagement;
import com.ex3.rmi.inter.IMeeting;
import com.ex3.rmi.pojo.Meeting;
import com.ex3.rmi.pojo.User;

import java.util.Date;
import java.util.List;

public class Management implements IManagement {

    private User user;
    private List<User> users;
    private List<Meeting> meetings;

    /**
     * 初始化users和meetings
     * 从文件中读取users和meetings的内容
     */
    public Management() {

    }


    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功则返回true，否则返回false
     */
    @Override
    public boolean login(String username, String password) {
        try {
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    if (user.getPassword().equals(password)) {
                        this.user = user;
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * 用户注册
     *
     * @param username 用户名
     * @param password 密码
     * @return 创建成功返回true，否则返回false
     */
    @Override
    public boolean registerUser(String username, String password) {
        try {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            users.add(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 删除用户的某个id为meetingId的会议
     *
     * @param meetingId 要删除会议的Id
     * @return 删除成功返回true，否则返回false
     */
    @Override
    public boolean deleteMeeting(int meetingId) {
        try {
            for (Meeting meeting : meetings) {
                if (meeting.getId() == meetingId) {
                    meetings.remove(meeting);
                    break;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 为用户添加会议
     *
     * @param username  参加会议人的名称（除创建者外）
     * @param startTime 会议开始时间
     * @param endTime   会议结束时间
     * @return 创建成功返回true，否则返回false
     */
    @Override
    public boolean addMeeting(String username, Date startTime, Date endTime) {
        return false;
    }

    /**
     * 删除用户创建的所有会议
     *
     * @return 删除成功返回true，否则返回false
     */
    @Override
    public boolean clear() {
        try {
            user.setMeetings(null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 查询用户在某阶段的所有会议
     *
     * @param startTime 会议的开始时间
     * @param endTime   会议的结束时间
     * @return 用户在会议开始和结束时间内的所有会议
     */
    @Override
    public List<IMeeting> queryMeeting(Date startTime, Date endTime) {
        return null;
    }

    /**
     * 输出帮助菜单
     */
    @Override
    public void help() {

    }

    /**
     * 退出系统
     */
    @Override
    public void quit() {

    }
}
