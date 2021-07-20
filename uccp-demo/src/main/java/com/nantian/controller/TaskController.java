package com.nantian.controller;

import com.nantian.entity.Task;
import com.nantian.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: TaskController
 * @author:
 * @date: 2021/7/19/0019 11:04
 */
@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/test")
    @ResponseBody
    public String testJob(){
        return "test task";
    }

    @RequestMapping("/index")
    public String index(){
        return "searchTask";
    }

    @RequestMapping("/search")
//    @ResponseBody
    public String selectById(@RequestParam("id")String id, Model model){
        List<Task> taskList = taskService.selectTaskById(id);
        if (taskList== null || taskList.size() == 0) {
            model.addAttribute("info","未找到编号=" + id + "的任务信息");
            return "infoNotFound";
        }
        model.addAttribute("taskList",taskList);
        return "taskSearchResult";
    }
}
