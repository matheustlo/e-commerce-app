package com.compass.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
       String id,

       @NotNull(message = "Customer First name is required")
       String firstName,

       @NotNull(message = "Customer Last name is required")
       String lastName,

       @Email(message = "Customer Email is not a valid e-mail address")
       String email,


       Address address
) {
}
