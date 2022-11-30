package com.devseth.batch.batch.Controller;

import com.devseth.batch.batch.request.JobParams;
import com.devseth.batch.batch.service.JobService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("start/{jobName}")
    public String StartJob(@PathVariable String jobName,
                           @RequestBody List<JobParams> jobParamsList) throws Exception{
        jobService.startJob(jobName,jobParamsList);
        return "Job Started .... ";
    }
}
