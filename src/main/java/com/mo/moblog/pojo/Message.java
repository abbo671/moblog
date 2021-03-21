package com.mo.moblog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Message
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 11:24
 **/
public class Message {
    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String profile;
    private Date createTime;
    private Long parentMessageId;
    private boolean adminMessage;
    private List<Message> replyMessages = new ArrayList<>();
    private Message parentMessage;
    private String parentNickname;

    public Message() {
    }

    public Message(Long id, String nickname, String email, String content, String profile, Date createTime, Long parentMessageId, boolean adminMessage, List<Message> replyMessages, Message parentMessage, String parentNickname) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.content = content;
        this.profile = profile;
        this.createTime = createTime;
        this.parentMessageId = parentMessageId;
        this.adminMessage = adminMessage;
        this.replyMessages = replyMessages;
        this.parentMessage = parentMessage;
        this.parentNickname = parentNickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getParentMessageId() {
        return parentMessageId;
    }

    public void setParentMessageId(Long parentMessageId) {
        this.parentMessageId = parentMessageId;
    }

    public boolean isAdminMessage() {
        return adminMessage;
    }

    public void setAdminMessage(boolean adminMessage) {
        this.adminMessage = adminMessage;
    }

    public List<Message> getReplyMessages() {
        return replyMessages;
    }

    public void setReplyMessages(List<Message> replyMessages) {
        this.replyMessages = replyMessages;
    }

    public Message getParentMessage() {
        return parentMessage;
    }

    public void setParentMessage(Message parentMessage) {
        this.parentMessage = parentMessage;
    }

    public String getParentNickname() {
        return parentNickname;
    }

    public void setParentNickname(String parentNickname) {
        this.parentNickname = parentNickname;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", profile='" + profile + '\'' +
                ", createTime=" + createTime +
                ", parentMessageId=" + parentMessageId +
                ", adminMessage=" + adminMessage +
                ", replyMessages=" + replyMessages +
                ", parentMessage=" + parentMessage +
                ", parentNickname='" + parentNickname + '\'' +
                '}';
    }
}
