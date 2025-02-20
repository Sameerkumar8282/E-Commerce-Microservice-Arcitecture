package com.sam.order_service.dto;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email
) {

}
