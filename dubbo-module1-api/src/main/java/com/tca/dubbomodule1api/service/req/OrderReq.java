package com.tca.dubbomodule1api.service.req;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhoua
 * @Date 2019/12/2
 */
@Data
@ToString
public class OrderReq implements Serializable{

    private String name;

    private Double price;

    private Date date;

}
