/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.controllers;

import com.onm.DB.DB;
import com.onm.models.Headline;
import com.onm.models.News;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Himesh_2
 */

@Controller
@RequestMapping("/news/*")
public class NewsProvider {
    
    	@RequestMapping(value = { "view/{id}" })
	public ModelAndView showNews(HttpServletRequest req,
			HttpServletResponse res, Model model,
			@PathVariable("id") String nid) throws NumberFormatException, Exception {
                
                News news = DB.getNews(Integer.parseInt(nid));
                
                return new ModelAndView("newsviewer", "news", news);
	}
	
        
        @RequestMapping(value={"headlines"})
        public ModelAndView showHeadlines() {

            List<Headline> objects = DB.getHeadlines();
            ModelAndView mv = new ModelAndView("headlines"); 
            mv.addObject("objects",objects);
            return mv;
        }	

}
