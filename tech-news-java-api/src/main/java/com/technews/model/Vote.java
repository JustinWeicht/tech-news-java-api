package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")
public class Vote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userId;
    private String postId;

    public Vote() {
    }

    public Vote(Integer id, String userId, String postId) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return Objects.equals(getId(), vote.getId()) && Objects.equals(getUserId(), vote.getUserId()) && Objects.equals(getPostId(), vote.getPostId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserId(), getPostId());
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", postId='" + postId + '\'' +
                '}';
    }
}
