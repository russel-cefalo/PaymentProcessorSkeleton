package com.cefalo.school;

import java.util.Map;

public class DummyPaymentFormHandler implements PaymentFormHandler {
    @Override
    public void handlePaymentFormSubmission(Map<String, String> formdata) {
        System.out.println("TODO");
    }
}
