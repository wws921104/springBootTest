package com.wws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitor")
public class MonitorController {
	
	@GetMapping("/check")
	public String check() {
		return "SUCCESS";
	}
}
