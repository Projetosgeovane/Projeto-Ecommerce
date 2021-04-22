package com.geovane.ecommerce.checkout.service;

import com.geovane.ecommerce.checkout.entity.CheckoutEntity;
import com.geovane.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
