package com.rest.Payroll;

class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Order ID: " + id + " not found.");
    }
}
