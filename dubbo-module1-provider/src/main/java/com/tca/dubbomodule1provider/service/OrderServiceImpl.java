package com.tca.dubbomodule1provider.service;

import com.tca.dubbomodule1api.service.IOrderService;
import com.tca.dubbomodule1api.service.req.OrderReq;
import com.tca.dubbomodule1api.service.resp.OrderResp;

/**
 * @author zhoua
 * @Date 2019/12/4
 */
public class OrderServiceImpl implements IOrderService {

    public OrderResp order(OrderReq req) {
        System.out.println("调用order方法, req = " + req);
        OrderResp orderResp = new OrderResp();
        orderResp.setCode(200);
        orderResp.setMessage("操作成功!");
        return orderResp;
    }
}
