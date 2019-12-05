package com.tca.dubbomodule2provider;

import com.tca.dubbomodule1api.service.IOrderService;
import com.tca.dubbomodule1api.service.req.OrderReq;
import com.tca.dubbomodule1api.service.resp.OrderResp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author zhoua
 * @Date 2019/12/5
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        IOrderService orderService = (IOrderService)context.getBean("orderService");

        OrderReq req = new OrderReq();
        req.setDate(new Date());
        req.setName("TCA");
        req.setPrice(38.88D);

        OrderResp orderResp = orderService.order(req);
        System.out.println("调用结果 resp = " + orderResp);
    }
}
