package br.com.buritiscript.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class HelloController {
	
	@RequestMapping("/")
	public String hello() {
		return "Relou uordi";
	}
}
