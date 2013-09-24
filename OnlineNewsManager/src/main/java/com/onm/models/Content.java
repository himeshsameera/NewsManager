/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.models;

/**
 *
 * @author Himesh_2
 */
public class Content {
    private int type;
    private String value;

    public Content(int type, String value) {
        this.type = type;
        this.value = value;
    }
    
    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
