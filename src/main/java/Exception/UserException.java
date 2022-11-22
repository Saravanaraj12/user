package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserException extends RuntimeException{
	
	@ExceptionHandler
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	public @ResponseBody UserError userErrorHandling(UserError e) {
		return new UserError(HttpStatus.BAD_REQUEST.value(),e.getMessage());
	}

}
