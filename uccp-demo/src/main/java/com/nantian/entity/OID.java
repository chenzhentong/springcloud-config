package com.nantian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project: uccp-practice
 * @ClassName: OID
 * @author:
 * @date: 2021/7/19/0019 15:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OID {
    private String OID;//OID
    private String OID_NAME;// OID名称
    private char PUB_FLAG;// 是否公有 1公共OID,0私有OID
    private String OID_DEVICE_TYPE;//OID类型 计算机，交换机，路由器，防火墙等
    private String ENTERPRISE;//厂商
    private String OID_DEVICE_CODE;//设备型号
    private String OID_DEVICE_VERSION;//设备版本
    private String DESCRIPTION;//描述

}
