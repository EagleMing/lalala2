package com.example.eagle.lalala.bean;

import java.io.Serializable;

/**
 * @author yiw
 * @ClassName: CommentItem
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2015-12-28 下午3:44:38
 */
public class CommentItem implements Serializable {

    private String id;
    private User user;
    private User toReplyUser;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getToReplyUser() {
        return toReplyUser;
    }

    public void setToReplyUser(User toReplyUser) {
        this.toReplyUser = toReplyUser;
    }

}
