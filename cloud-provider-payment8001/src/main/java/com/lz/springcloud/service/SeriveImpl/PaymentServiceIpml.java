package com.lz.springcloud.service.SeriveImpl;

import com.lz.springcloud.dao.PaymentDao;
import com.lz.springcloud.entities.Payment;
import com.lz.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceIpml implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }



}
