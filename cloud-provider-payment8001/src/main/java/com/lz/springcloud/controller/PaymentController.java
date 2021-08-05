package com.lz.springcloud.controller;

import com.lz.springcloud.entities.CommonResult;
import com.lz.springcloud.entities.Payment;
import com.lz.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("payment/create")
    public CommonResult create(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        log.info("插入结果："+result);

        if (result>0) {
            return new CommonResult(200,"插入成功",result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }


    @GetMapping("payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果："+payment);

        if (payment!=null) {
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"查询失败,没有对应记录"+id,null);
        }
    }

}
