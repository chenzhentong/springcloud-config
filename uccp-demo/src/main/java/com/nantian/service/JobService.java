package com.nantian.service;

import com.nantian.entity.Job;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: JobService
 * @author:
 * @date: 2021/7/19/0019 11:04
 */

public interface JobService {
    List<Job> selectJobByCriteria(Job job);
}
