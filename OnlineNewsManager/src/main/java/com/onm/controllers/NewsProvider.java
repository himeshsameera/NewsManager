/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.controllers;

import com.onm.DB.DB;
import com.onm.models.Headline;
import com.onm.models.News;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Himesh_2
 */

@Controller
@RequestMapping("/news/*")
public class NewsProvider {

      
    
	final static Logger logger = LoggerFactory.getLogger(com.onm.controllers.ContentProvider.class);
	@RequestMapping(value = { "head" }, method = RequestMethod.GET)
	public void handleGetProgramsRequest(HttpServletRequest req,
                HttpServletResponse res, Model model) throws Exception {
		logger.debug("Reading Headlines");
		String content ="aaaaaaaaaaaaaaaaaaaaaaaaaa";// JsonConverter.convertToJson(items);
		res.setContentType("application/json;");	
		PrintWriter writer = res.getWriter();
		writer.print(content);
	}
	
        
        
        
	@RequestMapping(value = { "News/{id}" })
	public ModelAndView showNews(HttpServletRequest req,
			HttpServletResponse res, Model model,
			@PathVariable("id") String nid) throws NumberFormatException, Exception {
		logger.debug("Getting a news"+nid);
                
                News news = new News("aaa","sss","ddd");
	//	String news = "bbbbbbbbbbb";///JsonConverter.convertToJson(item1);	
                
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
