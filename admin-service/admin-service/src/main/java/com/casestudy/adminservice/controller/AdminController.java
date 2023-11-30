package com.casestudy.adminservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.adminservice.dto.AdminDto;
import com.casestudy.adminservice.service.AdminService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/admin-data")
@RestController
public class AdminController {

	private AdminService adminService;
	
	@PostMapping
	public ResponseEntity<AdminDto> saveAdmin(@RequestBody AdminDto adminDto){
		AdminDto saveAdminDto = adminService.saveAdminAdo(adminDto);
		return new ResponseEntity<>(saveAdminDto,HttpStatus.CREATED);
		
	}
	
	
}
