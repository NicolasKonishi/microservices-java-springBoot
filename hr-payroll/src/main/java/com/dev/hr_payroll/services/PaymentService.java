package com.dev.hr_payroll.services;

import com.dev.hr_payroll.enitities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPaymentById(long workerId, int days) {
        return new  Payment("Bob", 120.0, days);

    }
}
