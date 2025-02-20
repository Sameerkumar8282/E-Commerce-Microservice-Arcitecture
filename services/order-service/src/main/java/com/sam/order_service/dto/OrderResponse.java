package com.sam.order_service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sam.order_service.model.PaymentMethod;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record OrderResponse(
        Integer id,
        String reference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerId
) {

}
