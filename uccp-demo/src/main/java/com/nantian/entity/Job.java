package com.nantian.entity;

import com.alibaba.druid.sql.visitor.functions.Char;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @project: uccp-practice
 * @ClassName: Job
 * @author:
 * @date: 2021/7/19/0019 11:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job implements Serializable {

    private String JOB_RUN_ID;//作业运行ID
    private String JOB_ID;//作业ID
    private Date START_TIME;//开始日期
    private Date END_TIME;//结束日期
    private String JOB_TYPE;//作业类型
    private String plat;//作业来源
    private String JOB_USER;//执行作业用户
    private String JOB_ROLE;//执行作业角色
    private String JOB_TENANT;//执行作业租户
    private char JOB_STATE;//作业运行状态 0：准备，1：执行，2：结束
    private char JOB_RLT;//作业运行结果 1-正常；0-出错
    private String ERR_INFO;//错误信息
    private String EXEC_ACTION;//执行动作















}
