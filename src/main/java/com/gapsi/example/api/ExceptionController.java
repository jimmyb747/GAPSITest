package com.gapsi.example.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gapsi.example.api.exception.InternalException;
import com.gapsi.example.api.exception.NotFoundException;
import com.gapsi.example.api.model.ApiResponse;

@ControllerAdvice(basePackageClasses = {ItemApiService.class})
public class ExceptionController {

	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ResponseBody
	public ApiResponse notFoundHandler(NotFoundException nte) {
		return new ApiResponse(nte.getCode(), nte.getMessage());
	}
	
	@ExceptionHandler(InternalException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ApiResponse notFoundHandler(InternalException ie) {
		return new ApiResponse(ie.getCode(), ie.getMessage());
	}
}
