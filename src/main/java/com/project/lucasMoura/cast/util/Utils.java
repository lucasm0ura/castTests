package com.project.lucasMoura.cast.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.project.lucasMoura.cast.payloads.ApiResponse;

public class Utils {

	public static ResponseEntity<?> created(Boolean sucess, String message) {
		return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(sucess, message));
	}
	
	public static ResponseEntity<?> deleted(Boolean success, String message) {
		return ResponseEntity.status(410).body(new ApiResponse(success, message));
	}	
	
}
