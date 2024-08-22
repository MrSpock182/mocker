package io.github.mrspock182.mocker.resource.handle;

import io.github.mrspock182.mocker.exception.Unauthorized;
import io.github.mrspock182.mocker.resource.dto.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@RestControllerAdvice
public class RestExceptionHandler {

    @ResponseBody
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String handleInternalServerError(
            final Exception exception,
            final HttpServletRequest request) {
        return "oi";
//        return List.of(new ErrorResponse(500, "Internal Error"));
    }

    @ResponseBody
    @ResponseStatus(UNAUTHORIZED)
    @ExceptionHandler(Unauthorized.class)
    public String handleUnauthorizedError(
            final Unauthorized exception,
            final HttpServletRequest request) {
        return "oi";
//        return List.of(new ErrorResponse(401, "Internal Error"));
    }

}
