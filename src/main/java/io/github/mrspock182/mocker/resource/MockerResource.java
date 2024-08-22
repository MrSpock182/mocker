package io.github.mrspock182.mocker.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/mocker/v1")
public class MockerResource {

    @ResponseStatus(OK)
    @GetMapping("/auth")
    public String getMessage() {
        return "Success";
    }

}
