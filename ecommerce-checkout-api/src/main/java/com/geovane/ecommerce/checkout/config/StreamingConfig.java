package com.geovane.ecommerce.checkout.config;

import com.geovane.ecommerce.checkout.streaming.CheckoutCreatedSource;
import com.geovane.ecommerce.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
