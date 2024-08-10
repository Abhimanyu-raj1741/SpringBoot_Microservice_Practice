package in.ashokit.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
 
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ExInfo> handleException(Exception e){
		
		ExInfo info = new ExInfo();
		info.setExCode("SBI001"); // for every exception the code is given by company 
		info.setExMsg(e.getMessage());
		info.setEx(LocalDate.now());
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
