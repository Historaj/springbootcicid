package com.springbootcicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CICDController {

		@GetMapping("getByName")
		public ResponseEntity<Object> getbyId() {
			return new ResponseEntity<Object>("This Raj", HttpStatus.OK);
		}
		
		@GetMapping("getAll")
		public ResponseEntity<Object> getAll() 
		{
			return new ResponseEntity<Object>("This Raj family", HttpStatus.OK);
		}
		
		@GetMapping("save")
		public ResponseEntity<Object> save() 
		{
			return new ResponseEntity<Object>("Saved successfully", HttpStatus.OK);
		}
		
		@GetMapping("delete")
		public ResponseEntity<Object> delete() 
		{
			return new ResponseEntity<Object>("Deleted successfully", HttpStatus.OK);
		}
}
