
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.DB;

import com.onm.models.Comment;
import com.onm.models.Content;
import com.onm.models.Headline;
import com.onm.models.News;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DB{
    
    
//    private static final String URL = "jdbc:mysql://sql4.freemysqlhosting.net:3306/sql418954";
//    private static final String USERNAME="sql418954";
//    private static final String PASSWORD="hU6*jA1%"; 
    
    private static final String URL = "jdbc:mysql://localhost:3306/newsmanager";
    private static final String USERNAME="root";
    private static final String PASSWORD=""; 
    
    /**
     * Creates the connection to the database.
     **/
    
    private static Connection connect() throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        return con;
    }
    

    public static ResultSet getDBResult(String sql) throws Exception{
            Connection con = connect();
            ResultSet r = con.createStatement().executeQuery(sql);
            return r;
    }
    
    public static boolean verifyLogin(String user,String pass) throws Exception{
        ResultSet r=getDBResult("SELECT user,pass FROM users WHERE user='"+user+"' AND pass='"+pass+"'");
        if(r.next()){
            return true;
        }else{
            return false;
        }
    }

    public static List<Headline> getHeadlines() {
        List<Headline> objects = new ArrayList<Headline>();
        
        try {
            ResultSet r = getDBResult("SELECT * FROM News");
            while(r.next()){
                objects.add(new Headline(r.getString("headline"), r.getString("text")));
            }
        } catch (Exception ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return objects;
    }
    
    public static News getNews(int id){
        try {
            ResultSet r = getDBResult("SELECT * FROM News where id="+id);
                if(r.next()){
                    News news=new News(r.getString("headline"),r.getString("text"),r.getString("imagepath"),new ArrayList<Comment>(),new ArrayList<Content>());
                    return news;
                }
                
        } catch (Exception ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

}

