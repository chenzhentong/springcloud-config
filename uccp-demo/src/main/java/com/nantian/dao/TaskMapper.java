package com.nantian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nantian.entity.Job;
import com.nantian.entity.Task;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: TaskDao
 * @author:
 * @date: 2021/7/19/0019 11:05
 */
@Mapper
public interface TaskMapper  {
    List<Task> selectTaskById(@Param("taskId")String taskId);
}
