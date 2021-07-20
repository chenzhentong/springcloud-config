package com.nantian.entity;
import com.alibaba.druid.sql.visitor.functions.Char;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @project: uccp-practice
 * @ClassName: Task
 * @author:
 * @date: 2021/7/19/0019 11:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task{

    private String TASK_ID;//任务运行ID
    private String JOB_RUN_ID;//作业运行ID
    private String JOB_ID;//作业ID
    private String DEV_IP;//设备IP
    private Date START_TIME;//开始日期
    private Date END_TIME;//结束日期
    private char TASK_STATE;//任务运行阶段 0：准备，1：执行，2：结束
    private char TASK_RLT;//任务运行结果 1-正常；0-出错
    private String ERR_INFO;//错误信息


}
