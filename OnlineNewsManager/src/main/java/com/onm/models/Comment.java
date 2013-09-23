/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.models;

/**
 *
 * @author Palaa
 */
public class Comment {
    private String comment;

    public Comment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the comment
     */
    
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
