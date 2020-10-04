package com.ems;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerResponse;

@RestController
public class Controller {

	@RequestMapping("/health")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("OK");
	}
}
