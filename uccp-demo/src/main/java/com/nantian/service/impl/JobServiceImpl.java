package com.nantian.service.impl;

import com.nantian.dao.JobMapper;
import com.nantian.entity.Job;
import com.nantian.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: JobServiceImpl
 * @author:
 * @date: 2021/7/19/0019 11:06
 */
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;
    @Override
    public List<Job> selectJobByCriteria(Job job) {
        return jobMapper.selectJobByCriteria(job);
    }
}
