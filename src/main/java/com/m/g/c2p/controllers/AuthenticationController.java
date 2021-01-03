/**
 * 
 */
package com.m.g.c2p.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author Allam_T
 *
 */
@RestController
public class AuthenticationController implements ErrorController{
	
	static final String ERROR_PAGE = "error";
	
	@RequestMapping("/")
	public ModelAndView welcome ( HttpServletResponse response ) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("welcome");
		
		return modelAndView; 
	}

	@RequestMapping("/error")
	public ModelAndView handleError(HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();

		if(response.getStatus() == HttpStatus.NOT_FOUND.value()) {
			modelAndView.setViewName(ERROR_PAGE);
		}
		else if(response.getStatus() == HttpStatus.FORBIDDEN.value()) {
			modelAndView.setViewName(ERROR_PAGE);
		}
		else if(response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
			modelAndView.setViewName(ERROR_PAGE);
		}
		else {
			modelAndView.setViewName(ERROR_PAGE);
		}

		return modelAndView;
	}

	public String getErrorPath() {
		return "/error";
	}
}