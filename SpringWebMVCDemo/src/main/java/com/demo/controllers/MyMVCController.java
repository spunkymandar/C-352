package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyMVCController {
	
	@RequestMapping(value = "welcomeController.htm", method = RequestMethod.GET)
	public ModelAndView welcome() {
		System.out.println("the request received!!");
		String welcome_message="Welcome to wonderful world of books!!";
		return new ModelAndView("welcome","message",welcome_message);
		//ModelAndView(View_name,Model_name,model_object)
		
		//"/WEB-INF/jsps/welcome.jsp"
		
	}

}
/*
HttpRequest
HttpResponse

Request -> Response
GET, 	Post, 		Delte, Head
doGet   doPost()
*/
