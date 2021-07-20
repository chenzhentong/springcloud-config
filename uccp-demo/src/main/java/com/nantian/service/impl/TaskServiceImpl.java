package com.nantian.service.impl;

import com.nantian.dao.TaskMapper;
import com.nantian.entity.Task;
import com.nantian.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: TaskServiceImpl
 * @author:
 * @date: 2021/7/19/0019 11:06
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;
    @Override
    public List<Task> selectTaskById(String taskId) {
        return taskMapper.selectTaskById(taskId);
    }
}
