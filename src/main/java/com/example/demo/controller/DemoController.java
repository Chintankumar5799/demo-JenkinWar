package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	public HashMap<String,Integer> hmap=new HashMap<>(); 
	
	@GetMapping("/greeting")
	public String hello(){
		return "hello";
	}
	
	@GetMapping("/response")
	public String response(){
		return "how are you";
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<HashMap<String,Integer>> addUser(@RequestParam String name,@RequestParam int number) {
		hmap.put(name, number);
//		return hmap;
		return new ResponseEntity<>(hmap,HttpStatus.OK);
	}
	
//	@PostMapping("/addUser")
//	public ResponseEntity<HashMap<String,Integer>> addUser(String name,int number) {
//		hmap.put(name, number);
//		return hmap;
//		return new ResponseEntity<>(hmap,HttpStatus.OK);
//	}

}
