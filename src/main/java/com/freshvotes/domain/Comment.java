package com.freshvotes.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {

    @EmbeddedId
    private CommentId pk;
    private String text;

    public String getText() {
        return text;
    }

    @Column(length = 5000)
    public void setText(String text) {
        this.text = text;
    }

    public CommentId getPk() {
        return pk;
    }

    public void setPk(CommentId pk) {
        this.pk = pk;
    }
}
