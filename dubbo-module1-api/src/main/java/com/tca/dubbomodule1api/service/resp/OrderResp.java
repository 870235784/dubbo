package com.tca.dubbomodule1api.service.resp;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zhoua
 * @Date 2019/12/2
 */
@Data
@ToString
public class OrderResp implements Serializable{

    private Integer code;

    private String message;
}
