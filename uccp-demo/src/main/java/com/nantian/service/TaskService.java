package com.nantian.service;

import com.nantian.entity.Task;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: TaskService
 * @author:
 * @date: 2021/7/19/0019 11:05
 */
public interface TaskService {
    List<Task> selectTaskById(String taskId);
}
