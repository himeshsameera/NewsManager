/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onm.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Himesh_2
 */
@Controller
@RequestMapping("/user/*")
public class LoginCntroller {
        @RequestMapping(value={"login"})
	public ModelAndView authenticateUser(HttpServletRequest req,HttpServletResponse res) throws Exception {
                throw new Exception("Login not yet supported");
	}
}
