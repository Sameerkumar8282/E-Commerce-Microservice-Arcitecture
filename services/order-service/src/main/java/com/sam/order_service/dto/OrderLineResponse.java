package com.sam.order_service.dto;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }
