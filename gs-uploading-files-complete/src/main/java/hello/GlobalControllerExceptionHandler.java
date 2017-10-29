package hello;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
 

@ControllerAdvice
public class GlobalControllerExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler({RuntimeException.class, Exception.class, IOException.class})
    ResponseEntity<?> handleControllerException(Exception exc, HttpServletRequest request, Throwable ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}

