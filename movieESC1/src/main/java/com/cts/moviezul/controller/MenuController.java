package com.cts.moviezul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

@GetMapping("/hello1")
public String helloMess() {
	return "Hello Client1";
}
}
