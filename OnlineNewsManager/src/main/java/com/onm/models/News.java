/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.models;

import java.util.List;

/**
 *
 * @author Himesh_2
 */
public class News {
    private String text;
    private String headline;
    private List<String> images;
    private List<Comment> comments;
    private List<Content> contents;

    public News(String text, String headline, List<String> images, List<Comment> comments, List<Content> contents) {
        this.text = text;
        this.headline = headline;
        this.images = images;
        this.comments = comments;
        this.contents = contents;
    }
    
      /**
     * @return the text
     */  
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the headline
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * @param headline the headline to set
     */
    public void setHeadline(String headline) {
        this.headline = headline;
    }



    /**
     * @return the comments
     */
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    /**
     * @return the contents
     */
    public List<Content> getContents() {
        return contents;
    }

    /**
     * @param contents the contents to set
     */
    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    /**
     * @return the images
     */
    public List<String> getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(List<String> images) {
        this.images = images;
    }

    
}
