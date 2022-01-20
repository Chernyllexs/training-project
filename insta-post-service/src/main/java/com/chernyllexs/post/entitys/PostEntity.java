package com.chernyllexs.post.entitys;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "posts")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;
    private String userId;
    private String photoId;
    private String postText;
    private ZonedDateTime postDate;

    public PostEntity() {
    }

    public PostEntity(Long postId, String userId, String photoId, String postText, ZonedDateTime postDate) {
        this.postId = postId;
        this.userId = userId;
        this.photoId = photoId;
        this.postText = postText;
        this.postDate = postDate;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public ZonedDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(ZonedDateTime postDate) {
        this.postDate = postDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostEntity that = (PostEntity) o;

        if (!getPostId().equals(that.getPostId())) return false;
        if (!getUserId().equals(that.getUserId())) return false;
        if (!getPhotoId().equals(that.getPhotoId())) return false;
        if (!getPostText().equals(that.getPostText())) return false;
        return getPostDate().equals(that.getPostDate());
    }

    @Override
    public int hashCode() {
        int result = getPostId().hashCode();
        result = 31 * result + getUserId().hashCode();
        result = 31 * result + getPhotoId().hashCode();
        result = 31 * result + getPostText().hashCode();
        result = 31 * result + getPostDate().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PostEntity{" +
                "postId=" + postId +
                ", userId='" + userId + '\'' +
                ", photoId='" + photoId + '\'' +
                ", postText='" + postText + '\'' +
                ", postDate=" + postDate +
                '}';
    }
}