package com.jasdhir.novels.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/novels")
public class NovelsController {
	@RequestMapping(value = "/christie")
	  public String detective() {
	    return "The Secret Adversary";
	  }

	  @RequestMapping(value = "/grisham")
	  public String thrillers() {
	    return "The Rain Maker";
	  }

}
