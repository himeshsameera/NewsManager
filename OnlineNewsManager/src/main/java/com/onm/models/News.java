/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.models;

/**
 *
 * @author Himesh_2
 */
public class News {
    private String text;
    private String headline;
    private String imgPath;

    /**
     * @return the text
     */
    public News(String headline, String text,String imgPath) {
        this.headline = headline;
        this.text = text;
        this.imgPath=imgPath;
    }
    
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
     * @return the imgPath
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * @param imgPath the imgPath to set
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    
}
