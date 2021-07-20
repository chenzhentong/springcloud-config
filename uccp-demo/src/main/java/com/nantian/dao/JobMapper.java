package com.nantian.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nantian.entity.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: JobDao
 * @author:
 * @date: 2021/7/19/0019 11:04
 */

@Mapper
public interface JobMapper  {

    List<Job> selectJobByCriteria(Job job);
    
}
