package com.sam.customer_service.dto;

import com.sam.customer_service.model.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {

}
