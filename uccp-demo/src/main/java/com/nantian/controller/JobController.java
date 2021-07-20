package com.nantian.controller;
import com.nantian.entity.Job;
import com.nantian.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @project: uccp-practice
 * @ClassName: JobController
 * @author:
 * @date: 2021/7/19/0019 11:03
 */
@Controller
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("/test")
    @ResponseBody
    public String testJob(){
        return "test job";
    }

    @RequestMapping("/index")
    public String index(){
        return "searchJob";
    }

    @RequestMapping("/search")
//    @ResponseBody
    public String selectByCriteria(@RequestParam("startTime") String startTime,
                                      @RequestParam("plat")String plat,
                                      @RequestParam("jobState") String jobState,
                                      @RequestParam("jobRlt")String jobRlt,
                                      Model model)  throws ParseException{


        DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
        Date date = fmt.parse(startTime);
        Job job = new Job();
        job.setPlat(plat);
        job.setSTART_TIME(date);
        job.setJOB_STATE(jobState.charAt(0));
        job.setJOB_RLT(jobRlt.charAt(0));
        List<Job> jobList = jobService.selectJobByCriteria(job);
        if (jobList== null || jobList.size() == 0) {
            model.addAttribute("info","未找到符合条件的采控作业执行流水信息");
            return "infoNotFound";
        }
        model.addAttribute("jobList",jobList);
        return "jobSearchResult";
    }

}
