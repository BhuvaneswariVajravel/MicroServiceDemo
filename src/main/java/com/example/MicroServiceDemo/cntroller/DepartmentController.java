package com.example.MicroServiceDemo.cntroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	@GetMapping("/test")
	public String getDepartment() {
		System.out.println("=======get department===");
		return "This is Department service.";
	}
}
