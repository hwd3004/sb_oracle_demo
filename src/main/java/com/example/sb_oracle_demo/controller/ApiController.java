package com.example.sb_oracle_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sb_oracle_demo.service.DummyNoticeService;
import com.example.sb_oracle_demo.service.DummyUserService;


@RestController
public class ApiController {

	@Autowired
	private DummyUserService dummyUserService;

	@Autowired
	private DummyNoticeService dummyNoticeService;

	@GetMapping({ "", "/" })
	public String index() {

		dummyUserService.init();

		dummyNoticeService.init();

		return "index";
	}

}
