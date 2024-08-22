package io.github.mrspock182.mocker.resource.dto;

public record ErrorResponse(
        Integer code,
        String message
) {
}