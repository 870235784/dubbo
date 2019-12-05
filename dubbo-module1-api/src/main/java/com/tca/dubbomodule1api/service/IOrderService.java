package com.tca.dubbomodule1api.service;

import com.tca.dubbomodule1api.service.req.OrderReq;
import com.tca.dubbomodule1api.service.resp.OrderResp;

/**
 * @author zhoua
 * @Date 2019/12/2
 */
public interface IOrderService {

    /**
     * order接口
     * @param req
     * @return
     */
    OrderResp order(OrderReq req);

}
