package com.jasdhir.books.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
	@RequestMapping(value = "/available")
	  public String available() {
	    return "Spring in Action";
	  }

	  @RequestMapping(value = "/checked-out")
	  public String checkedOut() {
	    return "Spring Boot in Action";
	  }

}