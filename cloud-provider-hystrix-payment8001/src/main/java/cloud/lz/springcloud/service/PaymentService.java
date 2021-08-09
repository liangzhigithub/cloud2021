package cloud.lz.springcloud.service;


import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    //正常访问的方法
    public String paymentInfo_OK(Integer id){

        return "线程池: "+Thread.currentThread().getName()+"paymentInfo_OK,id: "+id+"\t"+"hhhhhhh";
    }

    //异常访问方法
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: "+Thread.currentThread().getName()+"paymentInfo_TimeOut,id: "+id+"\t"+"hhhhhhh"+"耗时"+timeNumber+"秒";
    }


}
